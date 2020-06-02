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
