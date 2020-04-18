
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int product  = 1;
        int zeroCount = 0;
       for(int i=0;i<nums.length;i++){
           if(nums[i] != 0){
                product = product * nums[i];
           }else{
               zeroCount++;
           }
       }
            for(int i=0;i<nums.length;i++){
                if(nums[i] == 0){
                    nums[i] = product  * (zeroCount > 1 ? 0:1);
                }else{
                   nums[i] = product/nums[i]  * (zeroCount>0 ? 0:1); 
                }
                
            }
        return nums;
        
    }
}
