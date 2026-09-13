class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer>smaller=new ArrayList<>();
        List<Integer>equal=new ArrayList<>();
        List<Integer>greater=new ArrayList<>();
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]<pivot){
                smaller.add(nums[i]);
            }else if(nums[i]>pivot){
                greater.add(nums[i]);
            }else{
                equal.add(nums[i]);
            }
        }
        smaller.addAll(equal);
        smaller.addAll(greater);
        int i=0;
        int newarr[]=new int[nums.length];
        for(int num:smaller){
            newarr[i]=num;
            i++;
        }
       return newarr;
    }
}