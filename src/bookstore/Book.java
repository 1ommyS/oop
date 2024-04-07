package bookstore;

public class Book {
    private String ISBN;
    private String title;
    private String author;
    private int price;
    private int amountOfPages;

    public Book(String ISBN, String title, String author, int price, int amountOfPages) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
        this.amountOfPages = amountOfPages;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Цена не может быть отрицательной");
        }
        this.price = price;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        if (amountOfPages < 0) {
            throw new IllegalArgumentException("Количество страниц не может быть отрицательным");
        }
        this.amountOfPages = amountOfPages;
    }

    @Override
    public String toString() {
        return "ISBN: " + ISBN + "\n" +
                "Название: " + title + "\n" +
                "Автор: " + author + "\n" +
                "Цена: " + price + "\n" +
                "Количество страниц: " + amountOfPages + "\n";
    }
}
