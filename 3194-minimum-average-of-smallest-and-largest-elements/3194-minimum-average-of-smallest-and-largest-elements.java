class Solution {
    public double minimumAverage(int[] nums) {
        ArrayList<Float>list=new ArrayList<>(nums.length/2);
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            float av=(nums[i]+nums[j])/2f;
            list.add(av);
            i++;
            j--;
        }
        float min=list.get(0);
        for(Float num:list){
            if(num<min){
                min=num;
            }
        }
        return min;
    }
}