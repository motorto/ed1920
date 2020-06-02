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
