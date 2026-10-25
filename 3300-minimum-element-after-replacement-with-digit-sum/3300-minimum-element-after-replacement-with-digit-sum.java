class Solution {
    public int minElement(int[] nums) {
        ArrayList<Integer>a=new ArrayList<>();
        int sum=0;
        int min=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                sum+=nums[i]%10;
                nums[i]=nums[i]/10;
                if(nums[i]==0){
                    a.add(sum);
                    sum=0;
                }
            }
        }
        min=Collections.min(a);
        return min;
    }
}