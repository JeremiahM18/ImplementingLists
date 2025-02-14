public class Song {

    public String name;
    public String artist;
    public double length;

    public Song(String n, String art, double songLength) {
        name = n;
        artist = art;
        length = songLength;
    }

    public String toString() {
        return "Title: " + name + ", Artist: " + artist + ", Length: " + length;
    }
}
