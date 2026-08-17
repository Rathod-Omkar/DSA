class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        if(nums.length==0) return 0;
        int sum=0,diff=0,minDiff=Integer.MAX_VALUE,res=0;
        int i,left,right;
        for(i=0;i<nums.length - 2;i++)
        {
            left=i+1;
            right=nums.length -1;
            
            while(left<right){
                sum = nums[i]+nums[left]+nums[right];
                diff = Math.abs(sum-target);
                
                if(diff<minDiff){
                    minDiff = diff;
                    res = sum;
                }

                if(sum==target) return target;
                if(sum < target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
            return res;
        }
    }

