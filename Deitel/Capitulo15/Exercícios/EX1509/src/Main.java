import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Formatter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class Main {
    public static Scanner inputConsole = new Scanner(System.in);
    public static Scanner mail;
    public static Scanner  wordsbank;
    public static void main(String[] args) {
        System.out.println("-=-=Verificador Anti-Phishing=-=-");
        System.out.print("""
                           Insira o mail no arquivo \"mail.txt\",
                           após isso pressione \"Enter\"""");
        System.out.print(":");
        inputConsole.nextLine();
        abrirArquivos();
        getReport();
        closeFiles();
    }
    public static void abrirArquivos(){
        try{
            mail = new Scanner(Paths.get("mail.txt"));
            wordsbank = new Scanner(Paths.get("wordsBank.txt"));
        }catch (IOException ioe){
            System.err.println(ioe);
            System.exit(1);
        }
    }
    public static void getReport(){
        int pontuacao = 0;
        ArrayList<String> mailList = new ArrayList<String>();
        ArrayList<String> wordsBankList = new ArrayList<String>();
        while (mail.hasNext())
            try{
                mailList.add(mail.next().toUpperCase().trim());
            }catch (Exception e){
                System.err.println(e);
            }

        while (wordsbank.hasNext())
            try{
                wordsBankList.add(wordsbank.next().toUpperCase().trim());
            }catch (Exception e){
                System.err.println(e);
            }

        for(String currentWordMail : mailList){
            for(int i = 0; i < wordsBankList.size(); i++){
                if(wordsBankList.get(i).matches("\\d+") && wordsBankList.get(i-1).equals(currentWordMail)){
                    pontuacao += Integer.parseInt(wordsBankList.get(i));
                }
            }
        }

        System.out.printf("A sua pontuação foi de %d%n",pontuacao);
    }
    public static void closeFiles(){
        mail.close();
        wordsbank.close();
    }

}