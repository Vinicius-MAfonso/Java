package com.mycompany.cap1612binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cap1612binarySearch {

    public static void main(String[] args) {
        String[] colors = {"red","white","blue", "yellow",
            "purple", "tan", "pink"};
        List<String> list = new ArrayList<>(Arrays.asList(colors));
        
        Collections.sort(list);
        System.out.printf("Sorted ArrayList %s%n",list);
        
        printSearchResults(list, "black");
        printSearchResults(list, "red");
        printSearchResults(list, "pink");
        printSearchResults(list, "aqua");//Não existe
        printSearchResults(list, "gray");//Não existe
        printSearchResults(list, "teal");//Não existe
    }
    private static void printSearchResults(List<String> list, String key){
        int result = 0;
        System.out.printf("%nSearching for: %s%n",key);
        result = Collections.binarySearch(list, key);
        if(result >= 0)
            System.out.printf("Fount at index %d%n", result);
        else
            System.out.printf("Not found(%d)%n", result);
    }
}
