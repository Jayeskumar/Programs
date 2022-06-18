public class find_pin_212 {
    static int finPin(int input1,int input2,int input3,int input4){
        int pin=0;
        //smallest digit in input1*largest digit in input2*smallest digit in input3-input4
        return (large(input1)*small(input1))*(large(input2)*small(input2))*(large(input3)*small(input3))-input4;
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
