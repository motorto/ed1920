import java.util.Scanner;

class ED164{
  public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String nome ;
    BSTree<String> t = new BSTree<>();
    nome = in.nextLine();
    for (int i = 0 ; i < n ; i++){
      nome = in.nextLine();
      t.insert(nome);
    }
    System.out.println(t.numberNodes());
  }
}
