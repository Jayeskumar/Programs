public class findpin163 {
    static int finPin(int input1,int input2,int input3,int input4){
        return (large(input1)*large(input2))*large(input3)+input4;
    }
    static int small(int n){
        //small=INT_MAX
        int small=Integer.MAX_VALUE;
        while(n>0){
            int temp=n%10;
            small=Math.min(small,temp);
            n=n/10;
        }
        return small;
    }
    static int large(int n){
        //large=INT_MIN
        int large=Integer.MIN_VALUE;
        while(n>0){
            int temp=n%10;
            large=Math.max(large,temp);
            n=n/10;
        }
        return large;
    }
    public static void main(String[] args){
        System.out.println(finPin(3521,2452,1352,38));
    }
    
}
