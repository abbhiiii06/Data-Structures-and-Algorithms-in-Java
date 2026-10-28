class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int newarr[]=new int[n*2];
        int k=0;
        for(int i=0;i<n;i++){
            newarr[k]=nums[i];
            newarr[k+n]=nums[i];
            k++;
        }
        return newarr;
    }
}