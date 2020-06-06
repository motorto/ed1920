// Meter funcoes no BSTree.java dado pelo professor

public T minValue(){
  return minValue(root);
}

private T minValue(BSTNode<T> n){
  if (n.getLeft() == null) return n.getValue();
  else 
    return minValue(n.getLeft());
}

public T maxValue(){
  return maxValue(root);
}

private T maxValue(BSTNode<T> n){
  if (n.getRight() == null ) return n.getValue();
  else  
    return maxValue(n.getRight());
}
