/*
 * Exercicio extra onde desenho um X 
 *este foi de acordo com os meus colegas o que saiu no ano deles , os de 3 ano disse que saiu um triangulo a ele
 */

import java.util.Scanner;

public class X {
  public static void main (String [] args){
    Scanner in = new Scanner(System.in);
    int linhas = in.nextInt();
    int pontos = 2;
    int offset = 0;
    int espacos =  linhas - 2;

    for (int q = 0 ; q < linhas/2;q++){
      for (int i = 0 ; i < offset ; i++)
        System.out.print(".");
      for (int j = 0 ; j < pontos/2 ; j++)
        System.out.print("#");
      for (int k = 0 ; k < espacos ; k++)
        System.out.print(".");
      for (int j = 0 ; j < pontos/2 ; j++)
        System.out.print("#");
      for (int i = 0 ; i < offset ; i++)
        System.out.print(".");
      offset++;
      espacos-=2;
      System.out.println();
    }

    for (int w = 0 ; w < linhas/2; w++)
        System.out.print(".");
    System.out.print("#");
    for (int w = 0 ; w < linhas/2; w++)
        System.out.print(".");
    System.out.println();
      offset--;
      espacos+=2;

    for (int q = 0 ; q < linhas/2;q++){
      for (int i = 0 ; i < offset ; i++)
        System.out.print(".");
      for (int j = 0 ; j < pontos/2 ; j++)
        System.out.print("#");
      for (int k = 0 ; k < espacos ; k++)
        System.out.print(".");
      for (int j = 0 ; j < pontos/2 ; j++)
        System.out.print("#");
      for (int i = 0 ; i < offset ; i++)
        System.out.print(".");
      offset--;
      espacos+=2;
      System.out.println();
    }

  }
}
