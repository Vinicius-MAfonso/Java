package com.mycompany.cap1603linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Cap1603LinkedList {

    public static void main(String[] args) {
        String[] colors1 = {"black","yellow","green","blue","violet","silver"};
        List<String> list1 = new LinkedList<>();
        
        String[] colors2 = {"gold","white","brown","blue","gray","silver"};
        List<String> list2 = new LinkedList<>();
        
        list1.addAll(Arrays.asList(colors1));
        list2.addAll(Arrays.asList(colors2));
        
        list1.addAll(list2); //concatena as duas listas
        list2 = null;
        printList(list1);
        
        convertToUppercaseStrings(list1);
        printList(list1);
        
        System.out.println("\nDeleting elements 4 to 6");
        removeItems(list1, 4, 7);
        printList(list1);
        printReversedList(list1);
    }
    
    private static void printList(List<String> list) {
        System.out.println("List:");
        
        for(String color : list){
            System.out.printf("%s ",color);
        }
        System.out.println();
    }

    private static void convertToUppercaseStrings(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        
        while(iterator.hasNext()){
            String color = iterator.next(); //Obtém o item
            iterator.set(color.toUpperCase());  //Converte em letras maiúsculas
        }
    }
    
    private static void removeItems(List<String> list, int start, int end){
        list.subList(start, end).clear();
    }
    
    private static void printReversedList(List<String> list){
        ListIterator<String> iterator = list.listIterator(list.size());
        System.out.printf("%nReversed List:%n");
        
        //Imprime lista na ordem inversa
        while(iterator.hasPrevious())
            System.out.printf("%s ", iterator.previous());
    }
}
