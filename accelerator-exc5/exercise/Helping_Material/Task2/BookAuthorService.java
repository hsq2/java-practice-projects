import java.util.Optional;

public class BookAuthorService {

    private BookRepository bookRepository;

    public BookAuthorService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<String> getAuthor(long isbn) {
        Book book = bookRepository.getBook(isbn);
        if (book != null) {
            return Optional.of(book.getAuthor());
        }
        return Optional.empty();
    }
}
