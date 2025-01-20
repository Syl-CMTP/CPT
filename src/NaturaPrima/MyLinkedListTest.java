package NaturaPrima;

/**
 * author: Carl Palad
 * date: 19/01/2025
 * Test cases for MyLinkedList class
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {
    @Test
    void testAppend() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals("[ 1 -> 2 -> 3 ]", list.toString());
    }

    @Test
    void testGet() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    void testGetFirst() throws Exception {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.append(1);
        list.append(2);
        assertEquals(1, list.getFirst());
    }

    @Test
    void testIsEmpty() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        assertTrue(list.isEmpty());
        list.append(1);
        assertFalse(list.isEmpty());
    }

    @Test
    void testPrepend() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.prepend(1);
        list.prepend(2);
        list.prepend(3);
        assertEquals("[ 3 -> 2 -> 1 ]", list.toString());
    }

    @Test
    void testRemoveFirst() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.removeFirst();
        assertEquals("[ 2 -> 3 ]", list.toString());
        list.removeFirst();
        assertEquals("[ 3 ]", list.toString());
        list.removeFirst();
        assertTrue(list.isEmpty());
    }

    @Test
    void testSize() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        assertEquals(0, list.size());
        list.append(1);
        assertEquals(1, list.size());
        list.append(2);
        assertEquals(2, list.size());
        list.append(3);
        assertEquals(3, list.size());
    }

    @Test
    void testToString() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        assertEquals("[]", list.toString());
        list.append(1);
        assertEquals("[ 1 ]", list.toString());
        list.append(2);
        assertEquals("[ 1 -> 2 ]", list.toString());
        list.append(3);
        assertEquals("[ 1 -> 2 -> 3 ]", list.toString());
    }
}
