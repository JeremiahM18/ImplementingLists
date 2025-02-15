/*
 * Node class for Doubly Linked List
 */
public class DLNode<T> {

    T data;
    DLNode<T> next;
    DLNode<T> prev;

    public DLNode(T object) {
        data = object;
        next = null;
        prev = null;
    }
}
