package com.mycompany.ex1503b;
        
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex1503B {

    public static void main(String[] args) {
        try{
            ObjectInputStream obj = 
                new ObjectInputStream(Files.newInputStream(Paths.get("trans.ser")));
        }catch(IOException ioe){
            System.err.println(ioe);
        }
       
    }
}
