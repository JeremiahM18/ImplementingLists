/*
 * Node class for Singly Linked List
 */
public class SLNode<T> {
    T data;
    SLNode<T> next;

    public SLNode(T obj) {
        data = obj;
        next = null;
    }

}
