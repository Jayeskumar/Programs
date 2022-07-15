package MileStone3;
public class fixtheformula2 {
    public int fixTheFormula(String input1){
        int d[]=new int[input1.length()];
        char c[]=new char[input1.length()];
        int k1=0,k2=0;
        for(int i=0;i<input1.length();i++){
        if(!Character.isLetter(input1.charAt(i))){
        if(Character.isDigit(input1.charAt(i))){
        d[k1++]=Integer.parseInt(String.valueOf(input1.charAt(i)));
        }
        else{
        c[k2++]=input1.charAt(i);
        }
        }
        }
        int res=d[0],k=1;
        for(int i=0;i<k2;i++){
        if(c[i]=='+'){
        res+=d[k];
        }
        else if(c[i]=='-'){
        res-=d[k];
        }
        else if(c[i]=='*'){
        res*=d[k];
        }
        else{
        res/=d[k];
        }
        k++;
        }
        return res;
        }
    
}
