
class User{
    public User user=null;
    User(){

    }
    User(User user){
        this.user = user;
    }
    public User getUser(){
        return user;
    }
}
public class leetcode{
    //return the powerset of an array
    public static List<List<Integer>> ps(int[] arr){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(arr.length==0){
            res.add(new ArrayList<Integer>());
            return res;
        }
        List<List<Integer>> temp = ps(Arrays.copyOfRange(arr,1,arr.length));
        for(List<Integer> l:temp){
            List<Integer> l2 = new ArrayList<Integer>();
            l2.add(arr[0]);
            l2.addAll(l);
            res.add(l2);
            res.add(l);
        }
        return res;
    }
   
}
