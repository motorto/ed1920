import java.util.*;

public class ED235{
  public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    int numeroTriangulos = in.nextInt();
    for (int r = 0; r<numeroTriangulos ; r++){
      int tamanhoTriangulo= in.nextInt();
      int asteriscos = 1;
      int pontos = tamanhoTriangulo- 1;
      for (int q = 0 ; q < tamanhoTriangulo; q++){
        for (int w = 0; w < asteriscos ; w++)
          System.out.print('#');
        for (int e = 0 ; e < pontos ; e++)
          System.out.print('.');
        System.out.println();
        pontos--;
        asteriscos++;
      }
    }
  }
}
