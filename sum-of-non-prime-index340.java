class sum_of_non_prime_index340 {
    static int sumOfNonPrimeIndexValuesInAnArray(int input1[]) {
        int sum = 0;
        for (int i = 2; i < input1.length; i++) {
            if (!isPrime(i))
                sum += input1[i];
        }
        return sum;

    }
    static boolean isPrime(int n){
		if(n==1 || n==0)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0)
				return false;
		}
		return true;
	}

    
}
