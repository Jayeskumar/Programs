class SumOfAllPrimeNumbersExceptTheLargestNumber{
    static int sumOfAllPrimeNumbersInTheArrayExceptTheLargestOne(int input1[]){
		int sum=0;
		int largest=input1[0];
		for(int i=0;i<input1.length;i++){
			if(isPrime(input1[i])){
				if(input1[i]>largest)
				largest=input1[i];
				sum+=input1[i];
			}
		}
		return sum-largest;
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