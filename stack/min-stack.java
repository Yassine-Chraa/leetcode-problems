public class Node {

    private int data;
    public int min;
    private Node nextNode;

    public Node(int data,int min){
        this.data = data;
        this.min = min;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
class MinStack {
    private Node top;

    public MinStack() {
        this.top = null;
    }
    
    public void push(int val) {
        Node prevTop = this.top;
        int min = prevTop != null && val>=prevTop.min?prevTop.min:val;
        this.top = new Node(val,min);
        this.top.setNextNode(prevTop);
    }
    
    public void pop() {
        Node tmp = this.top;
        this.top = tmp.getNextNode();
    }
    
    public int top() {
     return this.top.getData();   
    }
    
    public int getMin() {
        return this.top.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */