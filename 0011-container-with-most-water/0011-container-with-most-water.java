class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int i=0;
        int j=height.length-1;
        while(i<=j){
            int h=Math.min(height[i],height[j]);
            int width=j-i;
            int area=h*width;
            max=Math.max(max,area);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}