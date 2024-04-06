import java.util.ArrayList;
import java.util.ArrayDeque;

public class collectionExample {
    public static void main(String[] args) {
        // Contoh menggunakan ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Alice");
        System.out.println("ArrayList:");
        for (String name : names) {
            System.out.println(name);
        }

        // Contoh menggunakan ArrayDeque
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        numbers.offerFirst(1);
        numbers.offerLast(2);
        numbers.offerFirst(3);
        numbers.offerLast(4);
        System.out.println("\nArrayDeque:");
        while (!numbers.isEmpty()) {
            System.out.println(numbers.pollFirst());
        }
    }
}