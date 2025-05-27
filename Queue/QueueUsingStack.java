package Queue;

import java.util.Stack;

public class QueueUsingStack {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Push element x to the back of queue.
    public void push(int x) {
        stack1.push(x);
    }

    // Removes the element from in front of queue and returns that element.
    public int pop() {
        if (stack2.isEmpty()) {
            transfer();
        }
        return stack2.pop();
    }

    // Get the front element.
    public int peek() {
        if (stack2.isEmpty()) {
            transfer();
        }
        return stack2.peek();
    }

    // Returns whether the queue is empty.
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Helper method to move elements from stack1 to stack2
    private void transfer() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.err.println("peek : " + queue.peek());
        System.err.println("pop : " + queue.pop());
        System.err.println("peek : " + queue.peek());
        System.err.println("isEmpty : " + queue.empty());

    }
}
