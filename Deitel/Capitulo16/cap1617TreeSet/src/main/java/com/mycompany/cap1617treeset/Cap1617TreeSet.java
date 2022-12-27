package com.mycompany.cap1617treeset;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Cap1617TreeSet {

    public static void main(String[] args) {
       //Cria TreeSet a partir do array colors
       String[] colors = {"yellow","green","black","tan","grey","white",
       "orange","red","green"};
       SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));
       
        System.out.print("Sorted set: ");
        printSet(tree);
        
        //Obtém headSet com base em "orange"
        System.out.print("headSet(\"orange\"): ");
        printSet(tree.headSet("orange"));
        
        //Obtém tailSet baseado em "orange"
        System.out.print("tailSet(\"orange\"): ");
        printSet(tree.tailSet("orange"));
        
        //Obtém primeiro e ultimo elementos
        System.out.printf("first: %s%n",tree.first());
        System.out.printf("last: %s%n",tree.last());
    }
    private static void printSet(SortedSet<String> set){
        for(String s : set){
            System.out.printf("%s ",s);
        }
        System.out.println();
    }
}
