class Solution {
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
       int arr[]=new int[nums.length];
       int max=0;
       int  k=0;
       for(int i=0;i<nums.length;i++){
        max=Math.max(max,nums[i]);
        arr[i]=gcd(max,nums[i]);
       }
       Arrays.sort(arr);
       long sum=0;
       int i=0;
       int j=arr.length-1;
       while(i<j){
        sum+=gcd(arr[i],arr[j]);
        i++;
        j--;
       }
       return sum;
    }
}