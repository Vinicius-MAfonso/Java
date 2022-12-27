package com.mycompany.cap1608sortcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cap1608sortComparator {

    public static void main(String[] args) {
       List<Time2> list = new ArrayList<>();
       
       list.add(new Time2(6, 24, 34));
       list.add(new Time2(18, 14, 58));
       list.add(new Time2(6, 05, 34));
       list.add(new Time2(12, 14, 58));
       list.add(new Time2(6, 24, 22));
       
       //Gera saída de elementos List
       System.out.printf("Unsorted array elements: %n%s%n", list);
       
       //Classifica em ordem utilizando o TimeComparator
       Collections.sort(list, new TimeComparator());
       
       //Gera saida de elementos list
        System.out.printf("Sorted list elements: %n%s%n",list);
    }
}
