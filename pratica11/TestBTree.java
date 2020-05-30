// -----------------------------------------------------------
// Estruturas de Dados 2019/2020 (CC1007) - DCC/FCUP
// http://www.dcc.fc.up.pt/~pribeiro/aulas/edados1920/
// -----------------------------------------------------------
// Exemplo de utilizacao da uma arvore binaria
// Ultima alteracao: 26/04/2018
// -----------------------------------------------------------

import java.util.Scanner;

public class TestBTree {
   public static void main(String[] args) {
      // Ler arvore de inteiros em preorder
      Scanner in = new Scanner(System.in);
      BTree<Integer> t = LibBTree.readIntTree(in);
      System.out.println("numberLeafs: " +  t.numberLeafs() ); 	
   }
}
