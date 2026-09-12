class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer>list=new ArrayList<>();
        int i=0;
        if(i<nums.length-1){
            for(int j=nums.length-1;j>0;j--){
                int sum=nums[i]+nums[j];
                list.add(sum);
                i++;
            }
        }
        int max=Collections.max(list);
        return max;
    }
}