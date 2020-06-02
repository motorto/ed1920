/*
 * Aqui é a solução do ED188 , terão que adicionar este metodo ao Singly Linked List que o professor dá
 */

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
