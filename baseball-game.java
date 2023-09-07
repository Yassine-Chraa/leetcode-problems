class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for(String op: operations){
           switch(op){
                case "+":
                    stack.push(stack.peek() + stack.get(stack.size()-2));
                    break;
                case "D":
                    stack.push(2*stack.peek());
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(op));
           }
        }
        
        int n = stack.size();
        for(int i=0;i<n;i++){
            sum += stack.get(n-i-1);
        }

        return sum;
    }
}