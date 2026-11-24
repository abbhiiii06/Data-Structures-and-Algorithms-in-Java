class Solution {
    public int gcdOfOddEvenSums(int n) {
        if(n==1){
            return 1;
        }
        int evennum=0;
        int oddnum=0;
        int max=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                evennum+=i;
            }else{
                oddnum+=i;
            }
        }
        for(int i=1;i<=oddnum/2;i++){
            if(evennum%i==0 && oddnum%i==0){
               max=Math.max(max,i);
            }
        }
        return max;
       
    }
}