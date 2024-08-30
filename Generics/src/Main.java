public class Main {
    public static void main(String[] args) {

        StorageUtility<Integer> intStorageUtility = new StorageUtility<>();
        intStorageUtility.add(42);

        StorageUtility<String> stringStorageUtility = new StorageUtility<>();
        stringStorageUtility.add("Hello World");

        StorageUtility.printItem("Hello");
        StorageUtility.printItem(42);

        System.out.println();

        System.out.println(StorageUtility.returnItem("World"));
        System.out.println(StorageUtility.returnItem(58));



    }
}