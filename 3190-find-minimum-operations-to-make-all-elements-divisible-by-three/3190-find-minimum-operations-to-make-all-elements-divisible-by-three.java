class Solution {
    public int minimumOperations(int[] nums) {
        int remainder=0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            remainder=nums[i]%3;
            if(remainder!=0){
                count++;
            }
        }
        return count;
    }
}