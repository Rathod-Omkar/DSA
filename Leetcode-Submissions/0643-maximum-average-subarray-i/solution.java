class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
         double maxAvg = Double.NEGATIVE_INFINITY;
        for(int i=0,j=0;j<nums.length;j++){
            sum+=nums[j];
            if((1+j-i)==k){
                double avg = (double)sum/k;
                maxAvg = Math.max(maxAvg,avg);
                sum= sum - nums[i];
                i++;
            }
        }
        return maxAvg;
    }
}
