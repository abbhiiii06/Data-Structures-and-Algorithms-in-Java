class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>se=new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                se.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int k=se.size();
        int newarr[]=new int[k];
        int cur=0;
        for(int num:se){
            newarr[cur]=num;
            cur++;
        }
        return newarr;
    }
}