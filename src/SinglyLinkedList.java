/*
 * Singly Linked List for storing any type of object
 */
public class SinglyLinkedList<T> implements ImplementLists<T> {

    private int size;
    SLNode<T> head;

    // Constructor initializes and empty list
    public SinglyLinkedList() {
        head = null;
        size = 0;

    }

    // Method to add element to the end of the list
    public void addSong(T p) {
        SLNode<T> newNode = new SLNode<>(p);
        if (head == null) {
            head = newNode;
        } else {
            SLNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Method to remove element at a given position
    public void removeSong(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            head = head.next;
        } else {
            SLNode<T> current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    // Method to get the size of the list
    public int getSize(){
        return size;
    }

    // Method to tell if the list is empty
    public boolean isEmpty(){
        return size == 0;
    }

    // Method to convert the Linked List into a string representation
    public String toString() {
        StringBuilder str = new StringBuilder();
        SLNode current = head;
        while (current != null) {
            str.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return str.toString();
    }

}
