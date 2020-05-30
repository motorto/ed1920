public class Sieve {

    // Procedimento para usar o algoritmo do Crivo de Eratóstenes
    public static void sieve(int n, boolean prime[]) {
        // meter vetor tudo verdade
		for(int i=0;i<=n;i++){
			prime[i]=true;
		}
		//descobrir multiplos
		for(int j=2;j<=n;j++){  // <--- Multiplicador (K) 
			for (int i=2;i<=n;i++){		// <-- Avancar o numero pelo qual multiplica (Ki) 
				if((j*i)>n){
					break;
				}
				else
					prime[j*i]=false;
				
			}
		}
    }
    
    public static void main(String[] args) {
	
	int n=10; 
	
	boolean[] prime = new boolean[n+1];

	sieve(n, prime);

	for (int i=2; i<=n; i++)
	    if (prime[i])
		System.out.println(i);
    }
}
