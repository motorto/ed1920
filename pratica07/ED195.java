import java.util.*;
public class ED195 {
    public static boolean balanced(String s){
	MyStack<Character> a = new LinkedListStack<>();
	for (int i=0;i<(s.length());i++){
	    if (s.charAt(i) == '(' )
		a.push(s.charAt(i) );

	    else if(s.charAt(i) ==  '[')
		a.push(s.charAt(i) ) ;

	    else if(s.charAt(i) == ']'){
		if (a.size() == 0)
		    a.push(s.charAt(i) );
		else if(a.top() == '[')
		    a.pop();
	    }

	    else if(s.charAt(i) == ')' ){
		if (a.size()==0) 
		    a.push(s.charAt(i) );
		else if(a.top() == '(')
		    a.pop();
	    }
	}
	if (a.size() == 0) return true;
	else	return false;
    }

    public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	int n = read.nextInt();
	String sentence = new String();
	sentence = read.nextLine();
	for (int i = 0; i < n ; i++){
	    sentence = read.nextLine();
	    System.out.println(balanced(sentence));

	}
    }
}
