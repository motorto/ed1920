/*
Nome: André Filipe Rodrigues Cerqueira 
Número mecanográfico: 201804991 
Sobre ajudas: conversei sobre o metodo maxLevel com a colega Catarina Teixeira
Explicação da solução: 
  internal: verificar se os filhos do no actual nao só nulls, se tal acontecer retornar 1 e as respetivas sub arvore direita +
esquerda.
      Complexidade: O(n) ???
  cut: uma variavel que conta "os niveis" que descemos na arvore quando essa variavel for igual ao nivel a cortar entao por os 
filhos a apontar para null
      Complexidae: O(n) ???
  maxLevel: este foi mais complicado de implementar, antes de mais agradecer a minha colega Catarina Teixeira pela explicação de como chegou a sua solução.
            Entao basicamente criamos um array (valores) com size da altura da arvore. depois uma funcao auxiliar que conta os nos de um certo nivel, no final so criar o array de 2 ints conforme pedido.
      Complexidade: O(n) ???
*/

public class BTree<T> {   
  private BTNode<T> root; // raiz da arvore

  // Construtor
  BTree() {
    root = null;
  }

  // Getter e Setter para a raiz
  public BTNode<T> getRoot() {return root;}
  public void setRoot(BTNode<T> r) {root = r;}

  // Verificar se arvore esta vazia
  public boolean isEmpty() {
    return root == null;
  }

  // --------------------------------------------------------

  // Numero de nos da arvore   
  public int numberNodes() {
    return numberNodes(root);
  }

  private int numberNodes(BTNode<T> n) {
    if (n == null) return 0;
    return 1 + numberNodes(n.getLeft()) + numberNodes(n.getRight());
  }

  // --------------------------------------------------------

  // Altura da arvore
  public int depth() {
    return depth(root);
  }

  private int depth(BTNode<T> n) {
    if (n == null) return -1;
    return 1 + Math.max(depth(n.getLeft()), depth(n.getRight()));
  }

  // --------------------------------------------------------

  // O elemento value esta contido na arvore?
  public boolean contains(T value) {
    return contains(root, value);
  }

  private boolean contains(BTNode<T> n, T value) {
    if (n==null) return false;
    if (n.getValue().equals(value)) return true;
    return contains(n.getLeft(), value) || contains(n.getRight(), value);
  }

  // --------------------------------------------------------

  // Imprimir arvore em PreOrder
  public void printPreOrder() {
    System.out.print("PreOrder:");
    printPreOrder(root);
    System.out.println();
  }

  private void printPreOrder(BTNode<T> n) {
    if (n==null) return;
    System.out.print(" " + n.getValue() );
    printPreOrder(n.getLeft());
    printPreOrder(n.getRight());
  }

  // --------------------------------------------------------

  // Imprimir arvore em InOrder
  public void printInOrder() {
    System.out.print("InOrder:");
    printInOrder(root);
    System.out.println();
  }

  private void printInOrder(BTNode<T> n) {
    if (n==null) return;
    printInOrder(n.getLeft());
    System.out.print(" " + n.getValue());
    printInOrder(n.getRight());
  }

  // --------------------------------------------------------

  // Imprimir arvore em PostOrder
  public void printPostOrder() {
    System.out.print("PostOrder:");
    printPostOrder(root);
    System.out.println();
  }

  private void printPostOrder(BTNode<T> n) {
    if (n==null) return;
    printPostOrder(n.getLeft());
    printPostOrder(n.getRight());
    System.out.print(" " + n.getValue());
  }

  // --------------------------------------------------------

  // Imprimir arvore numa visita em largura (usando TAD Fila)
  public void printBFS() {
    System.out.print("BFS:");

    MyQueue<BTNode<T>> q = new LinkedListQueue<BTNode<T>>();
    q.enqueue(root);
    while (!q.isEmpty()) {
      BTNode<T> cur = q.dequeue();
      if (cur != null) {
        System.out.print(" " + cur.getValue());
        q.enqueue(cur.getLeft());
        q.enqueue(cur.getRight());
      }
    }
    System.out.println();
  }

  // --------------------------------------------------------

  // Imprimir arvore numa visita em profundidade (usando TAD Pilha)
  public void printDFS() {
    System.out.print("DFS:");

    MyStack<BTNode<T>> q = new LinkedListStack<BTNode<T>>();
    q.push(root);
    while (!q.isEmpty()) {
      BTNode<T> cur = q.pop();
      if (cur != null) {
        System.out.print(" " + cur.getValue());
        q.push(cur.getLeft());
        q.push(cur.getRight());
      }
    }
    System.out.println();
  }

  public int internal() {
    return internal(root);
  }

  private int internal(BTNode<T> n){
    if (n==null) return 0;
    if (n.getLeft() == null && n.getRight() == null) return 0 + internal(n.getLeft()) + internal(n.getRight());
    if (n.getLeft() != null || n.getRight() != null) return 1 + internal(n.getLeft()) + internal(n.getRight());
    return 0 + internal(n.getLeft()) + internal(n.getRight());
  }

  public void cut(int d){
    if (d<=0) root = null;
    cut(root,d,1);
  }

  private void cut(BTNode<T> n ,int d, int pos){
    if (n == null) return; 
    if (pos == d){
      n.setLeft(null);
      n.setRight(null);
    }
    cut(n.getLeft(), d, ++pos);
    cut(n.getRight(), d, pos);
  }

  public int[] maxLevel(){
    return maxLevel(root);
  }

 private int[] maxLevel(BTNode<T> n){
   int [] valores = new int[depth()+1];
   aux(root,0,valores);
   int[] resposta = new int[2];
   for (int i = 0; i< valores.length;i++){
     if (valores[i]>resposta[0]){
       resposta[0] = valores[i];
       resposta[1]=1;
     }
     else if (valores[i] == resposta[0])
       resposta[1]++;
  }
  return resposta;
 }

 private void aux(BTNode<T> n, int depth, int[] valores){
   if (n==null) return;
   valores[depth]++;
   aux(n.getLeft(),depth+1,valores);
   aux(n.getRight(),depth+1,valores);
 }


}

