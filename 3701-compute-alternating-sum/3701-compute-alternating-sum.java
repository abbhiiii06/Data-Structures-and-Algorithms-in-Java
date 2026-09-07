class Solution {
    public int alternatingSum(int[] nums) {
        int evensum=0;
        int oddsum=0;
        int total=0;
        if(nums.length<=1){
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                evensum+=nums[i];
            }else{
                oddsum+=nums[i];
            }
            total=evensum-oddsum;
        }
        return total;
    }
}