class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] res = new int[2];
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans = target - nums[i];
            if(map.containsKey(ans)){
                res[0]=map.get(ans);
                res[1]= i;
                break;
            }
            map.put(nums[i],i);
        }
        
        return res;
    }
}
