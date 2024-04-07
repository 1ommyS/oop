package bookstore;

public class Dog extends Animal {
    public String color;


    public Dog(String name, String poroda, String color) {
        super(name, poroda);
//        super();
        this.color = color;
    }
}
