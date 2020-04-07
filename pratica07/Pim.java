/*  TODO 
 *
 *  Disposição da circular linked list esta errada
 *
 */
import java.util.Scanner;
import java.lang.String;

public class Pim {

    static int convertStringToInt(String a){
	return a.split(" ").length;
    }

    static void game (int players,int words,String names){
	System.out.println(words);
	CircularLinkedList<Integer> roda = new CircularLinkedList<>();
	for (int i=1;i<=players;i--){  
	    roda.addFirst(i);
	}
	for (int j=0;j<players-2;j++){ // iterações #players - 1
	    for (int i=0;i<words;i++) 
		roda.rotate();
	}
	result(roda.getLast() , names.split("[^a-zA-Z]"));
    }

    static void result(int n, String a[]){
	for (int i=0; i < a.length ; i++)
	    System.out.println(a[i]);
	System.out.println("Perdeu o/a " + a[n] + " " + n);
    }


    public static void main(String[] args){
	Scanner read = new Scanner(System.in);
	int n = read.nextInt();
	String frase = new String();
	frase = read.nextLine();
	String namePlayer = new String();
	for (int i=0;i<n;i++){
	    frase = read.nextLine();
	    int numberPlayers = read.nextInt(); 
	    namePlayer= read.nextLine();
	    game(numberPlayers,convertStringToInt(frase) , namePlayer);
	}
    }
}
