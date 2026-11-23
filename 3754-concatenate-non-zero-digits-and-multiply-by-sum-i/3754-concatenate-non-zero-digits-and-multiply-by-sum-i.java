class Solution {
    public long sumAndMultiply(int n) {
        long num=0;
        long sum=0;
        int place=1;
        while(n>0){
            long len=n%10;
            if(len!=0){
                sum+=len;
                num=len*place+num;
                place*=10;
            }
            n=n/10;
        }
        return num*sum;
    }
}