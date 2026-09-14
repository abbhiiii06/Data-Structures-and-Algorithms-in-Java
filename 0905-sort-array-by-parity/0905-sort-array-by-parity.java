class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int newarr[]=new int[nums.length];
		ArrayList<Integer>list=new ArrayList<>();
		ArrayList<Integer>list1=new ArrayList<>();
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]%2==0){
                list.add(nums[i]);
            }else{
                list1.add(nums[i]);
            }
        }
        list.addAll(list1);
        int i=0;
		for(int num:list){
		   newarr[i]=num;
		   i++;
		}
        return newarr;
    }
}