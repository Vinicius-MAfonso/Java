import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static PrintStream stream = null;
    public static String[] number2 = {"A","B","C"};
    public static String[] number3 = {"D","E","F"};
    public static String[] number4 = {"G","H","I"};
    public static String[] number5 = {"J","K","L"};
    public static String[] number6 = {"M","N","O"};
    public static String[] number7 = {"P","R","S"};
    public static String[] number8 = {"T","U","V"};
    public static String[] number9 = {"W","X","Y"};
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o telefone com 7 números(Sem espaços ou traços): ");
        String number = input.nextLine();

        String[] splitedNumber = number.split("");
        String[] formedNumber = new String[7];
        try {
            stream = new PrintStream("registros.txt");
        }catch (FileNotFoundException e){
            System.err.println(e);
        }
        for(int i = 0;i < 3; i++){
            formedNumber[0] = numberToLetter(splitedNumber[0],i);
            for(int j = 0;j < 3;j++){
                formedNumber[1] = numberToLetter(splitedNumber[1],j);
                for(int y = 0;y < 3;y++){
                    formedNumber[2] = numberToLetter(splitedNumber[2],y);
                    for(int z = 0;z < 3;z++){
                        formedNumber[3] = numberToLetter(splitedNumber[3],y);
                        for(int h = 0;h < 3;h++){
                            formedNumber[4] = numberToLetter(splitedNumber[4],h);
                            for(int v = 0;v < 3;v++){
                                formedNumber[5] = numberToLetter(splitedNumber[5],v);
                                for(int k = 0;k < 3;k++){
                                    formedNumber[6] = numberToLetter(splitedNumber[6],k);
                                    stream.println(Arrays.toString(formedNumber));
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.print("Números gerados no arquivo \"registros.txt\"");
        stream.close();
    }
    public static String numberToLetter(String number, int position){
        switch (number){
            case "2" ->{
                return number2[position];
            }
            case "3" ->{
                return number3[position];
            }
            case "4" ->{
                return number4[position];
            }
            case "5" ->{
                return number5[position];
            }
            case "6" ->{
                return number6[position];
            }
            case "7" ->{
                return number7[position];
            }
            case "8" ->{
                return number8[position];
            }
            case "9" ->{
                return number9[position];
            }
        }
        return null;
    }
}