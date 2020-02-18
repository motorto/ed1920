public class Losango { 
        static void linha(int n){
		int m=1;
		while(n>0){
			n--;
			for(int i=n/2;i>0;i--){
				System.out.print("a");
			}
			for(int i=0;i<m;i++){
				System.out.print("*");
			}
			for(int i=n/2;i>0;i--){
				System.out.print("a");
			}
			System.out.println();
			m+=2;
		}
	}	

        static void losango(int n){
                int half=n/2+1;
                int m=1;
                for (int i=0;i<half;i++){
                        for (int j=0;j<half-1;j++){
                                System.out.print("a");
                        }
		
	public static void main (String[] args){
		linha(5);
	}
}
