package Queue;

public class LinkedListQueue {

    // Node structure
    static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    Node front, rear;

    public LinkedListQueue() {
        front = rear = null;
    }

    // Enqueue - add element to rear
    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (rear == null) { // queue is empty
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue - remove element from front
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null) {
            rear = null; // queue became empty
        }

        return value;
    }

    // Peek - get front element
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return front.data;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Display all elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue: ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        LinkedListQueue q = new LinkedListQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        System.out.println("Front element: " + q.peek());
    }
}
