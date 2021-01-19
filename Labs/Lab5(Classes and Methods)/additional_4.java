public class additional_4 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.peek();
        s.pop();
        s.peek();
    }
}

class Stack{
    int[] a = new int[20];
    int top;
    Stack(){
        top = -1;
    }
    public void push(int n) {
        a[++top]=n;
    }
    public void pop() {
        top--;
    }
    public void peek() {
        System.out.println(a[top]);
    }
}