package datastructures;

import java.util.EmptyStackException;

public class Stack {

    // main method for testing purposes
    public static void main(String[] args) {
        Stack s2 = new Stack();
        s2.push(1);
        s2.push(2);
        s2.push(3);
        s2.push(11);
        s2.print();
        System.out.println("Size:::" + s2.size());
        System.out.println("Peek:::" + s2.peek());
        System.out.println("Pop:::" + s2.pop());
        System.out.println("Pop:::" + s2.pop());
        s2.print();
    }

    private class Node {
        // node object properties
        private int data;
        private Node next;
        // constructor
        private Node(int data) {
            this.data = data;
        }
    }

    // set head of stack
    private Node head;
    // set size of stack to keep track
    private int size;

    // peek at first element's data
    public int peek() {
        return head.data;
    }

    // add to top of stack
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // pop the top Node and return the data
    // from that Node
    public int pop() {
        if (head == null) {
            throw new EmptyStackException();
        }
        Node current = head;
        head = current.next;
        size--;
        return current.data;
    }

    // always keeping track of size
    // so just return value
    public int size() {
        return size;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print("[" + current.data + "]->");
            current = current.next;
        }
        System.out.println("");
    }

}
