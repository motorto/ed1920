import java.util.Scanner;

public class ReadNumbers {

        // Escrever os numeros guardados num array no stdout
        static void writeArray(int v[], int maior,int menor) {
                for (int i=0; i<v.length; i++)          
                        System.out.println("v[" + i + "] = " + v[i]);      
                System.out.println("maior: " + maior);
                System.out.println("menor: " + menor);
                System.out.println("Amplitude: " + (maior - menor));
        }

        public static void main(String[] args) {

                Scanner stdin = new Scanner(System.in);

                int v[] = new int[10];     // Cria um novo array com espaço para 10 inteiros           
                int n = stdin.nextInt();   // Ler a quantidade de numeros que se seguem

                v[0] = stdin.nextInt();
                int maior=v[0];
                int menor=v[0];
                for (int i=1; i<n; i++){    // Ler os numeros a partir do stdin
                        v[i] = stdin.nextInt();
                        if (maior<v[i])
                                maior=v[i];
                        else if (menor>v[i])
                                menor=v[i];
                        
                }
                        
                writeArray(v,maior,menor);             // Chamar procedimento que escreve
        }
}
