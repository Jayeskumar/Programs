package MileStone3;

public class stringreversewordsandcase {
    public static String reverseWordsAndCase(String input1,int input2){
        String output="";
        String[] s=input1.split(" ");
        for(int i=0;i<s.length;i++){
            if(i==input2){
                for(int j=s[i].length()-1;j>=0;j--){
                    if(Character.isLowerCase(s[i].charAt(j))){
                        output+=Character.toUpperCase(s[i].charAt(j));
                    }
                    else{
                        output+=Character.toLowerCase(s[i].charAt(j));
                    }
                }
            }
            else{
                output+=s[i]+" ";
            }
        }
        return output;
    }
    public static void main(String[] args) {
        System.out.println(reverseWordsAndCase("Wipro Technologies Banglore",1));
    }    
}
