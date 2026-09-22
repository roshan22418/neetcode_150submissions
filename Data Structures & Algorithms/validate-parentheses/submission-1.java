class Solution {
    public boolean isValid(String s) {
        int length = s.length();
        Stack<Character> stack = new Stack<>();
        for(char i:s.toCharArray()){
            if(i == '(' || i == '{' || i == '['){
                stack.push(i);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    Character above = stack.peek();
                    if(above =='{' && i =='}'){
                        stack.pop();                      

                    }
                    else if(above =='(' && i ==')'){
                        stack.pop();
                    }
                    else if(above =='[' && i ==']'){
                        stack.pop();                        
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
