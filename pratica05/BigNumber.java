class BigNumber {
    char number[];

    // Construtores
    BigNumber(String n){
	int size = n.length();
	number = new char [size];
	int pos = 0;
	for(int i=size-1; i>=0 ; i--){
	    number[pos++] = n.charAt(i);
	}
    }

    //Metodos padrao
    public String toString(){
	int size = number.length;
	String a = "";
	for (int i = size - 1; i>=0; i--){
	    a += (number[i]-'0');
	}
	return a;
    }

    public boolean equals(BigNumber n){
	if(this.number.length == n.number.length){
	    for(int i=number.length -1 ; i>=0; i--){
		if ( this.number[i] != n.number[i] )
		    return false;
	    }
	    return true;
	}
	else return false;
    }

    private int convertToInt(BigNumber k){
	int size = k.number.length;
	int a = 0;
	int base = 1;
	for (int i = size - 1; i>=0; i--){
	    a += ((number[i] - '0' )* base); base *=10;
	}
	return a;
    }

    public void add(BigNumber n) {
	int num1 = convertToInt(this);
	int num2 = convertToInt(n);
	int sum = num1+num2;
	System.out.println(sum);
	//return sum;
    }

}
