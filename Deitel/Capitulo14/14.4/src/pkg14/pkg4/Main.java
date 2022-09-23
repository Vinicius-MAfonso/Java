package pkg14.pkg4;

public class Main {
  
    public static void main(String[] args) {
        String[] strings = {"started", "starting", "ended", "ending"};
        //testa o método startsWith
        for(String string : strings){
            if(string.startsWith("st"))
                System.out.printf("\"%s\" starts with \"st\"%n",string);
        }
        
        //testa o método startsWith iniciando da posição 2
            System.out.println("");
            for(String string : strings){
                if(string.startsWith("art",2))
                    System.out.printf("\"%s\" starts with \"art\" at position 2%n",string);
            }    
        
        //Testa o método endsWith
        for(String string : strings){
            if(string.endsWith("ed"))
                System.out.printf("\"%s\" ends with \"ed\"%n",string);
        }
    }
}
