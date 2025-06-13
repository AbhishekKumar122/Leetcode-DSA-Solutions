package Stack_DS;

public class StackUsingArray {
    private int[] stack;
    private int top;
    private int capacity;

    public StackUsingArray(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1; // indicates stack is empty
    }

    public void push(int x) {
        if (top + 1 < capacity) {
            stack[++top] = x;
        } else {
            System.out.println("Stack overflow");
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return stack[top--];
    }

    public int top() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean empty() {
        return top == -1;
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        stack.push(10);
        stack.push(20);
        System.out.println("Top: " + stack.top()); // Output: 20
        System.out.println("Pop: " + stack.pop()); // Output: 20
        System.out.println("Empty: " + stack.empty()); // Output: false
    }
}
