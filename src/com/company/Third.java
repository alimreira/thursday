package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Third {
    public static void main(String[] args) {
        //Array to set
        Integer[] arr = new Integer[4];
        //Arrays.asList(arr);

    Set<Integer> one = new HashSet<Integer>(Arrays.asList(arr));
        System.out.println(one);
        System.out.println(one.size());

        //Set to array
    Set<String> two = new HashSet<>();
    String[] arr1 = two.toArray(new String[3]);
        System.out.println(Arrays.toString(arr1));

    }
}
