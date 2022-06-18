import java.util.*;
class first_repeated_element_from_the_tail {
    static int firstRepeatedElement(int input1[]){
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=input1.length-1;i>0;i--){
            if(input1[i]>0){
                if(map.containsKey(input1[i])){
                    return input1[i];
                }
                map.put(input1[i],1);
            }
            
        }
        if(map.isEmpty())
        return 0;
        return input1[0];
    }
    
}
