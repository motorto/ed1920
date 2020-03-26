// -----------------------------------------------------------
// Estruturas de Dados 2019/2020 (CC1007) - DCC/FCUP
// http://www.dcc.fc.up.pt/~pribeiro/aulas/edados1920/
// -----------------------------------------------------------
// Exemplo de utilizacao da lista ligada simples
// Ultima alteracao: 01/04/2018
// -----------------------------------------------------------

public class TestSinglyLinkedList {
    public static void main(String[] args) {

	SinglyLinkedList<Integer> list = new SinglyLinkedList<>();


	// Escrevendo lista (no inicio esta vazia)
	System.out.println(list);

	// Verificando se esta vazia
	System.out.println("isEmpty? " + list.isEmpty());     

	for (int i = 1; i < 6 ; i++){
	    list.addLast(i);
	}

	System.out.println(list);
	SinglyLinkedList<Integer> newRes = list.copy();
	System.out.println("LISTA COPIADA "+ newRes);
    }
}
