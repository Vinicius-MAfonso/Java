package pkg14.pkg23;

public class Main {

    public static void main(String[] args) {
        String firstString = "This sentence ends int 5 stars *****";
        String secondString = "1, 2, 3, 4, 5, 6, 7, 8";
        
        //substitui * por ^
        firstString = firstString.replaceAll("\\*", "^");
        System.out.printf("^ substituted for *: %s%n", firstString);
        //Substitui asteristicos por circunflexos
        firstString = firstString.replaceAll("stars", "carets");
        System.out.printf
            ("\"carets\" substituted for \"starts\": %s%n",firstString);
        //Substitui palavras por 'palavra'
        System.out.printf("Every word replaced by \"word\": %s%n%n",
                firstString.replaceAll("\\w+", "word"));
        System.out.printf("Original string 2: %s%n%n", secondString);
        //Substitui os primeiros três digitos pelo 'digito'
        for (int i = 0; i < 3; i++) {
            secondString = secondString.replaceFirst("\\d", "digit");
        }
        System.out.printf(
                "First 3 digits replaced by \"digit\" : %s%n", secondString);
        System.out.println("String split at commas: ");
        String[] result = secondString.split(",\\s*");
        for(String currentResult : result)
            System.out.println(currentResult);
        
    }
    
}
