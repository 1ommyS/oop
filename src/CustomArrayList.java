import java.util.Arrays;
import java.util.Objects;

public class CustomArrayList<Type> {
    private Type[] data;
    private int size;
    private int capacity;

    public CustomArrayList(int capacity) {
        size = 0;
        this.capacity = capacity;
        data = (Type[]) new Object[capacity];
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        // WildCard
        CustomArrayList<?> that = (CustomArrayList<?>) object;
        return size == that.size && capacity == that.capacity && Objects.deepEquals(data, that.data);
    }


    public Type get(int index) {
        if (index < 0 || index > capacity) {
            throw new IndexOutOfBoundsException();
        }

        return data[index];
    }
    /*
    capacity = 2;

    add(5);
    add(10);
    add(14);

    какой size и capacity будет после каждой команды?
     */

    public void add(Type element) {
        if (size == capacity) {
            resize();
        }

        data[size++] = element;
    }

    public void resize() {
        Type[] newData = (Type[]) new Object[capacity * 2];

        for (int i = 0; i < capacity; i++) {
            newData[i] = data[i];
        }

        data = newData;
        capacity *= 2;
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
            /*i = size - 1;
            i+1 = size;
            arr[size]*/
        }
    }

    public void print() {
        // enchanced for / for each


        for (Type element : data) {
            if (element == null) {
                return;
            }
            System.out.println(element);
        }
    }

}
