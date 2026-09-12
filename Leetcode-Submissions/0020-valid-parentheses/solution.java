class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for(char i : arr){
            if(i=='(' || i=='[' || i=='{'){
                stack.push(i);
            }
            else{
                if(stack.isEmpty()){ return false;}
                else{
                if(i==')' && stack.peek()=='('){
                   stack.pop();
                }
                else if(i==']' && stack.peek()=='['){
                   
                   stack.pop();
                }
                else if(i=='}' && stack.peek()=='{'){
                  
                   stack.pop();
                }
                else{
                    return false;
                }
            }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
