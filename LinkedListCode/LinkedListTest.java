package datastructures;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

    private LinkedList linkedList;

    @Before
    public void SetUp() throws Exception {
        linkedList = new LinkedList();
    }

    @Test
    public void AddFront() {
        System.out.println("Add Front Test:");
        linkedList.addFront(1);
        linkedList.print();
        linkedList.addFront(2);
        linkedList.print();
        linkedList.addFront(3);
        linkedList.print();

        Assert.assertEquals(3, linkedList.getFirst());
        Assert.assertEquals(1, linkedList.getLast());
    }

    @Test
    public void GetFirst() {
        linkedList.addFront(1);
        Assert.assertEquals(1, linkedList.getFirst());
    }

    @Test
    public void GetLast() {
        System.out.println("Get Last Test:");
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);
        linkedList.print();

        Assert.assertEquals(1, linkedList.getLast());
    }

    @Test
    public void AddBack() {
        System.out.println("Add Back Test:");
        linkedList.addBack(1);
        linkedList.print();
        linkedList.addBack(2);
        linkedList.print();
        linkedList.addBack(3);
        linkedList.print();

        Assert.assertEquals(1, linkedList.getFirst());
        Assert.assertEquals(3, linkedList.getLast());
    }

    @Test
    public void Size() {
        Assert.assertEquals(0, linkedList.size());
        linkedList.addBack(1);
        Assert.assertEquals(1, linkedList.size());
        linkedList.addBack(2);
        Assert.assertEquals(2, linkedList.size());
    }

    @Test
    public void Clear() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        linkedList.clear();

        Assert.assertEquals(0, linkedList.size());
    }

    @Test
    public void DeleteValue() {
        System.out.println("Delete 2 Test:");
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        linkedList.print();

        linkedList.deleteValue(2);
        linkedList.print();

        Assert.assertEquals(2, linkedList.size());
        Assert.assertEquals(1, linkedList.getFirst());
        Assert.assertEquals(3, linkedList.getLast());
    }

}
