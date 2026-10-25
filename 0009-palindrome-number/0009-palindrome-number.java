class Solution {
    public boolean isPalindrome(int x) {
        boolean b=false;
        int dup=x;
        int rev=0;
        while(x>0){
           int  la=x%10;
            rev=rev*10+la;
            x=x/10;
        }
        if(rev==dup){
            b=true;
        }
        return b;
    }
}