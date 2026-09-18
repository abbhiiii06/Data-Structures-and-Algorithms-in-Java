class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int duplicate=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==i+1 && nums[i+1]==nums[i]){
                duplicate=nums[i];
            }else{
                continue;
            }
        }
        return duplicate;
    }
}