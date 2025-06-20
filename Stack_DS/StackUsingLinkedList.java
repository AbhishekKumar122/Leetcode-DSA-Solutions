package Stack_DS;

import java.util.*;

public class StackUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static class MyStack {
        Node top;

        MyStack() {
            top = null;
        }

        // Push operation
        public void push(int x) {
            Node newNode = new Node(x);
            newNode.next = top;
            top = newNode;
        }

        // Pop operation
        public int pop() {
            if (top == null) {
                return -1; // Stack is empty
            } else {
                int value = top.data;
                top = top.next;
                return value;
            }
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop()); // 20
        stack.push(30);
        System.out.println(stack.pop()); // 30
        System.out.println(stack.pop()); // 10
    }

}
