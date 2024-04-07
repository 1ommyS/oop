package bookstore;

public class BookStore {
    // релаьное количество книг в магазине
    private int size;
    // максимальное количество книг в магазине
    private int capacity;
    private Book[] books;

    public BookStore(int capacity) {
        this.capacity = capacity;
        size = 0;
        books = new Book[capacity];
    }

    public void addBook(Book book) {
        if (capacity == size) {
            throw new IllegalArgumentException("Магазин заполнен");
        }

        books[size++] = book;
//        size++;
    }

    public Book getBook(int index) {
        return books[index];
    }

    public Book getBook(String title) {
        for (int i = 0; i < size; i++) {
            if (
                    books[i]
                            .getTitle()
                            .equals(title)
            ) {
                return books[i];
            }
        }
        return null;
    }

    public void printBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }


}
