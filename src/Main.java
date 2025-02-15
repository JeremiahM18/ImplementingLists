public class Main {

    public static void main(String[] args) {

        // Creating song objects
        Song[] songs = {
                new Song("Navigate the Field", "Spiffy Man", 6.41),
                new Song("Astronomia 2k19", "Stephan F", 3.11),
                new Song("Heavy Is The Crown", "Linkin Park", 3.46),
                new Song("Prisoner", "ANKOR", 3.55),
                new Song("Coral Crown", "Darren Korb", 4.07),
                new Song("CASANOVE POSSE", "ALI", 4.00),
                new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47)
        };

        // Creat lists
        AList aList = new AList();
        SinglyLinkedList sList = new SinglyLinkedList();
        DoublyLinkedList dList = new DoublyLinkedList();

        // Loop to add songs to each list
        for(Song song : songs) {
            aList.addy(song);
            sList.addSong(song);
            dList.addSong(song);
        }

        System.out.println(aList);
        System.out.println(sList);
        System.out.println(dList);

        aList.remove(1);
        sList.removeSong(1);
        dList.removeSong(1);

        System.out.println(aList);
        System.out.println(sList);
        System.out.println(dList);

        // Empty the entire lists
        for(int x = aList.getSize() -1; x >= 0; x--) {
            aList.remove(x);
        }
        System.out.println("Is list empty? " + aList.getSize());
        System.out.println(aList);

        for(int j = sList.getSize() - 1; j >= 0; j--) {
            sList.removeSong(j);
        }
        System.out.println("Is list empty? " + sList.isEmpty());
        System.out.println(sList);

        for(int k = dList.getSize() - 1; k >= 0; k--) {
            dList.removeSong(k);
        }
        System.out.println("Is list empty? " + dList.isEmpty());
        System.out.println(dList) ;
    }
}
