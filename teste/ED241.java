import java.util.*;

public class ED241{
  public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    int flag = in.nextInt();
    if (flag==1){
      int n = in.nextInt(); 
      String tmp = in.nextLine(); 
      String nomes[] = new String [3]; 
      BSTree<String> t = new BSTree<>();
      for (int i = 0 ; i < n; i++){
        tmp = in.nextLine();
        nomes = tmp.split(" "); // dividir a String pelo espaco
        t.insert(nomes[1]);
      }
      System.out.println (t.numberNodes());
    }
    if (flag == 2){
      int n = in.nextInt(); 
      String tmp = in.nextLine(); 
      String nomes[] = new String [3]; 
      BSTMap<String,Integer> t = new BSTMap<>();
      for (int i = 0 ; i < n; i++){
        tmp = in.nextLine();
        nomes = tmp.split(" ");
        if (t.get(nomes[0]) != null)
          t.put(nomes[0],t.get(nomes[0]) +1 );
        else
          t.put(nomes[0],1);
      }
      int max=0;
      String output="";
      for (String k : t.keys()) {
        if (t.get(k) > max){
          max = t.get(k);
          output = k;
        }
      }
      System.out.println(output +" "+ t.get(output));
    }
  }
  if (flag == 3){
    BSTMap<String,Integer> t = new BSTMap<String,Integer>();
    BSTMap<String,Integer> tcount = new BSTMap<String,Integer>();
    int n = in.nextInt(); 
    String tmp = in.nextLine(); 
    String nomes[] = new String [3]; 
    BSTMap<String,Integer> t = new BSTMap<>();
    for (int i = 0 ; i < n; i++){
      tmp = in.nextLine();
      nomes = tmp.split(" ");
      if (t.get(nomes[0]) != null) {
        t.put(nomes[0],t.get(nomes[0]) +1 );
        if (nomes[2].equals("Accepted");{
          tcount.put(nomes[0],t.get(nomes[0]) +1 );
        }
        else{
        t.put(nomes[0],1);
        if (nomes[2].equals("Accepted")) {
          tcount.put(name,1);
        }
        else {
          tcount.put(name,0);
        }
      }
    }
  }
