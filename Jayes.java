import java.util.*;
class Solution {
  /*   static int sumOfPrimeIndexValuesInAnArray(int input[]){
		int sum=0;
		for(int i=2;i<input.length;i++){
			if(isPrime(i))
				sum+=input1[i];
		}
		return sum;

	}
	static int sumOfNonPrimeIndexValuesInAnArray(int input1[]){
		int sum=0;
		for(int i=2;input1.length;i++){
			if(!isPrime(i))
				sum+=input1[i];
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
	static int pinGeneration(int input1,int input2,int input3,int input4){
		int odd[]={input1/1000,input2/1000,input3/1000,input1/10%10,input2/10%10,input3/10%10};

		int even[]={input1/100%10,input2/100%10,input3/100%10,input1%10,input2%10,input3%10};
		int oddPin=0;
		int evenPin=0;
		for(int i=0;i<odd.length;i++){
			oddPin+=odd[i];
		}
		for(int i=0;i<even.length;i++){
			evenPin+=even[i];
		}
		if(input4%2==0)
		return evenPin-oddPin;
		else
		return oddPin-evenPin;

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
    static char[] placeTheAlphabetsForTheArrayOfInteger(int input1[]){
        Arrays.sort(input1);
        char[] output = new char[input1.length];
        for(int i=0;i<input1.length;i++){
            output[i]=(char)(input1[i]+'a');
        }
        return output;
    }
	static int findKey(int input1,int input2,int input3){
		int t[]={input1/1000,input2/1000,input3/1000};
		int h[]={input1/100%10,input2/100%10,input3/100%10};
		int te[]={input1/10%10,input2/10%10,input3/10%10};
		int o[]={input1%10,input2%10,input3%10};
		Arrays.sort(t);
		Arrays.sort(h);
		Arrays.sort(te);
		Arrays.sort(o);
		int key=t[2]*1000+h[2]*100+te[2]*10+o[2];
		return key;
	}

	public static void main(String[] args){
		int arr[]={}
	}*/
}
