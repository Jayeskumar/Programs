import java.util.HashMap;

class find_the_first_repeated_elemet_1{
    static int firstRepeatedElement(int[] input1){
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<input1.length;i++){
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
