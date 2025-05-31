
class Solution {

  public boolean isValid(String s) {

    Stack<Character> stack = new Stack <>();

    for (int i = 0; i < s.length(); i++) {

      char cur = s.charAt(i);

      if(!stack.isEmpty()) {
        char top = stack.peek();
        if(isPair(top,cur)) {
          stack.pop();
          continue;
          }
        }
        stack.push(cur);
      }
      return stack.isEmpty();
    }

    private boolean isPair(char top, char cur) {
      return (top == '(' && cur == ')') ||
             (top == '[' && cur == ']') ||
             (top == '{' && cur == '}');  
    }

}
