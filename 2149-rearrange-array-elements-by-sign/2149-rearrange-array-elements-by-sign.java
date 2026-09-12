class Solution {
    public int[] rearrangeArray(int[] nums) {
        int newarr[]=new int[nums.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                newarr[pos]=nums[i];
                pos=pos+2;
            }else{
                newarr[neg]=nums[i];
                neg=neg+2;
            }
        }
        return newarr;
    }
}