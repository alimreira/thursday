package com.company;

import java.util.*;

public class Second {
    public static String[] one = new String[3];
    public static int[] two = new int[4];
    public static Integer[] two1 = new Integer[4];
    public static List[] two2 = new List[4];
    public static Set[] two3 = new Set[5];
    public static Map[] two4 = new Map[4];
    public static Iterator[] three = new Iterator[4];

    public static void main(String[] args) {
//Array of ArrayList
        List<Integer> three = new ArrayList<>(Arrays.asList(12,12,1,2,23,34,15,13));
        List<Integer> three1 = new ArrayList<>(Arrays.asList(21,12,11,22,20,34,15,13));
        List<Integer> three2 = new ArrayList<>(Arrays.asList(2,10,11,21,23,14,15,93));

        two2[0] = three;
        two2[1] = three1;
        two2[2] = three2;
        System.out.println(Arrays.asList(two2));
        int test = two2.length;
        System.out.println(test);

        //ArrayList of Array
        List<int[]> three3 = new ArrayList<>();
        int[] four = new int[4];
        int[] four1 = new int[4];
        int[] four2 = new int[4];
        int[] four3 = new int[4];
        three3.add(four);
        three3.add(four1);
        three3.add(four2);
        three3.add(four3);
        System.out.println(three3);

        int[] intArr = {1, 4, 2, 6, 3};
        String[] strArr = {"E", "A", "U","O","I"};
        //sort int array
        Arrays.sort(intArr);
        Arrays.sort(strArr);

        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(strArr));

        Collections.sort(three);
        System.out.println(three);

        List<String> strList = new ArrayList<String>();
        strList.add("A");
        strList.add("C");
        strList.add("B");
        strList.add("Z");
        strList.add("E");
        Collections.sort(strList);
        System.out.println(strList);


        //ArrayList to Array
        List<Integer> strList1 = new ArrayList<Integer>(Arrays.asList(12,12,1,2,23,34,15,13));
        Integer[] cup = strList1.toArray(new Integer[strList1.size()]);
        System.out.println(Arrays.toString(cup));
        Arrays.sort(cup);
        System.out.println(Arrays.toString(cup));

        //Array to ArrayList
        String[] spoon = new String[3];
        List<String> spoons = new ArrayList<>(Arrays.asList(spoon));
        System.out.println(spoons);



    }
}
