class Solution {
    public int[] searchRange(int[] nums, int target) {
        int newarr[]={-1,-1};
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                newarr[0]=mid;
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target){
                newarr[1]=mid;
                l=mid+1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return newarr;
    }
}