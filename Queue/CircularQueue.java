package Queue;

class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public CircularQueue(int k) {
        queue = new int[k + 1];
        size = k + 1;
        front = 0;
        rear = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        queue[rear] = value;
        rear = (rear + 1) % size;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % size;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return queue[(rear - 1 + size) % size];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);

        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);

        System.out.println("Front: " + q.Front()); // 10
        System.out.println("Rear: " + q.Rear()); // 30

        q.deQueue();
        q.enQueue(40);

        System.out.println("Front: " + q.Front()); // 20
        System.out.println("Rear: " + q.Rear()); // 40
    }
}
