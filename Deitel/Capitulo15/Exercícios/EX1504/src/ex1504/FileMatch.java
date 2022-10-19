package ex1504;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.io.IOException;

public class FileMatch {
    Scanner oldMastFile;
    Scanner transFile;
    Formatter newmas = new Formatter("newmas.txt");
    public FileMatch(Path oldMastPath, Path transPath) throws IOException{
        try{
            oldMastFile = new Scanner(oldMastPath);
        }catch(FileNotFoundException fileNotFoundException){
            System.err.println(fileNotFoundException);
        }
        try{
            transFile = new Scanner(transPath);
        }catch(FileNotFoundException fileNotFoundException){
            System.err.println(fileNotFoundException);
        }
    }
    public void transAndOldMatch(){
        while(oldMastFile.hasNext()){
            while(transFile.hasNext()){
                if(oldMastFile.nextInt() == transFile.nextInt()){
                    newmas.format("%d %s %s %.2f",
                            oldMastFile.nextInt(),oldMastFile.next(),
                            oldMastFile.next(),oldMastFile.nextDouble() );
                }
            }
        }
    }
    
}
