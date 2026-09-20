class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer>a=new ArrayList<>();
        ArrayList<Integer>b=new ArrayList<>();
        a.add(nums[0]);
        b.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(a.get(a.size()-1)>b.get(b.size()-1)){
                a.add(nums[i]);
            }else{
                b.add(nums[i]);
            }
        }
        a.addAll(b);
        int k=a.size();
        int newarr[]=new int[k];
        int j=0;
        for(int num:a){
            newarr[j]=num;
            j++;
        }
        return newarr;
    }
}