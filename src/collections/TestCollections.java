package collections;

import java.util.*;

public class TestCollections {
     public static void main(String[] args) {
         // add
         // get
         // remove
         // contains
         ArrayList <Integer> arrayList = new ArrayList<Integer>();

         arrayList.add(34);
         arrayList.add(89);
         arrayList.add(54);
         arrayList.remove(2);
//         for (int i = 0; i < arrayList.size(); i++) {
//             System.out.println(arrayList.get(i));
//             System.out.println(i);
//         }
        // Set содержит только уникальные елементы
         Set <String> testSet = new TreeSet<>();
         testSet.add("Test");
         testSet.add("Test 2");
         testSet.add("Test 3");
         testSet.add("Test");
         //System.out.println(testSet.size());


         Map<String, Integer> testMap = new HashMap<>();
         testMap.put("Key 1", 10);
         testMap.put("Key 2", 20);
         testMap.put("Key 3", 30);

         Set<String> keys = testMap.keySet();
         for (String key: keys) {
             System.out.println(key);
         }
         System.out.println(testMap.get("Key 3"));
     }

}
