```plaintext
- stack data structure
- hashmap
- 2 methods
    - stack only
    - stack + hash
    
# Stack Only
//stacks are cool. theyre like vertical arrays w similar methods like 'pop'
//and methods like 'peek'.

declare a stack
Stack<Character> stack = new Stack<>();

loops
for(int i = 0; i < s.length(); i++) {
    
}

loop condition
char cur = s.charAt(i);
if (!stack.isEmpty()) {
    char top = stack.peek();
    if (isPair(last, cur)) {
        stack.pop();
        continue;
    }
     stack.push(cur); 
}
return stack.isEmpty(); 

private boolean isPair(char last, char cur) {
    return (top == '(' && cur == ')' ||
           (top == '{' && cur == '}' ||
           (top == '[' && cur == ']';
}


```