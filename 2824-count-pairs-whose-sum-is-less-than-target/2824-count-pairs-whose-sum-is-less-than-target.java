class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int i=0;
        int j=1;
        int count=0;
        while(i<nums.size()-1){
            if(j<nums.size()){
                int sum=nums.get(i)+nums.get(j);
                if(sum<target){
                    count++;
                }
                j++;
            }else{
                i++;
                j=i+1;
            }
        }
        return count;
    }
}