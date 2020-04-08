import java.util.Scanner;
import java.lang.String;

public class ED006{

    static int convertStringToInt(String a){
	return a.split(" ").length;
    }

    static void game (int players,int words,String names[]){
	CircularLinkedList<String> roda = new CircularLinkedList<>();
	for (int i=1;i<=players;i++){  
	    roda.addLast(names[i]);
	}
	while(roda.size() > 1){
	    for (int i=2;i<=words;i++) {
		roda.rotate();
	    }
	    roda.removeFirst();
	}
	result( roda.getLast() );
    }

    static void result(String a){
	if (a.equals("Carlos")) System.out.println("O Carlos nao se livrou");
	else
	    System.out.println("O Carlos livrou-se (coitado do " + a + "!)"); 
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
	    game(numberPlayers,convertStringToInt(frase) , namePlayer.split(" "));
	}
    }
}
