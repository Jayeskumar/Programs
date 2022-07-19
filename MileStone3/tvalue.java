package MileStone3;

import java.util.*;
class Main{
    static boolean isPrime(int n){
        if(n==1)
            return false;
        if(n==2)
        return true;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    static boolean isEven(int n){
        if(n%2==0)
            return true;
        return false;
    }
    static int sum(int n){
        int sum=0;
        int j=1;
        for(int i=1;j<=n;i++)
        {
            //return sum; of first n prime numbers
            if(isPrime(i))
            {
                sum+=i;
                j++;
            }
            else
            {
               
            }
        }
       // System.out.println(sum);
        return sum;

    }
    static int find_tvalue(int input1,int input2,int input3){
        int t=0;
        if(isEven(input2)==true && isPrime(input2)==true){
            t=input1*input1*(sum(input2));
        }
        else if(isEven(input2)==false&&isPrime(input2)==true){
            t=input2*input2*(sum(input3));
        }
        else if(isEven(input2)==true&&isPrime(input2)==false){
            t=input3*input3*(sum(input1+input2));
        }
        else if(isEven(input2)==false&&isPrime(input2)==false){
            t=input1*input1*(sum(input1+input2+input3));
        }
        if(isPrime(t))
        return t+input3;
        return t-input3;
    }
    public static void main(String[] args){
        int input1=1;
        int input2=2;
        int input3=1;
        int t=find_tvalue(input1,input2,input3);
        System.out.println(t);
    }
    
}
