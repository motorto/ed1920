import java.util.Scanner;

public class ED121{
        static boolean palindromo(String str){
                int size = str.length()-1;
                for (int i=0;i<size;i++){
                        if(str.charAt(i) != str.charAt(size))
                                return false;
                        size --;
                }
                return true;
        }

        public static void main (String[] args){
                Scanner ler = new Scanner(System.in);
                int frases = ler.nextInt();
                for (int i=0;i<frases;i++){
                        String str = ler.nextLine();
                        if ( palindromo(str) )
                                System.out.println("sim");
                        else
                                System.out.println("nao");
                }
        }
}
