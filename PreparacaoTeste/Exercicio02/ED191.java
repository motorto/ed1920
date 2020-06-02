public void duplicate(){
    Node<T> cur = this.first;
    while(cur != null){
      Node<T> novo = new Node<>(cur.getValue(),cur.getNext());
      cur.setNext(novo);
      cur = cur.getNext().getNext();
      size++;
    }
  }


