// -----------------------------------------------------------
// Estruturas de Dados 2019/2020 (CC1007) - DCC/FCUP
// http://www.dcc.fc.up.pt/~pribeiro/aulas/edados1920/
// -----------------------------------------------------------
// Lista ligada simples
// Ultima alteracao: 03/04/2018
// -----------------------------------------------------------

public class SinglyLinkedList<T> {
  private Node<T> first;    // Primeiro no da lista
  private int size;         // Tamanho da lista

  // Construtor (cria lista vazia)
  SinglyLinkedList() {
    first = null;
    size = 0;
  }

  // Retorna o tamanho da lista
  public int size() {
    return size;
  }

  // Devolve true se a lista estiver vazia ou falso caso contrario
  public boolean isEmpty() {
    return (size == 0);
  }

  // Adiciona v ao inicio da lista
  public void addFirst(T v) {
    Node<T> newNode = new Node<T>(v, first); 
    first = newNode;
    size++;
  }

  // Adiciona v ao final da lista
  public void addLast(T v) {
    Node<T> newNode = new Node<T>(v, null); 
    if (isEmpty()) {
      first = newNode;
    } else {
      Node<T> cur = first;
      while (cur.getNext() != null)
        cur = cur.getNext();
      cur.setNext(newNode);         
    }
    size++;
  }

  // Retorna o primeiro valor da lista (ou null se a lista for vazia)
  public T getFirst() {
    if (isEmpty()) return null;
    return first.getValue();
  }

  // Retorna o ultimo valor da lista (ou null se a lista for vazia)
  public T getLast() {
    if (isEmpty()) return null;
    Node<T> cur = first;
    while (cur.getNext() != null)
      cur = cur.getNext();
    return cur.getValue();      
  }

  // Remove o primeiro elemento da lista (se for vazia nao faz nada)
  public void removeFirst() {
    if (isEmpty()) return;
    first = first.getNext();
    size--;
  }

  // Remove o ultimo elemento da lista (se for vazia nao faz nada)
  public void removeLast() {
    if (isEmpty()) return;
    if (size == 1) {
      first = null;
    } else {
      // Ciclo com for e uso de de size para mostrar alternativa ao while
      Node<T> cur = first;
      for (int i=0; i<size-2; i++)
        cur = cur.getNext();
      cur.setNext(cur.getNext().getNext());
    }
    size--;
  }

  // Converte a lista para uma String
  public String toString() {
    String str = "{";      
    Node<T> cur = first;
    while (cur != null) {
      str += cur.getValue();
      cur = cur.getNext();
      if (cur != null) str += ",";                     
    }      
    str += "}";
    return str;
  }

  /////////////////////////////
  // Metodos criados por mim //
  /////////////////////////////
  public T get(int pos) {
    Node<T> cur = first;
    if (pos < 0 ) return null;
    if (pos >= size) return null;
    if (pos == 0) return cur.getValue();
    else{
      int tmp = 0;
      while (tmp < pos){
        cur=cur.getNext();
        tmp++;
      }
      return cur.getValue();
    }
  }
  public T remove(int pos){
    if (pos < 0 || pos >= size)  return null;
    Node<T> cur = first;
    T reposta = cur.getValue();
    if (pos == 0){ 
      first = first.getNext();
      size--;
      return reposta;
    }
    int tmp = 0 ;
    while (tmp < pos-1){
      cur = cur.getNext();
      tmp++;
    }
    reposta = cur.getNext().getValue();
    cur.setNext(cur.getNext().getNext());
    size--;
    return reposta ;
  }

  public SinglyLinkedList<T> copy(){
    SinglyLinkedList<T> a = new SinglyLinkedList<>();
    Node<T> cur = this.first;
    a.addFirst(cur.getValue());
    for (int i = 1 ; i < this.size ; i++){
      cur = cur.getNext();
      a.addLast(cur.getValue());
    }
    return a;
  }

  public void duplicate(){
    Node<T> cur = this.first;
    while(cur != null){
      Node<T> novo = new Node<>(cur.getValue(),cur.getNext());
      cur.setNext(novo);
      cur = cur.getNext().getNext();
      size++;
    }
  }

  public int count(T value){
    Node<T> cur = first;
    int tmp = 0;
    while (cur != null){
      if (cur.getValue().equals(value))
        tmp++;
      cur = cur.getNext();
    }
    return tmp;
  }

  public void removeAll(T value){
    Node<T> cur = first;
    if (cur==null) return ;
    while(cur.getNext() != null){
      if (cur.getValue().equals(value)){
        cur.setValue(cur.getNext().getValue());
        cur.setNext(cur.getNext().getNext());
        size--;
      }
      else cur = cur.getNext();
    }
    if (cur.getValue().equals(value))
      removeLast();
  }
}
