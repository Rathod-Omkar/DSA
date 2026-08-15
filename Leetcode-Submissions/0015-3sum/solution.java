class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int i,j,k,sum;
        for(k=0;k<nums.length -2;k++) {
        	if(k>0 && nums[k-1]==nums[k]) {
        		continue;
        	}
        	i=k+1;
        	j=nums.length-1;
        	while(i<j) {
        		sum = nums[k] + nums[i] + nums[j];
        		if(sum == 0) {
        			List<Integer> triplet = Arrays.asList(nums[k],nums[i],nums[j]);
        			result.add(triplet);
        			i++;
        			j--;
        			
        			while(i<j && nums[i]==nums[i-1]) {
        				i++;
        			}
        			while(j>i && nums[j]==nums[j+1]) {
        				j--;
        			}
        		}
        		else {
        			if(sum < 0) {
        				i++;
        			}
        			else {
        				j--;
        			}
        		}
        	}
        }
      
        System.out.println(result);
		return result;
    }
}
