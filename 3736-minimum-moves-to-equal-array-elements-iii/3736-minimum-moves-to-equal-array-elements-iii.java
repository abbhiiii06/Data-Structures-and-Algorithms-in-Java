class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int high=nums[nums.length-1];
        int moves=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]!=high){
                moves+=high-nums[i];
                i++;
            }else{
                i++;
            }
        }
        return moves;
    }
}