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

