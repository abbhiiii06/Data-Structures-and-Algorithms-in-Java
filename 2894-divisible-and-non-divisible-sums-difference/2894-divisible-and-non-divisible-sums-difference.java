class Solution {
    public int differenceOfSums(int n, int m) {
        int divisible=0;
        int nondivisible=0;
        for(int i=1;i<=n;i++){
            int per=i%m;
            if(per==0){
                divisible+=i;
            }else{
                nondivisible+=i;
            }
        }
        int total=nondivisible-divisible;
        return total;
    }
}