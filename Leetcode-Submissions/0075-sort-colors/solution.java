class Solution {
    public void sortColors(int[] nums) {
        int start=0,middle=0,end=nums.length-1,temp=0;
        while(middle<=end){
            switch(nums[middle]){
                case 0:  
                temp=nums[middle];
                nums[middle] = nums[start];
                nums[start] = temp;
                start++;
                middle++;
                break;

                case 1: 
                middle++;
                break;

                case 2: 
                temp = nums[middle];
                nums[middle] = nums[end];
                nums[end] = temp;
                end--;
                break;
            }
        }
    }
}
