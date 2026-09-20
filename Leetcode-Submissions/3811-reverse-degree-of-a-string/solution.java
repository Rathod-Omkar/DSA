class Solution {
    public int reverseDegree(String s) {
      int result=0;
      int product = 1;
      for(int i=0;i<s.length();i++){
        int index = s.charAt(i)-'a';
        int reverse = 26-index;
        product =(i+1)* reverse;
        result = result+product;
        }
      
        return result;
    }
}
