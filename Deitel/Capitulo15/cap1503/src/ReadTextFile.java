//Leitura de arquivos e exibição
import java.io.IOException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadTextFile {
    private static Scanner input;
    public static void main(String[] args){
        openFile();
        readRecords();
        closeFile();
    }
    //Abre o arquivo clientes.txt
    public static void openFile(){
        try{
            input = new Scanner(Paths.get("clientes.txt"));
        }catch (IOException ioException){
            System.err.println("Error opening file");
            System.exit(1);
        }
    }
    //Lê o registro no arquivo
    public static void readRecords(){
        System.out.printf("%-10s%-12s%-12s%10s%n","Account","First name","Last Name","Balance");
        try {
            while (input.hasNext()){//Enquanto tiver mais registros
                System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(),
                        input.next(), input.next(), input.nextDouble());
            }
        }catch (NoSuchElementException noSuchElementException){
            System.err.println("File improperly formed, Terminating");
        }catch (IllegalStateException illegalStateException){
            System.err.println("Error reading from file. Terminating");
        }
    }
    public static void closeFile(){
        if(input != null)
            input.close();
    }
}
