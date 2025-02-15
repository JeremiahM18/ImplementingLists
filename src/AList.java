/*
 * Array-based List for storing objects
 */
public class AList {

    private Object[] genArray;
    private int size;
    private static final int initialMax = 10;

    public AList() {
        genArray = new Object[initialMax];
        size = 0;
    }

    // Method to add an element to the list
    public void addy(Object p) {
        if (size == genArray.length) {
            resize();
        }
        genArray[size] = p;
        size++;
    }

    // Method to remove an element at a specific index
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        for (int i = index; i < size; i++) {
            genArray[i] = genArray[i + 1];
        }
        genArray[size - 1] = null;
        size--;
    }

    // Method to resize array when full
    private void resize() {
        Object[] temp = new Object[genArray.length * 2];
        System.arraycopy(genArray, 0, temp, 0, size);
        genArray = temp;
    }

    // Method to get the size of array
    public int getSize(){
        return size;
    }

    // Method to see if the array is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to return a string representation of all elements in the list
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size; i++) {
            str.append(genArray[i].toString()).append("\n");
        }
        return str.toString();
    }
}
