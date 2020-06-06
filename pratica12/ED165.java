import java.util.Scanner;

public class ED165{

  public static void main (String [] args){
    Scanner in = new Scanner(System.in);
    BSTree<Integer> t = new BSTree<>();
    int n = in.nextInt();
    int conjunto[] = new int[n];
    int pergunta;
    for (int i = 0; i < n ; i++){
      conjunto[i] = in.nextInt();
    }
    for (int w = 0 ; w < n ; w++){
      for (int e = 1 ; e < n ; e++){
        t.insert(conjunto[w] + conjunto[e]);
      }
    }
    n = in.nextInt();
    for (int q = 0 ; q < n ; q++){
      pergunta = in.nextInt();
      if(t.contains(pergunta)) System.out.println(pergunta + ": sim");
      else System.out.println(pergunta + ": nao");
    }
  }
}
