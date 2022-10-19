package com.mycompany.ex1503a;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Ex1503A {

    public static void main(String[] args) {
       Account ac = new Account("Vinicius", 123);
       try{
           ObjectInputStream inOldMaster = new ObjectInputStream(
            Files.newInputStream(Paths.get("oldmast.txt")));
       }catch(IOException ioe){
           System.err.println(ioe);
       }
    }
}
