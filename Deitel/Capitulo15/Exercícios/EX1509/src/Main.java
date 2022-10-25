import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static Scanner inputConsole = new Scanner(System.in);
    public static Scanner mail;
    public static Scanner  wordsbank;
    public static Scanner frequencyRead;
    public static Formatter frequencyEdit;
    public static void main(String[] args) {
        System.out.println("-=-=Verificador Anti-Phishing=-=-");
        System.out.print("""
                           Insira o mail no arquivo \"mail.txt\",
                           após isso pressione \"Enter\"""");
        System.out.print(":");
        inputConsole.nextLine();
        openFiles();
        getReport();
        System.out.println("Relatório gerado no arquivo frequency.txt!");
        closeFiles();
    }
    public static void openFiles(){
        try{
            mail = new Scanner(Paths.get("mail.txt"));
            wordsbank = new Scanner(Paths.get("wordsBank.txt"));
            frequencyEdit = new Formatter("frequency.txt");
            frequencyEdit.format("Palavra -=- Nº vezes%n");
            frequencyRead = new Scanner(Paths.get("frequency.txt"));
        }catch (IOException ioe){
            System.err.println(ioe);
            System.exit(1);
        }
    }
    public static void getReport(){
        int points = 0;
        ArrayList<String> mailList = new ArrayList<String>();
        ArrayList<String> wordsBankList = new ArrayList<String>();
        //Estruturas que dividem os textos em Arraylists
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
        //Verifica se há alguma palavra do banco de palavras
        for(String currentWordMail : mailList){
            for(int i = 0; i < wordsBankList.size(); i++){
                if(wordsBankList.get(i).matches("\\d+") && wordsBankList.get(i-1).equals(currentWordMail)){
                    getFrequency(wordsBankList.get(i-1));
                    points += Integer.parseInt(wordsBankList.get(i));
                }
            }
        }
        frequencyEdit.format("-=-=-=-=-=-=-");
        frequencyEdit.format("%nA sua pontuação foi de %d na escala pishing%n",points);
    }
    public static void getFrequency(String currentWord){
        int frequency = 1;
        while (frequencyRead.hasNext()){
            if(frequencyRead.next().equals(currentWord)){
                frequency  = frequencyRead.nextInt();
                frequency++;
            }
        }
        frequencyEdit.format("%s %5d vezes%n",currentWord,frequency);
    }
    public static void closeFiles(){
        mail.close();
        wordsbank.close();
        frequencyRead.close();
        frequencyEdit.close();
    }

}