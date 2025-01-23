package Collections.ArrayList;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("First fruit: " + fruits.get(0));

        //Replaces the element at the specified position in this list with the specified element
        fruits.set(1, "Blueberry");
        
        // Removing an element
        fruits.remove("Cherry");
        
        // Size of the ArrayList
        System.out.println("Number of fruits: " + fruits.size());

        // Iterating over elements
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
