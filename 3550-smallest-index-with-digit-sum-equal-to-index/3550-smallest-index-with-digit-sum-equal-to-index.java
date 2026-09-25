class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int digit=nums[i];
            int digitsum=0;

            while(digit>0)
            {
               digitsum+=digit%10;
               digit/=10;
            }
            if(digitsum==i){
            return i;
            }
        }
        return -1;
    }
}