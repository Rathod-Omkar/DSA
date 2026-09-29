class Solution {
    public int missingNumber(int[] nums) {
        int b = nums.length;
        int expSum = (b*(b+1))/2;
        int sum = 0;
        for(int num : nums){
            sum+=num;
        }
        return expSum-sum;
    }
}
