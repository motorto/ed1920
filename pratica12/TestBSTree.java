class TestBSTree {
  public static void main(String[] args) {

    // Criacao da Arvore
    BSTree<Integer> t = new BSTree<>();
    BSTree<Integer> t2 = new BSTree<>();
    BSTree<Integer> t3 = new BSTree<>();
    BSTree<Integer> t4 = new BSTree<>();

    // Inserindo 11 elementos na arvore binaria de pesquisa
    int[] data = {5,3,10,1,4,7,42};
    int[] data2 = {7,5,9,6,8,10};
    int[] data3 = {5,4,8,2,7};
    int[] data4 = {5,3,7,1,2,6,8};

    for (int i=0; i<data.length; i++) t.insert(data[i]);
    for (int i=0; i<data2.length; i++) t2.insert(data2[i]);
    for (int i=0; i<data3.length; i++) t3.insert(data3[i]);
    for (int i=0; i<data4.length; i++) t4.insert(data4[i]);

    // Escrever resultado de chamada a alguns metodos

   System.out.println("1:  " + t.valid());
   System.out.println("2:  " + t2.valid());
   System.out.println("3:  " + t3.valid());
   System.out.println("4:  " + t4.valid());
  }
}
