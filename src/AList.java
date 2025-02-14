
public class AList<T>{

    private T[] genArray;
    //private Song[] list;
    private int size;
    private static final int initialMax = 10;

    public AList() {
        list = new Song[initialMax];
        size = 0;
    }

    public AList(T[] ar) {
        genArray = ar[initialMax];
        size = 0;
    }

    public void addy(Song p) {
        if (size == list.length) {
            resize();
        }
        list[size] = p;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        for (int i = index; i < size; i++) {
            list[i] = list[i + 1];
        }
        list[size - 1] = null;
        size--;
    }

    private void resize() {
        Song[] temp = new Song[list.length * 2];
        System.arraycopy(list, 0, temp, 0, size);
        list = temp;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size; i++) {
            str.append(list[i].toString()).append("\n");
        }
        return str.toString();
    }
}
