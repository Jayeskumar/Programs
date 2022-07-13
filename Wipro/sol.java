package Wipro;

public class sol {
    //travelling salesman problem using branch and bound
    static int travellingSlaesman(int[] weights,int[] values,int n){
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=values[i];

        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                dp[i][j]=Math.max(dp[i][j-1],dp[j-1][j]+values[j]);

            }

        }
        return dp[0][n-1];

    }
    //quick sort
    static void quickSort(int[] arr,int left,int right){
        if(left>=right)
        return;
        int pivot=arr[(left+right)/2];
        int i=left,j=right;
        while(i<=j){
            while(arr[i]<pivot)
            i++;
            while(arr[j]>pivot)
            j--;
            if(i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        quickSort(arr,left,j);
        quickSort(arr,i,right);


        }
        //gcd
        static int gcd(int a,int b){
            if(b==0)
            return a;
            return gcd(b,a%b);

        }
        //factorial
        static int factorial(int n){
            if(n==0)
            return 1;
            return n*factorial(n-1);

        }
        //iterative factorial
        static int iterativeFactorial(int n){
            int result=1;
            for(int i=1;i<=n;i++){
                result=result*i;

            }
            return result;
        }
        //sqrt using binary search
        static int sqrt(int n){
            int left=0;
            int right=n;
            while(left<=right){
                int mid=(left+right)/2;
                if(mid*mid==n)
                return mid;
                if(mid*mid<n)
                left=mid+1;
                else
                right=mid-1;

            }
            return -1;

        }

        public static void main(String[] args){
           System.out.println(sqrt(4));
        }
    }

