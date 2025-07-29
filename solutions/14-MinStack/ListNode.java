class ListNode{
    int val;
    int minval;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
        this.minval = val;
    }
}
class MinStack {

    ListNode top;
    public MinStack() {
        top = null;
    }

    public void push(int val) {
        if(top == null){
            top = new ListNode(val);
        }
        else{
            ListNode newnode = new ListNode(val);
            newnode.next = top;
            newnode.minval = Math.min(newnode.minval,top.minval);
            top = newnode;
        }
    }

    public void pop() {
        top = top.next;
    }

    public int top() {
        return top.val;
    }

    public int getMin() {
        return top.minval;
    }
}