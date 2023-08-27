import java.util.*;
class CollectionDemo {
    public static void main(String[] args) {
    System.out.println("Arraylist Example");
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("SIze of al: "+ al.size());
        
        //Adding element to the Array
        al.add("A");
        al.add("S");
        al.add("F");

        al.add(2,"D");
        System.out.println("Size of al: "+ al.size());
        System.out.println(al);

    System.out.println("LinkedList Example");
        LinkedList<String> List = new LinkedList<String>();
        System.out.println("Size of List: "+ List.size());
        
        List.add("I");
        List.add("S");
        List.add("H");
        List.add("U");
        System.out.println("Size of List: "+ List.size());

        // Add an Character at the beginnning of the linked list 
        List.addFirst("A");
        System.out.println("Updated linked list: "+List);

        // Add an Character at the last of the linked list
        List.addLast("U");
        System.out.println("Updated linked list: "+List);

        // Add an Character at the at given index of the linked list
        List.add(2,"K");
        System.out.println("Updated linked list: "+List);

    System.out.println("Vector Example");
        Vector<Integer> vector = new Vector<>(3);
        
        // Add elements to the vector
        vector.add(1);
        vector.add(2);
        vector.add(3);
        
        // Print the contents of the vector
        System.out.println("Initial vector: " + vector);
        
        // Add more elements to the vector it will add because it adding dynamically
        vector.add(4);
        vector.add(4);
        
        // Print the contents of the vector again
        System.out.println("Updated vector: " + vector);

        
        System.out.println("Hashset Example");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Cat");
        hashSet.add("Dog");
        hashSet.add("Bird");
        System.out.println("HashSet: " + hashSet);
        
        System.out.println("Treeset Example");
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Orange");
        treeSet.add("Grapes");
        treeSet.add("Kiwi");
        System.out.println("TreeSet: " + treeSet);
    }
    
}
