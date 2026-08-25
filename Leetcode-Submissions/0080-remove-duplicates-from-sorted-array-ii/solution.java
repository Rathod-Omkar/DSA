class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int i=0,j=0;
        for(i=2,j=2;j<nums.length;j++){
           if(i>1 && nums[i-2]!= nums[j]){
            nums[i]=nums[j];
            i++;
           }
        }
     
        return i;
    }
}
