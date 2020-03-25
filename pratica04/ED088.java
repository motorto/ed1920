/* -----------------------------------
   Estruturas de Dados 2018/2019
   Jogo da Vida [ED088]  
   ----------------------------------- */

import java.util.Scanner;

// Classe para representar um jogo
class Game {
        final char DEAD  = '.';  // Constante que indica uma celula morta
        final char ALIVE = 'O';  // Constante que indica uma celula viva
        private int rows, cols;  // Numero de linhas e colunas
        private char m[][];      // Matriz para representar o estado do jogo

        // Construtor: inicializa as variaveis tendo em conta a dimensao dada
        Game(int r, int c) {
                rows = r;
                cols = c;
                m = new char[r][c];
        }

        // Metodo para ler o estado inicial para a matriz m[][]
        public void read(Scanner in) {
                for (int i=0; i<rows; i++)
                        m[i] = in.next().toCharArray();
        }

        // Metodo para escrever a matriz m[][]
        public void write() {
                for (int i= 0 ; i < rows ; i++){
                        for (int j=0; j < cols;j++){
                                System.out.printf("%c",m[i][j]);
                        }
                        System.out.println();
                }
        }

        private boolean checkBounds(int x,int y){
                if (x<0 || y<0 || x>=rows || y>=cols)
                        return true;
                else 
                        return false;
        }

        // Deve devolver o numero de celulas vivas que sao vizinhas de (x,y)
        private int countAlive(int x, int y) {
                int count = 0;
                for (int i=x-1;i<x+2;i++){
                        for (int j=y-1;j<y+2;j++){
                                if (checkBounds(i,j))
                                        continue;
                                if (i==x && j==y)
                                        continue;
                                else if (m[i][j] == 'O')
                                        count++;
                        }
                }
                return  count;
        }

        // Deve fazer uma iteracao: cria nova geracao a partir da actual
        public void iterate() {
                char m2[][] = new char[rows][cols]; 
                for(int i=0;i<rows;i++){
                        for(int j=0;j<cols;j++){
                                if (countAlive(i,j) <=1 && m[i][j]=='O')
                                        m2[i][j]='.';
                                else if (countAlive(i,j) >= 4 && m[i][j]=='O')
                                        m2[i][j] = '.';
                                else if ((countAlive(i,j) <= 3 || countAlive(i,j) >= 2) && m[i][j]=='O')
                                        m2[i][j] = 'O';
                                else if (countAlive(i,j)==3 && m[i][j] == '.')
                                        m2[i][j] = 'O';
                                else 
                                        m2[i][j] = '.';
                        }
                }
                for (int i=0; i < rows ; i++){
                        for (int j=0; j< cols ; j++) {
                                m[i][j]=m2[i][j];
                        }
                }
        }
}

// Classe principal com o main()
public class ED088 {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                // Ler linhas, colunas e numero de iteracoes
                int rows = in.nextInt();
                int cols = in.nextInt();
                int n    = in.nextInt();

                // Criar objecto para conter o jogo e ler estado inicial
                Game g = new Game(rows, cols);
                g.read(in);
                for (int i=0;i<n;i++){
                        g.iterate();
                }
                g.write();
        }

}

