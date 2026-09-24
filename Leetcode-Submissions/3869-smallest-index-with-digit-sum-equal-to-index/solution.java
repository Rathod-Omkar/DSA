class Solution {
    public static int sumOfNum(int num){
        int sum=0,temp=0;
        while(num!=0){
            sum = sum + (num%10);
            num= num/10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            result = sumOfNum(nums[i]);
            if(i == result){
                return i;
            }
        }
        return -1;
    }
}
