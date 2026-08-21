class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0,high=arr.length-1,mid;
        mid=low+(high-low)/2;
        while(low<high){
            mid=low+(high-low)/2;
            if(arr[mid]>arr[mid+1]){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return high;
    }
}
