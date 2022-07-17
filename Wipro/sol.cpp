/*static int sumofDigits(int n){
    int sum=0;
    while(n>0){
        sum+=n%10;
        n/=10;
    }
    return sum;
}
    public int maximumSum(int[] nums) {
        int count = 0; // Initialize result
        int max=-1;
  
        // Consider all possible pairs and check their sums
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (sumofDigits(nums[i])==sumofDigits(nums[j]))
                {
                    max=Math.max(max,nums[i]+nums[j]);
                }
            }
        }
        return max;

    }
    */
   //convert to c++
   int sumofDigits(int n){
    int sum=0;
    while(n>0){
        sum+=n%10;
        n/=10;
    }
    return sum;
   }
   int maximumSum(int[] nums) {
    int count = 0; // Initialize result
    int maxi=-1;
  
    // Consider all possible pairs and check their sums
    for (int i = 0; i < nums.size(); i++){
        for (int j = i + 1; j < nums.size(); j++){
            if (sumofDigits(nums[i])==sumofDigits(nums[j]))
            {
                maxi=max(maxi,nums[i]+nums[j]);
            }
        }
    }
    return maxi;
   }