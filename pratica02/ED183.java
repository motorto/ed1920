import java.util.Scanner;

public class ED183 {

        public static void main(String[] args){
                Scanner stdin = new Scanner (System.in);
                int size = stdin.nextInt();
                int soma=stdin.nextInt(),amplitude,max=soma,min=soma;
                for (int i=1; i<size;i++){
                        int a=stdin.nextInt();
                        soma+=a;
                        if (max<a)
                                max=a;
                        else if (min>a)
                                min=a;
                }
                float sum = soma;
                float siz = size;
                amplitude = max - min ;
                System.out.printf("%.2f\n",sum/size);
                System.out.println(amplitude) ;
        }
}
