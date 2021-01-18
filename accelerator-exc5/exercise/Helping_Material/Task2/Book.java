import java.util.Objects;

public class Book {
    private long isbn;
    private String author;
    private String synopsis;

    public Book(long isbn, String author, String synopsis) {
        this.isbn = isbn;
        this.author = author;
        this.synopsis = synopsis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn &&
                Objects.equals(author, book.author) &&
                Objects.equals(synopsis, book.synopsis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, author, synopsis);
    }

    public long getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getSynopsis() {
        return synopsis;
    }
}
