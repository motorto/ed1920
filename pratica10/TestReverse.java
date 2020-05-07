// -----------------------------------------------------------
// Estruturas de Dados 2019/2020 (CC1007) - DCC/FCUP
// http://www.dcc.fc.up.pt/~pribeiro/aulas/edados1920/
// -----------------------------------------------------------
// Invertendo um array (versao recursiva)
// Ultima alteracao: 21/04/2018
// -----------------------------------------------------------

import java.util.Arrays;

public class TestReverse {

  // array representa uma capicua
  static boolean capicua(int v[], int start, int end){
    if (start == end ) return true; //caso base
    if (v[start] != v[end] ) return false;
    if (start<=end) return capicua(v,start+1,end-1);
    return true;
  }

  // Inverter array v entre posicoes start e end
  static void reverse(int v[], int start, int end) {
    if (start>=end) return;     // Caso base: array de tamanho < 2
    int tmp = v[start];         // Trocar primeiro com ultimo
    v[start] = v[end];
    v[end] = tmp;
    reverse(v, start+1, end-1); // Chamada recursiva para o resto
  }

  // -----------------------------------------------------------

  public static void main(String[] args) {

    int v[] = {1,2,3,2,1};
    System.out.println("1-Verificar se é CAPICUA: " + capicua(v, 0, 4) );

    int h[] = {5,8,8,5};
    System.out.println("2-Verificar se é CAPICUA: " + capicua(h, 0, 3) );

    int x[] = {1,2,3,1};
    System.out.println("3-Verificar se é CAPICUA: " + capicua(x, 0, 3) ) ;

    int z[] = {5,8,7,5};
    System.out.println("4-Verificar se é CAPICUA: " + capicua(z, 0, 3) );

  }
}

