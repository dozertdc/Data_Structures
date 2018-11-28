import java.util.NoSuchElementException;

public class DoublyLinkedList<E> {

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        size = 0;
    }

    private class Node {
        E element;
        Node next;
        Node prev;

        public Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public void addFirst(E element) {
        Node newNode = new Node(element, head, null);
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
        if(tail == null){
            tail = newNode;
        }
        size++;
        System.out.println("added:::" + element);
    }

    public void addLast(E element) {
        Node newNode = new Node(element, null, tail);
        if(tail != null){
            tail.next = newNode;
        }
        tail = newNode;
        if(head == null) {
            head = newNode;
        }
        size++;
        System.out.println("added:::" + element);
    }

    public E removeFirst() {
        if(size == 0) {
            throw new NoSuchElementException();
        }
        Node temp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("Removed:::" + temp.element);
        return temp.element;
    }

    public E removeLast() {
        if(size == 0) {
            throw new NoSuchElementException();
        }
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("Removed:::" + temp.element);
        return temp.element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public static void main(String a[]){

        DoublyLinkedList<Integer> dll = new DoublyLinkedList<Integer>();
        dll.addFirst(11);
        dll.addFirst(35);
        dll.addLast(57);
        dll.addLast(365);
        dll.removeFirst();
        dll.removeLast();


        DoublyLinkedList<String> dll2 = new DoublyLinkedList<String>();
        dll2.addFirst("11");
        dll2.addFirst("35");
        dll2.addLast("57");
        dll2.addLast("365");
        dll2.removeFirst();
        dll2.removeLast();


    }

}
