package MileStone3;


class Main {
    static String[] stringEncoder(String[] input1,int input2){
        for(int i=0;i<input1.length;i++){
            String s=input1[i];
            char[] ch=s.toCharArray();
            char first=ch[0];
            char last=ch[ch.length-1];
            char mid=ch[ch.length/2];
            String mys="";
            mys=mys+first+mid+last;
            String mys1="";
            for(int j=0;j<=input2;j++){

                mys1+=mys;
            }
            input1[i]=mys1;
        }
        return input1;



    }  
    public static void main(String[] args){
        String[] input1={"AbC"};
        int input2=2;
        String[] output=stringEncoder(input1,input2);
        for(int i=0;i<output.length;i++){
            System.out.println(output[i]);
        }           
    }
}
