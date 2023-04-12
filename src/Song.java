public class Song implements Cloneable, Comparable<Song> {
    private String title;
    private String autor;

    public Song(String title, String autor) {
        this.title = title;
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Song {" +
                "title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Song other) {
        return this.title.compareTo(other.title);
    }

    @Override
    public Song clone() {
        try{

            return (Song) super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

}