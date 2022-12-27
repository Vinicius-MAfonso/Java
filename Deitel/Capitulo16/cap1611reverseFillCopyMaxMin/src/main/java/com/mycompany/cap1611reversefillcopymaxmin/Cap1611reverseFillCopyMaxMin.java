package com.mycompany.cap1611reversefillcopymaxmin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cap1611reverseFillCopyMaxMin {

    public static void main(String[] args) {
        Character[] letters = {'P','C','M'};
        List<Character> list = Arrays.asList(letters);
        System.out.println("list contains: ");
        output(list);
        
        //Inverte a lista
        Collections.reverse(list);
        System.out.printf("%nAfter calling reverse, list contains: %n");
        output(list);
        
        //Cria CopyList de um array de 3 caracteres
        Character[] lettersCopy = new Character[3];
        List<Character> copList = Arrays.asList(lettersCopy);
        
        //Copia o conteúdo da lista para CopyList
        Collections.copy(copList, list);
        System.out.printf("%nAfter copying, copyList contains: %n");
        output(list);
        
        //preenche a lista com R's
        Collections.fill(list, 'R');
        System.out.printf("%nAfter calling fill, list contains: %n");
        output(list);
    }

    private static void output(List<Character> list) {
        System.out.print("The list is: ");
        
        for(Character element : list)
            System.out.printf("%s ",element);
        
        System.out.printf("%nMax: %s",Collections.max(list));
        System.out.printf("%nMin: %s",Collections.min(list));
    }
}
