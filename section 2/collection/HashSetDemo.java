// Write a java program to implement hash set  collection classes
import java.util.HashSet;

public class HashSetDemo {
  
  public static void main(String[] args) {
    
    // Creating a HashSet of integers
    HashSet<Integer> numbers = new HashSet<Integer>();
    
    // Adding elements to the HashSet
    numbers.add(5);
    numbers.add(10);
    numbers.add(15);
    numbers.add(20);
    
    // Removing an element from the HashSet
    numbers.remove(5);
    
    // Printing the size of the HashSet
    System.out.println("Size of HashSet: " + numbers.size());
    
    // Checking if an element is present in the HashSet
    boolean containsTen = numbers.contains(10);
    System.out.println("HashSet contains 10: " + containsTen);
    
    // Iterating over the HashSet using a for-each loop
    System.out.print("HashSet: ");
    for (int num : numbers) {
      System.out.print(num + " ");
    }
    System.out.println();
    
  }
  
}