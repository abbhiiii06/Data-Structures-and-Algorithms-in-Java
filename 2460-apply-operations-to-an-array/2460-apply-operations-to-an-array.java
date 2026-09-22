class Solution {
    public int[] applyOperations(int[] nums) {
        int newarr[]=new int[nums.length];
        int n=0;
        int m=newarr.length-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                newarr[n]=nums[i];
                n++;
            }else{
                newarr[m]=nums[i];
                m--;
            }
        }
       
        return newarr;
    }
}