package MileStone3;
import java.util.ArrayList;
import java.util.*;

public class placethealbhabet {
    static char[] placeAlphabet(int[] input1){
        int[] sorted_input=(int[])input1.clone();
Arrays.sort(sorted_input);
char[] result=new char[input1.length];
int[] index=new int[input1.length];
int ind;int o=0;
for(int i :input1)
{

ind=Arrays.binarySearch(sorted_input,i);
result[o]=(char)(ind+1+96);
o++;
}
return result;
    }
    public static void main(String[] args) {
        char[] arr=placeAlphabet(new int[]{10,5,70,1});
        for(char i:arr)
        {
            System.out.println(i);
        }
    
}
}
