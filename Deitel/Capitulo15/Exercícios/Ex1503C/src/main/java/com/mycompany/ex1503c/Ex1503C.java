package com.mycompany.ex1503c;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;
import java.nio.file.Files;

public class Ex1503C {

    public static void main(String[] args) {
        try{
            ObjectOutputStream outNewMaster = 
                    new ObjectOutputStream(Files.newOutputStream(Paths.get("newmast.set")));
        }catch(IOException ioe){
            System.err.println(ioe);
        }
    }
}
