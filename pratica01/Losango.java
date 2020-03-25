import java.util.Scanner;

public class Losango { 

        static void losango(int n){
                int espacos=n/2;
                int cardinais=1;
                for (int j=0;j<n/2+1;j++){
                        for(int i=0;i<espacos;i++){
                                System.out.print(".");
                        }
                        for(int i=0;i<cardinais;i++){
                                System.out.print("#");
                        }
                       System.out.println();
                        espacos--;
                        cardinais+=2;
                } 
                cardinais-=2;
                espacos++;
                for(int j=0;j<n/2;j++){
                        espacos++;
                        cardinais-=2;
                        for(int i=0;i<espacos;i++){
                                System.out.print(".");
                        }
                        for(int i=0;i<cardinais;i++){
                                System.out.print("#");
                        }
                       System.out.println();
                }

                
        }

        public static void main (String[] args){
                Scanner ler = new Scanner(System.in);
		int i = new integer (42);
		System.out.println(i);
                int size = ler.nextInt();
                losango(size);
        }

}

