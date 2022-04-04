import java.io.Serializable;

public class Quote implements Serializable {
    private int id;
    private Author author;
    private String content;

    public Quote() {
    }

    public int getId() {
        return id;
    }

    public Author getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }
}