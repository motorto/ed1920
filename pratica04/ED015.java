//  Por acabar 
import java.util.Scanner;

class Game{
    final int linhas;
    final int colunas;
    char tabuleiro[][];

    Game(int x,int y){
	linhas = x;
	colunas = y;
	tabuleiro = new char[linhas][colunas];
    }

    void read(Scanner in) {
	for (int i = 0; i < linhas; i++){
	    String buffer = in.next();
	    for (int j=0;j<colunas;j++) {
		tabuleiro[i][j] = buffer.charAt(j);
	    }
	}
    }

    void String () {
	for (int i = 0; i < linhas ; i++){
	    for (int j = 0; j<colunas;j++){
		System.out.printf("%c",tabuleiro[i][j]);
	    }
	    System.out.println();
	}
    }

    boolean checkBounds (int x,int y){
	if (x < 0 || x >= linhas || y < 0 || y >= colunas) return false;
	else return true;
    }

    // Encontra letra a letra e retorna para findWord
    boolean findLetter (String word,int pos){
	for (int i=0;i<linhas ; i++){
	    for (int j=0;j<colunas;j++){
		if (tabuleiro[i][j] == word.charAt(pos))
		    return true;	   
	    }
	}
	return false;
    }

    // Palavra e escreve numa nova matriz
    void findWord (int size,String word) {
	int  letter=0;
	while (letter < size){
	    if (findLetter(word,pos)){
		pos++;
	   }
	   else  throw new java.lang.Error("Can't find word");
	}
}

public class ED015 {
    public static void main (String[] args){
	Scanner in = new Scanner (System.in);
	int linhas = in.nextInt();
	int colunas = in.nextInt();
	Game g = new Game(linhas,colunas);
	g.read(in);
	g.write();
	int n = in.nextInt();
	String word;
	for (int i = 0; i < n ; i++) {
	    word = in.nextLine();
	    g.find(word);
	    g.write();
	    System.out.println();
	}

    }

}
