class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> l=new ArrayList<>();
        return print(nums,target,0,l);
    }
    private List<Integer> print(int[]nums,int target,int i,List<Integer>l){
        Arrays.sort(nums);
        if(i==nums.length){
            return l;
        }
        if(nums[i]==target){
            l.add(i);
        }
        return print(nums,target,i+1,l);
    }
}