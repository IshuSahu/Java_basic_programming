// Write a java program to implement vector collection classes
import java.util.Vector;

public class VectorDemo {
  
  public static void main(String[] args) {
    
    // Creating a Vector of strings
    Vector<String> names = new Vector<String>();
    
    // Adding elements to the Vector
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");
    names.add("David");
    
    // Removing an element from the Vector
    names.remove(0);
    
    // Printing the size of the Vector
    System.out.println("Size of Vector: " + names.size());
    
    // Accessing an element in the Vector
    String first = names.get(0);
    
    // Printing the first element of the Vector
    System.out.println("First element: " + first);
    
    // Iterating over the Vector using a for-each loop
    System.out.print("Vector: ");
    for (String name : names) {
      System.out.print(name + " ");
    }
    System.out.println();
    
  }
  
}