package com.mycompany.cap1606sortasc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cap1606sortAsc {

    public static void main(String[] args) {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        
        //Cria e exibe uma lista contendo os elementos do array suits
        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements: %s%n", list);
        
        Collections.sort(list);
        System.out.printf("Sorted array elements: %s%n", list);
    }
}
