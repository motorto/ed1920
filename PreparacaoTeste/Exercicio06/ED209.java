// Inserir estas funcoes no BSTree dado pelo o professor 

public int countBetween(T a, T b){
  return countBetween(root,a,b);
}

private int countBetween(BSTNode<T> n ,T a, T b ){
  if (n == null ) return 0;
  else if (n.getValue().compareTo(a) < 0) return 0 + countBetween(n.getRight(),a,b) ;
  else if (n.getValue().compareTo(b) > 0)  return 0 +countBetween(n.getLeft(),a,b) ;
  else  return 1 + countBetween(n.getRight(),a,b) + countBetween(n.getLeft(),a,b) ;
}

