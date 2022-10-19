package com.mycompany.ex1502c;
//Escreva uma instrução que abre arquivo "newmast.txt" para saída (e criação) 
//— utilize a variável formatter outNewMaster.
import java.io.IOException;
import java.util.Formatter;
public class Ex1502C {
private static Formatter outNewMaster;
    public static void main(String[] args) {
        openFile();
        closeFile();
    }
     private static void openFile(){
        try{
            outNewMaster = new Formatter("newmast.txt");
            System.out.println("Arquivo aberto e/ou criado");
        }catch(IOException ioe){
            System.err.println(ioe);
        }
    }
    private static void closeFile(){
         try{
            outNewMaster.close();
            System.out.println("Arquivo fechado");
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
