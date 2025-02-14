public class Main {

    public static void main(String[] args) {
        AList playlist = new AList();
        SinglyLinkedList list = new SinglyLinkedList();

        playlist.addy(new Song("Navigate the Field", "Spiffy Man", 6.41));
        playlist.addy(new Song("Astronomia 2k19", "Stephan F", 3.11));

        list.addSong(new Song("Astronomia 2k19", "Stephan F", 3.11));
        list.addSong(new Song("Navigate the Field", "Spiffy Man", 6.41));

        System.out.println(playlist);
        System.out.println(list);
    }
}
