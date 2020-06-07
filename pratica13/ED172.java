import java.util.*;

public class ED172{
  public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    BSTMap<String,Integer> map = new BSTMap<String,Integer>();
    String[] palavra;
    String tmp;
    while (in.hasNextLine()){
      tmp = in.nextLine();
      palavra = tmp.split(" ");
      for (int i = 0; i < palavra.length; i++) {
        if (map.get(palavra[i]) == null)
          map.put(palavra[i] ,1 );
        else 
          map.put(palavra[i] ,map.get(palavra[i]) + 1 );
      }
    }
    for ( String k : map.keys()) {
      System.out.println(k + ": " + map.get(k));
    }
  }
}
