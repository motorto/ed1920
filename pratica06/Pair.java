public class Pair {
    private int x,y;

    Pair(int a,int b){
	x = a;
	y = b;
    }
    
    public String toString() {
	String str = "[";
	str+=x ; str+=','; str+=y;
	str+= "]";
	return str;
    }
}
