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

        // Tester for Array-Based List (not using interface)
        AList a1 = new AList();
        System.out.println(a1);
        a1.addy(song11);
        a1.addy(song13);
        a1.addy(song12);
        a1.addy(song11);
        System.out.println(a1);

        a1.remove(1);
        System.out.println(a1);

        // Using interface reference for SinglyLinkedList
        ImplementLists<Song> s1 = new SinglyLinkedList<>();
        System.out.println(s1);
        s1.addSong(song11);
        s1.addSong(song13);
        s1.addSong(song12);
        s1.addSong(song11);
        System.out.println(s1);

        s1.removeSong(1);
        System.out.println(s1);

        // Using interface reference for DoublyLinked List
        ImplementLists<Song> d1 = new DoublyLinkedList<>();
        System.out.println(d1);
        d1.addSong(song11);
        d1.addSong(song13);
        d1.addSong(song12);
        d1.addSong(song11);
        System.out.println(d1);

        d1.removeSong(1);
        System.out.println(d1);
    }
}

