package com.mycompany.cap1604aslistandtoarray;
import java.util.LinkedList;
import java.util.Arrays;

public class Cap1604asListAndToArray {

    public static void main(String[] args) {
        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));
        links.addLast("red");
        links.add("pink");
        links.add(3,"green");
        links.addFirst("cyan");
        
        //Obtém elementos LinkedList como aray
        colors = links.toArray(new String[links.size()]);
        
        System.out.println("colors: ");
        
        for(String color : colors)
            System.out.println(color);
    }
}
