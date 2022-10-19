package com.mycompany.ex1502d;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Paths;
//Escreva as instruções necessárias para ler um registro do arquivo "oldmast.txt". 
//Use os dados para criar um objeto da classe Account — 
//utilize a variável Scanner inOldMaster. Suponha que essa classe Account é idêntica àquela na Figura 15.9
public class Ex1502D {
private static Scanner inOldMaster;
    public static void main(String[] args) {
        openFile();
        readFile();
        closeFile();
    }
    private static void openFile(){
        try{
            inOldMaster = new Scanner(Paths.get("oldmast.txt"));
        }catch(IOException ioe){
            System.err.println(ioe);
            System.exit(1);
        }
    }
    private static void readFile(){
        while(inOldMaster.hasNext()){
            System.out.printf("%d %5s %5s",
                    inOldMaster.nextInt(), inOldMaster.next(), inOldMaster.next());
        }
        
    }
    private static void closeFile(){
        try{
            inOldMaster.close();
        }catch(Exception e){
            System.err.println(e);
            System.exit(1);
        }
    }
}
