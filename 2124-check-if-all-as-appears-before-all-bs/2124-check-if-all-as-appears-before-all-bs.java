class Solution {
    public boolean checkString(String s) {
        char[] c=s.toCharArray();
        boolean b=false;
        Arrays.sort(c);
        String a=new String(c);
        if(s.equals(a)){
            b=true;
        }
        return b;
    }
}