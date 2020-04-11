import java.util.*;

public class ED197 {

    public static MyQueue<Integer> merge(MyQueue<Integer> a, MyQueue<Integer> b){
	MyQueue<Integer> m = new LinkedListQueue<Integer>();
	int temp1=a.dequeue(); int temp2=b.dequeue();
	boolean flag1=true, flag2=true;
	while(a.size()!=0 || b.size()!=0) {
	    if((a.size()!=0) && (flag1==false)){
		temp1=a.dequeue();
		flag1=true;
	    }
	    if((b.size()!=0) && (flag2==false)){
		temp2=b.dequeue();
		flag2=true;
	    }
	    if(temp1 <= temp2 && flag1==true){
		m.enqueue(temp1);
		flag1=false;
	    }
	    else if (temp2 < temp1 && flag2==true){
		m.enqueue(temp2);
		flag2=false;
	    }
	    else if (flag2==false){
		m.enqueue(temp1);
		flag1=false;
	    }
	    else if (flag1==false){
		m.enqueue(temp2);
		flag2=false;
	    }


	    /*
	     *            System.out.println("M: " + m);
	     *            System.out.println("temp1: " + temp1);
	     *            System.out.println("temp2: " + temp2);
	     *            System.out.println("a: " + a);
	     *            System.out.println("b: " + b);
	     *            System.out.println( );
	     *
	     */
	}
	if (flag1==true){
	    m.enqueue(temp1);
	    flag1=false;
	}

	if (flag2==true){
	    m.enqueue(temp2);
	    flag2=false;
	}

	return m;
    }

    /*
     *    public static void main (String[] args){
     *        MyQueue<Integer> M = new LinkedListQueue<>();
     *        MyQueue<Integer> a = new LinkedListQueue<>();
     *        MyQueue<Integer> b = new LinkedListQueue<>();
     *
     *        a.enqueue(2);
     *        a.enqueue(4);
     *        a.enqueue(8);
     *        a.enqueue(10);
     *
     *        b.enqueue(1);
     *        b.enqueue(4);
     *        b.enqueue(9);
     *
     *        System.out.println(a);
     *        System.out.println(b);
     *
     *        System.out.println();
     *        System.out.println("CICLO");
     *        M = teste(a,b);
     *
     *        System.out.println();
     *        System.out.println("FINAL");
     *        System.out.println("M: " + M );
     *        System.out.println("A: " + a);
     *        System.out.println("B: " +b);
     *    }
     */
}
