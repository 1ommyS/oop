import bookstore.Book;
import bookstore.BookStore;
import order.Order;
import order.SendOrder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
  /*      Bucket bucket1 = new Bucket(10);

        Bucket bucket2 = new Bucket(5);
        Bucket bucket3 = new Bucket(0);


        System.out.println(bucket1.getCapacity());
        System.out.println(bucket2.getCapacity());
        System.out.println(bucket3.getCapacity());

        Book book1 = new Book(
                "dsadasdas",
                "dasdsadsadas",
                "cxzcxzczx",
                50,
                50
        );
        System.out.println(book1);

        try {
            book1.setPrice(-50);
        } catch (Exception exception) {
            System.out.println("пошел нахуй");
        }

        System.out.println(book1.getPrice());

        Book book2 = new Book(
                "счясчясчяясч",
                "dasdsadsadas",
                "cxzcxzczx",
                50,
                50
        );

        System.out.println(book1.getISBN());*/
/*

        BookStore store = new BookStore(2);
        Book book1 = new Book("dsadasdas",
                "dasdsadsadas",
                "cxzcxzczx",
                50,
                50);

        store.addBook(
                book1
        );

        store.addBook(
                new Book(
                        "счясчясчяясч",
                        "dasdsadsadas",
                        "cxzcxzczx",
                        50,
                        50
                )
        );

        try {
            store.addBook(
                    new Book(
                            "asdsdadas",
                            "ccc",
                            "fff",
                            50,
                            50
                    )
            );
        } catch (Exception e) {
            System.out.println("не получилось добавить 3 ую книгу: " + e.getMessage());
        }

        store.printBooks();

        Book firstBook = store.getBook(1);
        Book dasdsadsadas = store.getBook("dasdsadsadas");

        System.out.println(firstBook);
        System.out.println(dasdsadsadas);*/

       /* SendOrder sender = new SendOrder();

        sender.sendOrder(
                new Order(15),
                "ivan"
        );*/

        CustomArrayList<String> array = new CustomArrayList<>(3);
        array.add("1");
        array.add("3");
        array.add("4");
        array.add("5");
        array.add("6");
        array.print();

        CustomArrayList<Integer> arr2 = new CustomArrayList<Integer>(3);
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.print();

        /*
        int -> Integer
        long -> Long
        double -> Double
        char -> Character
        float -> Float
        short > Short
        boolean -> Boolean
        byte -> Byte
         */

        // -128; 128
        Integer a = 300;
        Integer b = 300;

        Boolean c = true;

//        System.out.println(a.equals(null));
//        System.out.println(arr2.getClass());
        System.out.println(a.equals(c));
    }
}