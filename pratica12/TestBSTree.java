class TestBSTree {
  public static void main(String[] args) {

    // Criacao da Arvore
    BSTree<Integer> t = new BSTree<>();

    // Inserindo 11 elementos na arvore binaria de pesquisa
    int[] data = {6,3,10,1,4,8,42,2,7,23,54};
    for (int i=0; i<data.length; i++) t.insert(data[i]);

    // Escrever resultado de chamada a alguns metodos

   System.out.println("Count 5,44 = " + t.countBetween(5,44));
   System.out.println("Count 7,10 = " + t.countBetween(7,10));
   System.out.println("Count 0,90 = " + t.countBetween(0,90));
   System.out.println("Count 60,80 = " + t.countBetween(60,80));
   System.out.println("Count 8,54 = " + t.countBetween(8,54));
   System.out.println("Count 2,22 = " + t.countBetween(2,22));
   System.out.println("Count 2,2 = " + t.countBetween(2,2));
  }
}
