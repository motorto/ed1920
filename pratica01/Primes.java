public class Primes {
    // Verifica se o número n é primo (apenas divisível por 1 e por si próprio)
    // [função ainda por completar]
    static boolean isPrime(int n) {
		if(n<2)
			return false;
		for(int i=2;i*i<=n;i++){
			if(n%i*i==0)
				return false;
			}
			return true;
    }
    
    public static void main(String[] args) {
	
	int n=1000; // Limite dos números
	
	for (int i=2; i<=n; i++)
	    if (isPrime(i))
		System.out.println(i);
    }
}
