package Stack_DS;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    private Queue<Integer> queue;

    public StackUsingQueue() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        int size = queue.size();
        // Rotate the queue to bring the new element to the front
        for (int i = 0; i < size - 1; i++) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove(); // Front of queue is the top of stack
    }

    public int top() {
        return queue.peek(); // Peek front
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();
        s.push(1); // Queue: [1]
        s.push(2); // Queue: [2, 1]
        s.push(3); // Queue: [3, 2, 1]

        System.out.println(s.top()); // 3
        System.out.println(s.pop()); // 3
        System.out.println(s.top()); // 2
        System.out.println(s.empty()); // false

    }
}