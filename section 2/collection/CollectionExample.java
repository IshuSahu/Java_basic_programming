import java.util.*;

public class CollectionExample {
    
    public static void main(String[] args) {
        
        // ArrayList example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        System.out.println("ArrayList: " + arrayList);
        
        // LinkedList example
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        System.out.println("LinkedList: " + linkedList);
        
        // HashSet example
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Cat");
        hashSet.add("Dog");
        hashSet.add("Bird");
        System.out.println("HashSet: " + hashSet);
        
        // TreeSet example
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Orange");
        treeSet.add("Grapes");
        treeSet.add("Kiwi");
        System.out.println("TreeSet: " + treeSet);
        
        // HashMap example
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        System.out.println("HashMap: " + hashMap);
        
        // TreeMap example
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Four", 4);
        treeMap.put("Five", 5);
        treeMap.put("Six", 6);
        System.out.println("TreeMap: " + treeMap);
    }
}