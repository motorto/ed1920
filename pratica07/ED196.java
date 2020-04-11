import java.util.*;

public class ED196{
    public static void process(MyQueue<String> q, MyQueue<String> a, MyQueue<String> b){
	String conteudo[] = new String[2];
	while (q.size()!=0){
	    int i=1;
	    conteudo[i-1]=q.dequeue();
	    conteudo[i] = q.dequeue();
	    if (conteudo[1].equals("A"))
		a.enqueue(conteudo[0]);
	    else if (conteudo[1].equals("B"))
		b.enqueue(conteudo[0]);
	    else if (conteudo[1].equals("X")){
		if (a.size() < b.size())
		    a.enqueue(conteudo[0]);
		else if ( b.size() < a.size ())
		    b.enqueue(conteudo[0]);
	    }
	    else
		continue ;
	}
    }
}
