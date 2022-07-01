public class sum_of_all_prime_numbers_in_the_array_except_small241 {
    static int sumOfAllPrimeNumbersInTheArrayExceptTheSmallestOne(int input1[]){
		int sum=0;
        
        int smallest=Integer.MAX_VALUE;
		for(int i=0;i<input1.length;i++){
			if(isPrime(input1[i])){
				if(input1[i]<smallest)
				smallest=input1[i];
				sum+=input1[i];
			}
		}
		return sum-smallest;
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
    public static void main(String[] args){
        System.out.println(sumOfAllPrimeNumbersInTheArrayExceptTheSmallestOne(new int[]{10,41,18,50,43,31,29,25,59,96,67}));
    }
}
