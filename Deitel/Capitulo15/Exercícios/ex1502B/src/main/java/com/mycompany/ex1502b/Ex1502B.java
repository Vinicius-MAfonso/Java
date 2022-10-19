package com.mycompany.ex1502b;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Paths;

// Escreva uma instrução que abre o arquivo "trans.txt" para entrada — 
//utilize a variável Scanner inTransaction
public class Ex1502B {
private static Scanner inTransaction;
    public static void main(String[] args) {
       openFile();
       closeFile();
    }
    private static void openFile(){
        try{
            inTransaction = new Scanner(Paths.get("trans.txt"));
            System.out.println("Arquivo aberto");
        }catch(IOException ioe){
            System.err.println(ioe);
        }
    }
    private static void closeFile(){
         try{
            inTransaction.close();
            System.out.println("Arquivo fechado");
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
