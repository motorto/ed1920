import java.util.Scanner;

class ED120 {
  public static void main (String [] args){
    Scanner in = new Scanner(System.in);
    int linha = in.nextInt();
    int pontos = linha/2;
    int asteriscos = linha - (pontos * 2 );

    for (int q=0 ; q<linha/2; q++){
      for (int i = 0 ; i < pontos ; i++ )
        System.out.print(".");
      for (int j = 0; j < asteriscos ;j++)
        System.out.print("#");
      for (int i = 0 ; i < pontos ; i++ )
        System.out.print(".");
      System.out.println();
      asteriscos+=2;
      pontos--;
    }
    for (int w = 0 ; w < linha ; w++)
      System.out.print("#");
    System.out.println();
    asteriscos-=2;
    pontos++;
    for (int e=0 ; e<linha/2; e++){
      for (int i = 0 ; i < pontos ; i++ )
        System.out.print(".");
      for (int j = 0; j < asteriscos ;j++)
        System.out.print("#");
      for (int i = 0 ; i < pontos ; i++ )
        System.out.print(".");
      System.out.println();
      asteriscos-=2;
      pontos++;
    }
  }
}
