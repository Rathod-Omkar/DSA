class Solution {
    public boolean isPalindrome(String s) {
      String st = s.toLowerCase().replaceAll("[^a-z0-9]","");
      int i,j;
      for(i=0,j=st.length()-1;i<j;i++,j--){
        if(st.charAt(i)!=st.charAt(j)){
            return false;
        }
      }
      return true;
    }
}
