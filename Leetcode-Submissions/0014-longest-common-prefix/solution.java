class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        if(n<1) return "";
        if (strs[0].isEmpty()) return "";
        String str = "";
        int minLength = Math.min(strs[0].length(), strs[n-1].length());
        for(int i=0;i<minLength;i++){
            if(strs[0].charAt(i)!= strs[n-1].charAt(i)){
                break;
            }
            str = str + strs[0].charAt(i);
        }
        return str;
    }
}
