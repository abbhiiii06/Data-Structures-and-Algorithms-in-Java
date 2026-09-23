class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
       int newarr[]=new int[friends.length];
       int k=0;
       	List<Integer>a=new ArrayList<>();
        for(int num:friends){
            a.add(num);
        }
        for(int i=0;i<order.length;i++){
            if(a.contains(order[i])){
                newarr[k]=order[i];
                k++;
            }
        }
        return newarr;
    }
}