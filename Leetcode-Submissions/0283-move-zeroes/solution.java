class Solution {
    public void moveZeroes(int[] nums) {
        int fast=0,slow=0,temp;
       for(;fast<nums.length;fast++){
        if(nums[fast]!=0){
            temp = nums[fast];
            nums[fast]=nums[slow];
            nums[slow]=temp;
            slow++;
        }
       }
    }
}
