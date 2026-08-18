class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int i,j,k=nums.length-1;
        for(i=0,j=nums.length-1;i<=j;){
            if(Math.abs(nums[i])<=Math.abs(nums[j])){
                result[k]= Math.abs(nums[j])*Math.abs(nums[j]);
                j--;
                k--;
            }else{
                result[k]= Math.abs(nums[i])*Math.abs(nums[i]);
                i++;
                k--;
            }
        }
        return result;
    }
}
