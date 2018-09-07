//Solved Problem2 on Interview Bit and pasted saame code here there is no main method. Use this code on Interview Bit Editor

public class Solution {
    public int braces(String A) {
        Stack<Character> stack = new Stack();
        for (int i=0;i<A.length();i++) 
        {
            if (A.charAt(i) == ')') 
            {
                Character top = stack.peek();
                stack.pop();
                boolean flag = true;
                while (top != '(') 
                {
                    if (top == '+' || top == '*' || top == '-' || top == '/') { flag = false; }
                    top = stack.peek();
                    stack.pop();
                }
                
                if (flag == true)  { return 1; }
            }
     
            else { stack.push(A.charAt(i)); }
        }
        return 0;
    }
}
