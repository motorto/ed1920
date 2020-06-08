import java.util.Scanner;

class Process {
  String name ; 
  int time;

  public Process(String a , int b) {
    time = b;
    name = a;
  }
}

public class ED237 {
  public static void main (String [] args){
    Scanner in = new Scanner (System.in);
    int tempo = in.nextInt();
    int Nprocessos = in.nextInt();
    String nome = in.nextLine();
    int tmp;
    Process tmp2;
    CircularLinkedList<Process> list = new CircularLinkedList<>();
    for (int q = 0 ; q < Nprocessos ; q++){
      nome = in.next();
      tmp = in.nextInt();
      tmp2 = new Process (nome, tmp);
      list.addLast(tmp2);
    }
    // resolver exercicio
    int iteracoes=0;
    int time=0;
    while (list.size() > 0) {
      ++iteracoes;
      tmp2 = list.getFirst();
      list.removeFirst();
      if (tmp2.time > tempo ){
        time+=tempo;
        tmp2.time -= tempo;
        list.addLast(tmp2);
      }
      else if (tmp2.time <= tempo){
        time+=tmp2.time;
        System.out.println(tmp2.name +" " + time + " " + iteracoes);
      }
    }
  }
}
