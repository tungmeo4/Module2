package Bai12.DanhSachSinhVien;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Meo", 4);
        hashMap.put("MeoMeo", 3);
        hashMap.put("MeoMeoMeo", 2);
        hashMap.put("MeoMeoMeoMeo", 1);
        System.out.println("Display entries in Hashmap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Meo", 4);
        linkedHashMap.put("MeoMeo", 3);
        linkedHashMap.put("MeoMeoMeo", 2);
        linkedHashMap.put("MeoMeoMeoMeo", 1);
        System.out.println("\nThe age for " + "MeoMeoMeo is " + linkedHashMap.get("MeoMeoMeo"));
    }
}
