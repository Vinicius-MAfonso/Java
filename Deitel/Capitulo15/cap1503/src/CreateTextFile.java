import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Formatter;
import java.util.Scanner;

public class CreateTextFile {
    private static Formatter output;// Envia uma saída de texto para um arquivo
    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }
    //Abre o arquivo
    public static void openFile(){
        try{
            output = new Formatter("clientes.txt");//Abre o arquivo
        }catch(SecurityException securityException){
            System.err.println("Write permission denied. terminating.");
            System.exit(1);
        }
        catch (FileNotFoundException fileNotFoundException){
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }
    //Adiciona registros ao arquivo
    public static void addRecords(){
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n?",
                "Enter account number, first name, last name and balance.",
                "Enter end-of-file indicator to end input.");
        while(input.hasNext()){//faz um loop até o indicador de fim de arquivo
            try{
                //gera saída do novo registro para o arquivo
                output.format("%d %s %s %.2f%n", input.nextInt(),
                        input.next(), input.next(), input.nextDouble());
            }catch(FormatterClosedException formatterClosedException){
                System.err.println("Error writing to file termating.");
                break;
            }catch(NoSuchElementException noSuchElementException){
                noSuchElementException.getStackTrace();
                System.err.println("Invalid input. Please try again");
                input.nextLine();//Descara entrada para o usuário tentar de novo
            }
            System.out.println("?");
        }
    }//Fecha o arquivo
    public static void closeFile(){
        if(output != null){
            output.close();
        }
    }
}