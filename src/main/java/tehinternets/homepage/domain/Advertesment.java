package tehinternets.homepage.domain;

public class Advertesment {
    private long ID;
    private String title;
    private String messange;
    private String author;

    public Advertesment() {

    }

    public Advertesment(long ID, String title, String messange, String author) {
        this.ID = ID;
        this.title = title;
        this.messange = messange;
        this.author = author;
    }

    public void setID(long ID) {

        this.ID = ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessange(String messange) {
        this.messange = messange;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public String getMessange() {
        return messange;
    }

    public String getAuthor() {
        return author;
    }
}
