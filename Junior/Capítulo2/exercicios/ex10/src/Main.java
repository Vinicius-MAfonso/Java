import java.util.Scanner;
public class Main {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.print("Digite o número[0-49]:");
        String input = in.nextLine();
        while (Integer.parseInt(input) > 49 || Integer.parseInt(input) < 0) {
            System.out.println("Entrada incorreta!");
            System.out.println("O número deve estar entre 0 e 49, tente novamente: ");
            input = in.nextLine();
        }

        String[] inputSplited = input.split("");

        if(inputSplited.length > 1){
            switch (inputSplited[0]){
                case "0" ->{
                    builder.append("");
                }
                case "1" ->{
                    switch (inputSplited[1]){
                        case "0" -> builder.append("DEZ");
                        case "1" -> builder.append("ONZE");
                        case "2" -> builder.append("DOZE");
                        case "3" -> builder.append("TREZE");
                        case "4" -> builder.append("QUATORZE");
                        case "5" -> builder.append("QUINZE");
                        case "6" -> builder.append("DEZESEIS");
                        case "7" -> builder.append("DEZESETE");
                        case "8" -> builder.append("DEZOITO");
                        case "9" -> builder.append("DEZENOVE");
                    }
                }
                case "2" ->{
                    builder.append("VINTE");
                    if(inputSplited[1] != "0")
                        builder.append(" E ").append(toExtensive(inputSplited[1]));
                }
                case "3" ->{
                    builder.append("TRINTA");
                    if(inputSplited[1] != "0")
                        builder.append(" E ").append(toExtensive(inputSplited[1]));
                }
                case "4" ->{
                    builder.append("QUARENTA");
                    if(inputSplited[1] != "0")
                        builder.append(" E ").append(toExtensive(inputSplited[1]));
                }
            }
        }else{
            builder.append(toExtensive(inputSplited[0]));
        }
        System.out.println(builder);

    }
    public static String toExtensive(String n){
        switch (n){
            case "0" -> {
                return "ZERO";
            }
            case "1" -> {
                return "UM";
            }
            case "2" ->{
                return "DOIS";
            }
            case "3" ->{
                return "TRÊS";
            }
            case "4" ->{
                return "QUATRO";
            }
            case "5" ->{
                return "CINCO";
            }
            case "6" ->{
                return "SEIS";
            }
            case "7" ->{
                return "SETE";
            }
            case "8" ->{
                return "OITO";
            }
            case "9" ->{
                return "NOVE";
            }
        }
        return null;
    }
}