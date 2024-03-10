package learn.note.data_structure;

import java.util.*;

public class ArrayStructure {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("String");
        String result = arrayList.get(0);
        System.out.println(result);
    }
}


class SomeStructure {
    public void example() {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        Stack<String> stack = new Stack<>();
        Vector<String> vector = new Vector<>();
    }
}