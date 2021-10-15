package com.company.first;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Mapping {
    public static void main(String[] args) {
        Map<Integer, String> morning = new HashMap<>();
        morning.put(1,"prayer");
        morning.put(2,"clean");
        morning.put(null,"cook");
        morning.put(4,"bath");
        morning.put(5,"null");
        morning.put(1,"work");
        System.out.println(morning);
        System.out.println(morning.size());
        System.out.println(morning.get(1));
        System.out.println(morning.isEmpty());
        System.out.println(morning.containsKey(8));
        System.out.println(morning.containsValue("sleep"));
        System.out.println(morning.remove(3));
        Set<Integer> keySet = morning.keySet();
        System.out.println("data map keys = " + keySet);
        String hold = morning.get("cook");
        System.out.println(hold);
        String hold1 = morning.get(5);
        System.out.println(hold1);

        Set<String> test = new HashSet<>();
        test.add("11");
        test.add("10");
        test.add("9");
        test.add("8");
        test.add("7");
        test.add(null);
        test.add(null);
        System.out.println(test);

        Set<Map.Entry<Integer, String>> entrySet = morning.entrySet();
        System.out.println(entrySet);



    }
}
