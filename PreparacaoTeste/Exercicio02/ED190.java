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
