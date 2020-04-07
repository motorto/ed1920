// -----------------------------------------------------------
// Estruturas de Dados 2019/2020 (CC1007) - DCC/FCUP
// http://www.dcc.fc.up.pt/~pribeiro/aulas/edados1920/
// -----------------------------------------------------------
// Exemplo de utilizacao da lista ligada simples
// Ultima alteracao: 01/04/2018
// -----------------------------------------------------------

public class TestSinglyLinkedList {
    public static void main(String[] args) {

	SinglyLinkedList<Character> list = new SinglyLinkedList<>();


	System.out.println("Lista antes do remove " + list);
	list.removeAll('a');
	System.out.println("Lista depois do remove " + list);

    }
}
