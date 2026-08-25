class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int i,j,maxSet=0;
        for(i=0,j=0;j<s.length();j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            maxSet = Math.max(set.size(),maxSet);
        }
        return maxSet;
    }
}
