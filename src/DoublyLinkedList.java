/*
 * Doubly Linked List for storing any type of object
 */
public class DoublyLinkedList<T> implements ImplementLists<T> {

    private DLNode<T> head;
    private DLNode<T> tail;
    private int size;

    // Constructor Initializes and empty list
    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Method to add element to end of the list
    public void addSong(T song) {
        DLNode<T> newNode = new DLNode<>(song);
        if (head == null) {
            head = tail = newNode; // If empty, new node is both head and tail
        } else {
            tail.next = newNode; // Update tail to new node
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Method to remove an element at a given position
    public void removeSong(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            head = head.next; // Move head to next node
            if (head != null) {
                head.prev = null; // Remove previous reference
            } else {
                tail = null; // If list becomes empty, reset tail
            }
        } else if (position == size - 1) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null; // If list becomes empty, reset head
            }
        } else {
            DLNode<T> current = head;
            for (int i = 0; i < position; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
    }

    // Method to convert the Linked List into a string representation
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DLNode<T> current = head;
        while (current != null) {
            sb.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }
}

