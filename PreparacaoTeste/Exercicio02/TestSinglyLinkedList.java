// -----------------------------------------------------------
// Estruturas de Dados 2019/2020 (CC1007) - DCC/FCUP
// http://www.dcc.fc.up.pt/~pribeiro/aulas/edados1920/
// -----------------------------------------------------------
// Exemplo de utilizacao da lista ligada simples
// Ultima alteracao: 01/04/2018
// -----------------------------------------------------------

public class TestSinglyLinkedList {
   public static void main(String[] args) {

      // Criacao de lista de inteiros
      SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
      // Adicionando numeros de 1 a 5 ao final da lista
      for (int i=2; i<=10; i+=2)
         list.addLast(i);
      System.out.println(list);
      System.out.println(list.get(0));
      System.out.println(list.get(1));
      System.out.println(list.get(2));
      System.out.println(list.get(3));
      System.out.println(list.get(4));
      System.out.println(list.get(5));
      System.out.println(list.get(-1));
      System.out.println(list.get(6));
   }
}
