package com.company.first;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class One {

    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(str.compareTo("DEF"));
        System.out.println(str.compareToIgnoreCase("abc"));


        String str1 = "www.journaldev.com";
        System.out.println("Last 4 char String: " + str1.substring(str1.length() - 4));
        System.out.println("First 4 char String: " + str1.substring(0, 4));
        System.out.println("website name: " + str1.substring(4, 14));

        String name = "Oluwafeyikemi";
        char[] test = name.toCharArray();
        System.out.println(test);
        System.out.println(test.length);
        for(int i =0; i < test.length; ++i){
//            System.out.println(test[i]);
            if(i == 9){
                break;
            }
            System.out.println(test[i]);

        }


        String name1 = "Oluwafeyikemi is an amazon";
        String[] test1 = name1.split(" ");
        System.out.println(Arrays.toString(test1));

        String u = "occupation";
        for(int i =0; i<u.length(); ++i){
            if(u.charAt(i) == 'a'){
                continue;
            }
            System.out.println(u.charAt(i));
        }

        byte[] test2 = name.getBytes(StandardCharsets.UTF_8);
        for(int i =0; i < test2.length; ++i){
            if(i == test2[8]){
                break;
            }
        }
        System.out.println(Arrays.toString(test2));
    }
}
