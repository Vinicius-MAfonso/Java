package com.mycompany.cap1602;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Cap1602 {

    public static void main(String[] args) {
        String[] colors = {"MAGENTA","RED","WHITE","BLUE","CYAN"};
        List<String> list = new ArrayList<>();
        
        list.addAll(Arrays.asList(colors));
        
        String[] removeColors = {"RED","WHITE","BLUE"};
        List<String> removeList = new ArrayList<>();
        
        removeList.addAll(Arrays.asList(removeColors));
        
        System.out.println("ArrayList:");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s ",list.get(i));
        }
        
        removeColors(list, removeList);
        
        System.out.println("\n\nArrayList depois de chamar removeColors:");
        
        for(String color: list){
            System.out.printf("%s ",color);
        }
    }
    public static void removeColors(Collection <String> collection1,
            Collection<String> collection2) {
        Iterator<String> iterator = collection1.iterator();
        while(iterator.hasNext()){
            if(collection2.contains(iterator.next()))
            iterator.remove();
        }
        
    }
}
