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
    list.addLast(8);
    list.addLast(8);
    list.addLast(1);
    list.addLast(2);
    list.addLast(8);
    list.addLast(2);
    System.out.println(list);
    list.removeAll(2);
    System.out.println(list);
  }
}
