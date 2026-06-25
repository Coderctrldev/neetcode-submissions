class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        Map<Character,Character> op= new HashMap<>();
        op.put(')','(');
        op.put(']','[');
        op.put('}','{');

        for(char c:s.toCharArray()){
            if(op.containsKey(c)){
                if(!stack.isEmpty() && stack.peek()==op.get(c)){
                    stack.pop();
                                    
            }else{
                return false;
            }
        }else{
            stack.push(c);
        }
    }
    return stack.isEmpty();
}
}

