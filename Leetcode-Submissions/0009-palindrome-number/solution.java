class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp=x;
        int sum =0;
        while(x!=0){
            int y = x%10;
            sum = sum * 10 + y;
            x = x/10;
        }
        if(temp == sum){
            return true;
        }
        return false;
    }
}
