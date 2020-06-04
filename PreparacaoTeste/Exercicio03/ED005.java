import java.util.Scanner;
import java.util.Stack;

public class ED005{

  public static void calculadora(Stack numeros,String operacao){
    int a = numeros.pop();
    int b = numeros.pop();
    int c ;
    if (operacao == "+")  c = a + b;
    else if (operacao == "*")  c = a * b;
    else if (operacao == "-")  c = a - b;
    else if (operacao == "/")  c = a / b;
    numeros.push(c);
  }


  public static void main (String [] args){
    Scanner in = new Scanner(System.in);
    int contas = 0 ;
    contas = in.nextInt();
    Stack <Integer> numeros = new Stack<>();
    for (int i = 0;i<contas;i++){
      if (in.hasNextInt())
        numeros.push(in.nextInt());
      else if (in.hasNext())
        calculadora(numeros,in.next());
      System.out.println("Resultado = " + numeros.pop());
    }
  }
}
