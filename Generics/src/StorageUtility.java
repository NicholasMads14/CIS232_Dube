import java.util.ArrayList;

// Creates Generic Class
public class StorageUtility<T> {
    // Adds attribute of Arraylist, made up of any type <T> named list
    private ArrayList<T> list;

    // Constructor that creates a new ArrayList
    public StorageUtility() {
        this.list = new ArrayList<>();
    }

    // Adds item of any data type to ArrayList list
    public void add(T item) {
        list.add(item);
    }

// Generic Methods

    // prints item, no matter the data type
    public static <T> void printItem(T item) {
        System.out.println(item);
    }

    // returns item, no matter the data type
    public static <T> T returnItem(T item) {
        return item;
    }
}
