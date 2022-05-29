package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        //    key     value
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10,"Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Ahmet");
        hashMap.put(5, "Isabella");
        hashMap.put(6, null);
        hashMap.put(7, null);
        hashMap.put(8, null);
        hashMap.put(null, null);
        hashMap.put(null, "Emre");
        hashMap.put(null, "Hulya");

        System.out.println("hashMap = " + hashMap);//hashMap = {null=Hulya, 3=Jack, 20=George, 5=Isabella, 6=null, 7=null, 40=Emma, 8=null, 10=Arthur}


        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Ahmet");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(null, "Hulya");

        System.out.println("linkedHashMap = " + linkedHashMap);//linkedHashMap = {10=Arthur, 20=George, 3=Jack, 40=Emma, 5=Isabella, null=Hulya}


        Map<Integer, String> treeMap = new TreeMap<>();

        Map<Integer, String> hashtable = new Hashtable<>();


    }
}
