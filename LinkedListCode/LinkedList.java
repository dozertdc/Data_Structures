package datastructures;

public class LinkedList {

    public class Node {

        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }

    }

    public Node head;

    public void addFront(int data) {

        // create a new node
        Node newNode = new Node(data);

        // terminating condition, if there is an empty list all
        // you have to do is make the head the new node
        if(head == null){
            head = newNode;
            return;
        }

        // current list is [head]->[1]
        // you want to make the new node the head and make the head the first element
        newNode.next = head;
        head = newNode;
        // now looks like [head]->[oldHead]->[1]

    }

    public void addBack(int data) {

        Node newNode = new Node(data);

        // terminating condition, if there is an empty list all
        // you have to do is make the head the new node
        if(head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        // The tail is the only node that will point to null
        while(current.next != null){
            current = current.next;
        }

        // set the tail's pointer to the new node
        current.next = newNode;
    }

    public int getFirst() {

        // return the data from the head node
        return head.data;

    }

    public int getLast() {

        if (head == null) {
            throw new IllegalStateException("The List is Empty!");
        }

        Node current = head;

        // The tail is the only node that will point to null
        while(current.next != null){
            current = current.next;
        }

        // return the data from tail
        return current.data;

    }

    public int size() {

        if(head == null){
            return 0;
        }

        int count = 1;
        Node current = head;

        // count elements until tail is reached
        while (current.next != null) {
            current = current.next;
            count++;
        }

        return count;

    }

    public void clear() {

        head = null;

    }

    public void deleteValue(int data) {

        if (head == null){
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;

        while (current.next != null) {
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

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
