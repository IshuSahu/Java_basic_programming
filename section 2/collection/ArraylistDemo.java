// Write a java program to implement Array list collection classes
import java.util.ArrayList;

public class ArraylistDemo {
  
  public static void main(String[] args) {
    
    // Creating an ArrayList of integers
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    
    // Adding elements to the ArrayList
    numbers.add(5);
    numbers.add(10);
    numbers.add(15);
    numbers.add(20);
    
    // Removing an element from the ArrayList
    numbers.remove(0);
    
    // Printing the size of the ArrayList
    System.out.println("Size of ArrayList: " + numbers.size());
    
    // Accessing an element in the ArrayList
    int first = numbers.get(0);
    
    // Printing the first element of the ArrayList
    System.out.println("First element: " + first);
    
    // Iterating over the ArrayList using a for-each loop
    System.out.print("ArrayList: ");
    for (int num : numbers) {
      System.out.print(num + " ");
    }
    // System.out.print("ArrayList: " + numbers);
    System.out.println();
    
  }
  
}