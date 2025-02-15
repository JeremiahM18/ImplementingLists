/*
* Tester Class for the different types of lists
 */
public class ListTester {

    public static void main(String[] args) {
        // Creating song objects
        Song song1 = new Song("Navigate the Field", "Spiffy Man", 6.41);
        Song song2 = new Song("Astronomia 2k19", "Stephan F", 3.11);
        Song song3 = new Song("Heavy Is The Crown", "Linkin Park", 3.46);
        Song song4 = new Song("Prisoner", "ANKOR", 3.55);
        Song song11 = new Song("Coral Crown", "Darren Korb", 4.07);
        Song song12 = new Song("CASANOVE POSSE", "ALI", 4.00);
        Song song13 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);

        testArrayList(song11, song12, song13);
        testLinkedList(song13, song11, song12);
        testDoublyLinkedList(song13, song11, song12);
    }

    // Method to test Array-Based list not using Interface
    private static void testArrayList(Song s1, Song s2, Song s3) {
        System.out.println("Testing ArrayList");
        AList a2 = new AList();
        System.out.println(a2);

        a2.addy(s1);
        a2.addy(s2);
        a2.addy(s3);
        a2.addy(s1);
        System.out.println(a2);

        a2.remove(1);
        System.out.println(a2);
        System.out.println("End Array-Based Test");
    }

    private static void testLinkedList(Song s1, Song s2, Song s3) {
        System.out.println("Testing SinglyLinkedList");
       ImplementLists<Song> single2 = new SinglyLinkedList<>();
        System.out.println(single2);

        single2.addSong(s1);
        single2.addSong(s2);
        single2.addSong(s3);
        single2.addSong(s1);
        System.out.println(single2);

        single2.removeSong(1);
        System.out.println(single2);
        System.out.println("End Single Linked-List-Based Test");
    }

    private static void testDoublyLinkedList(Song s1, Song s2, Song s3) {
        ImplementLists<Song> d1 = new DoublyLinkedList<>();
        System.out.println(d1);
        d1.addSong(s1);
        d1.addSong(s3);
        d1.addSong(s2);
        d1.addSong(s1);
        System.out.println(d1);

        d1.removeSong(1);
        System.out.println(d1);
        System.out.println("End Doubly Linked-List-Based Test");
    }
}

