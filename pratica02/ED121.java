import java.util.Scanner;

public class ED121{

        static boolean palindromo (String str){  //verifica se é palindrome
                str = str.toLowerCase();
                str = str.replaceAll("[^a-z]","");
                int size = str.length()-1;
                for(int i=0 ;i<size;i++){
                        if (str.charAt(i) != str.charAt(size))
                                return false;
                        size-- ;
                }
                return true; 
        }

        public static void main (String[] args){
                Scanner ler = new Scanner(System.in);
                int number = ler.nextInt();
                System.out.println(number);
                String str = new String ();
                str = ler.nextLine();
                for (int i=0 ; i< number ; i++){
                        str = ler.nextLine();
                        if (palindromo(str))
                                System.out.println("sim");
                        else 
                                System.out.println("nao");
                }
        }
}
