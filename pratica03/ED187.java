import java.util.Scanner;

class Matrix {
        int data[][]; // os elementos da matriz em si
        int rows;     // numero de linhas
        int cols;     // numero de colunas

        // construtor padrao de matriz
        Matrix(int r, int c) {
                data = new int[r][c];
                rows = r;
                cols = c;
        }

        // Ler os rows x cols elementos da matriz
        public void read(Scanner in) {
                for (int i=0; i<rows; i++)
                        for (int j=0; j<cols; j++)
                                data[i][j] = in.nextInt();
        }

        // Representacao em String da matriz
        public String toString() {
                String ans = "";
                for (int i=0; i<rows; i++) {
                        for (int j=0; j<cols; j++)
                                ans += data[i][j] + " ";
                        ans += "\n";
                }
                return ans;
        }   

        public static Matrix identity(int n){
                Matrix a = new Matrix (n,n);
                for (int i=0 ; i <  a.rows ; i++)
                        a.data[i][i] = 1;
                return a;
        }

        public Matrix transpose(){
                Matrix a = new Matrix (this.cols,this.rows) ;
                for (int i = 0 ; i < a.rows ; i++){
                        for (int j = 0 ; j < a.cols ; j++){
                                a.data[i][j] = this.data[j][i];
                        }
                }
                return a;
        }

        public Matrix sum(Matrix m){
                Matrix b = new Matrix (this.rows,this.cols);
                for (int i = 0 ; i < b.rows ; i++){
                        for (int j = 0 ; j < b.cols ; j++){
                                b.data[i][j] = this.data[i][j] + m.data[i][j];
                        }
                }
                return b;
        }

        public Matrix multiply(Matrix m){
                Matrix p= new Matrix(rows, m.cols);
                for(int i=0;i<rows;i++){
                        for(int j=0; j<p.cols;j++){
                                for(int k=0;k<cols;k++){
                                        p.data[i][j]+=this.data[i][k] * m.data[k][j];
                                }
                        }
                }
                return p;
        }
}
