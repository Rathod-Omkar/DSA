class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length -1, maxArea=0;
        int width=0,length=0,area=0;
        while(i<j){
            width=j-i;
            length= height[i]<height[j]?height[i]:height[j];
            area = length*width;
            if(area>maxArea){
                maxArea = area;
            }
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxArea;
    }
}
