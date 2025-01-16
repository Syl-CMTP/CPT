package NaturaPrima;

import javax.naming.OperationNotSupportedException;

/**
 * A representation of a linked list.
 * 
 * @author Carl Palad
 * @date 16/12/2024
 */
public class MyLinkedList<T> {

    // Instance Variables
    private Node<T> head;

    public MyLinkedList() {
        this.head = null; // Null can only mean empty
    }

    /**
     * Return whether or not our Linked list is empty.
     * 
     * @return true when the list is empty; false otherwise
     */
    public boolean isEmpty() {
        return this.head == null;
    }

    /**
     * Add some data to the beginning of the list.
     * 
     * @param data The data to add
     */
    public void prepend(T data) {
        Node<T> node = new Node<>(data);
        if (isEmpty()) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    /**
     * Add some data to the end of the list.
     * 
     * @param data The data to add
     */
    public void append(T data) {
        Node<T> node = new Node<>(data);
        if (isEmpty()) {
            this.head = node;
        } else {
            Node<T> current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    /**
     * Get the first element of the list.
     * @return The first element
     * @throws OperationNotSupportedException if the list is empty
     */
    public T getFirst() throws OperationNotSupportedException {
        if (isEmpty()) {
            throw new OperationNotSupportedException("Cannot get first element of empty list");
        }
        return this.head.data;
    }

    /**
     * Remove the first element of the list.
     */
    public void removeFirst() {
        if (!isEmpty()) {
            this.head = this.head.next;
        }
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        StringBuilder repr = new StringBuilder();
        repr.append("[ ");

        Node<T> current = this.head;
        while (current.next != null) {
            repr.append(current.data).append(" -> ");
            current = current.next;
        }
        repr.append(current.data).append(" ]");

        return repr.toString();
    }

    /**
     * Get the size of the list.
     * 
     * @return The size of the list
     */
    public int size() {
        int count = 0;
        Node<T> current = this.head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    /**
     * Get the element at the specified index.
     * 
     * @param index The index of the element to get
     * @return The element at the specified index
     */
    public T get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    /**
     * A node class to make possible a "Singly-Linked-List".
     */
    private class Node<U> {
        private U data;
        private Node<U> next;

        public Node(U data) {
            this.data = data;
        }
    }
}

// package NaturaPrima;

// import javax.naming.OperationNotSupportedException;

// /**
//  * @author Carl Palad
//  * @date 16/12/2024
//  * A representation of a linked list
//  */
// public class MyLinkedList <T> {

//     // Instance Varibles
//     private Node<T> head;

//     public MyLinkedList () {
//         this.head = null; // Null can only mean empty
//     }

//     /**
//      * Return whether or not our Linked list is empty
//      * @return true when the list is empty; false otherwise
//      */
//     public boolean isEmpty() {
//         return this.head == null;
//     }

//     /**
//      * Add some data to the beginning to the list
//      * @param data The data to add
//      */
//     public void prepend(T data) {
//         Node<T> node = new Node<>(data);

//         // Step 0: Is the list empty?
//         if (isEmpty()) {
//             this.head = node;
//             return;
//         }
//         // Step 1: Make the "next" of this node to the current list
//         node.next = this.head;
//         // Step 2: make the node the "head" of the list
//         this.head = node;
//     }

//     /**
//      * Add some data to the end to the list
//      * @param data The data to add
//      */
//     public void append(T data) {
//         Node<T> node = new Node<>(data);

//         // Step 0: Is the list empty?
//         if (isEmpty()) {
//             this.head = node;
//             return;
//         }

//         // Step 1: Find the end of the list
//         // 1a: Save the current state of head
//         Node<T> current = this.head;
//         // 1b: Find the node that has a "next" of "null"
//         while (current.next != null) {
//             // This traverses the list down to the end
//             current = current.next;
//         }
//         // We know for sure that current's .next value HAS TO BE NULL
//         // Add the node after the last element
//         current.next = node;
//     }

//     public T getFirst() throws OperationNotSupportedException {
//         // Step 0: Is the list empty?
//         if (isEmpty()) {
//             // Throw an exception! (This means that this operation will cause an error)
//             throw new OperationNotSupportedException("Cannot get first element of empty list");
//         }

//         // We are safe to grab the data from the head of our list
//         return this.head.data;
//     }

//     public void removeFirst() {
//         // Step 0: Is the list empty?
//         if (isEmpty()) {
//             return; //  No op
//         }

//         // Remove the first element by setting the "head"
//         // of the list to point to the "next" element
//         this.head = this.head.next;
//     }

//     public String toString() {
//         // Step 0: Is the list empty?
//         if (isEmpty()) {
//             return "[]";
//         }

//         // Traverse the list, adding an element to our string at every node;
//         StringBuilder repr = new StringBuilder(); // Efficient string building
//         repr.append("[ ");

//         // Traverse 1: Set up current
//         Node<T> current = this.head;
//         // Traverse 2: Loop while current (or current.next) is not null
//         while (current.next != null) {
//             // Traverse 3: Do the thing
//             repr.append(current.data);
//             repr.append(" -> ");

//             // Traverse 4: Go to the next node
//             current = current.next;
//         }
//         // This is the last element
//         repr.append(current.data);
//         repr.append(" ]");

//         return repr.toString();
//     }

//     public int size() {
//         int count = 0;
//         Node<T> current = this.head;
//         while (current != null) {
//             count++;
//             current = current.next;
//         }
//         return count;
//     }

//     /**
//      * A node class to make possible a "Singly-Linked-List"
//      */
//     private class Node <U> {
//         private U data;
//         private Node<U> next;

//         public Node(U data) {
//             this.data = data;
//         }
//     }

//     public T get(int index) {
//         if (index < 0 || index >= size()) {
//             throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
//         }

//         Node<T> current = head;
//         for (int i = 0; i < index; i++) {
//             current = current.next;
//         }
//         return current.data;
//     }
// }
