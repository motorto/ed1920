import java.util.Arrays;

class MyIntSet implements IntSet {
    int size;
    boolean iselem[];

    MyIntSet(){
	iselem = new boolean[1000];
	size = 0;
    }
    MyIntSet(int maxValue){
	iselem = new boolean[maxValue];
	size = 0;
    }

    // Retorna true se x está no conjunto
    public boolean contains(int x) {
	if(iselem[x]) return true;
	else return false ;
    }

    public boolean add(int x){
	if ( iselem[x] == true)
	    return false;
	else{
	    iselem[x] = true;
	    size++;
	    return true;
	}
    }

    public boolean remove(int x){
	if ( iselem[x] == false)
	    return false;
	else{
	    iselem[x] = false;
	    size--;
	    return true;
	}
    }

    public int  size(){
	return size;
    }

    public void clear () {
	for (int i = 0; i < iselem.length; i++){
	    iselem[i] = false;
	}
	size=0;
    }
}
