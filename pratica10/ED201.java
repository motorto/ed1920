import java.util.*;

/* TODO
 *
 * Fazer subconjuntos , perguntar a implementação da aula
 *
 */

public class ED201{

  public static int solve (int v[],int max){

    // Gerar Subconjunto
    if ( (Sumset > CurrentSum) && (Sumset <= max) ) CurrentSum = Sumset ;
    // Chamada recursiva
    return Sumset;
  }

  public static void main (String[] args){
    Scanner read = new Scanner(System.in);
    int Tviagem = read.nextInt();
    int Nmusicas= read.nextInt();
    int musica[] = new int [Nmusicas];
    for (int i = 0 ; i < Nmusicas ; i++) musica[i] = read.nextInt();
    System.out.println("A Resposta é: " + printSubsets(musica));
  }

}
