public class SinglyLinkedList <T> {

    private T[] sList;
    private int size;
    //private Node head;

        Node(Song d) {
            data = d;
            next = null;
        }
    }

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    public SinglyLinkedList(T[] a) {
        head = null;
        size = a.length;
        sList = a;

    }

    public void addSong(Song p) {
        Node newNode = new Node(p);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void removeSong(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        Node current = head;
        while (current != null) {
            str.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return str.toString();
    }

}
