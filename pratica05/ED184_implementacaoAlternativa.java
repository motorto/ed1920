// Interface que define o TAD conjunto de números inteiros

class MyIntSet implements IntSet {
    int size;
    int set[];

    MyIntSet(){
	size=0;
	set = new int[100];
    }

    public boolean contains(int x) {
	for(int i=0; i<size; i++) {
	    if (set[i] == x)
		return true;
	}
	return false;
    }

    public boolean add(int x) {
	if(contains(x))
	    return false;
	else {
	    set[size++] = x;
	    return true;
	}
    }

    public boolean remove(int x) {
	for(int i=0;i<size;i++){
	    if(set[i] == x) {
		for(int j=i;j<size;j++){
		    set[j]=set[j+1];
		}
		size--;
		return true;
	    }
	}
	return false;
    }

    public int size() {
	return size;
    }

    public void clear() {
	for (int i = 0; i<size;i++)
	    set[i] = 0;
	size=0;
    }
}

public class ED184{
    public static void main(String[] args) {
	IntSet s = new MyIntSet(); // Chama o construtor padrão

	s.clear();
	System.out.println(s.size());      // Escreve "0"

	System.out.println(s.add(1));      // Escreve "true"
	System.out.println(s.add(5));      // Escreve "true"
	System.out.println(s.add(7));      // Escreve "true"
	System.out.println(s.add(1));      // Escreve "false"
	System.out.println(s.size());      // Escreve "3

	System.out.println(s.remove(5));   // Escreve "true"
	System.out.println(s.remove(5));   // Escreve "false"
	System.out.println(s.size());      // Escreve "2"

	System.out.println(s.contains(1)); // Escreve "true"
	System.out.println(s.contains(2)); // Escreve "false"

	s.clear();
	System.out.println(s.size());      // Escreve "0"
    }
}

