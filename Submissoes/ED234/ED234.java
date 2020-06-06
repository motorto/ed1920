/*
Nome: André Cerqueira
Número mecanográfico: 201804991
Sobre ajudas: O colega Antonio Cunha que me introduziu a class Collection
O(n) em tudo acho ...
*/
import java.util.*;

public class ED234{
  public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    int flag = in.nextInt();
    if (flag==1){ 
      int n = in.nextInt(); // Ler Numero de Filmes
      String tmp = in.nextLine(); //Leitor de Frases
      String filmes[] = new String [2]; // Vetor que vai divir string FILME - NOTA
      BSTree<String> t = new BSTree<>(); 
      for (int i = 0 ; i < n; i++){
        tmp = in.nextLine();
        filmes = tmp.split(" "); // dividir a String pelo espaco
        t.insert(filmes[0]);
      }
      System.out.println (t.numberNodes()); 
    }
    else if (flag==2){
      int n = in.nextInt(); // Ler Numero de Filmes
      BSTMap<String,Integer> t = new BSTMap<>();
      for (int i =0 ; i < n ; i++){
        String title = in.next();
        int review = in.nextInt();
        if (t.get(title) != null) {
          int tmp = t.get(title);
          t.put(title,++tmp);
        }
        else
          t.put(title,1);
      }
      int max = 0;
      String Maxfilme = "";
      for (String s : t.keys()){
        if (t.get(s) > max){
          max = t.get(s);
          Maxfilme = s;
        }
      }
      System.out.println(Maxfilme + " " + max);
    }
    else if (flag==3){
      int n = in.nextInt(); // Ler Numero de Filmes
      BSTMap<String, Integer> t1 = new BSTMap<String, Integer>();
      BSTMap<String, Integer> t2 = new BSTMap<String, Integer>();
      for (int i = 0; i < n; i++) {
        String key = in.next();
        int sum = in.nextInt();
        if (t1.get(key) != null) {
          int val = t1.get(key);
          val++;
          t1.put(key, val);
          if (t2.get(key) != null) {
            int tmp = t2.get(key);
            t2.put(key, tmp+sum);
          }
        }
        else{
          t1.put(key, 1);
          t2.put(key, sum);
        }
      }
      ArrayList<String> last = new ArrayList<String>();
      for(String s : t1.keys()){
        int v1 = t2.get(s);
        int v2 = t1.get(s);
        int result = v1/v2;
        if (result >= 5) {
          last.add(s);
        }
      }
      Collections.sort(last);
      for (int i = 0; i < last.size(); i++) {
        System.out.println(last.get(i));
      }

    }
    else System.out.println("Flag deinonhecida");
  }
}
