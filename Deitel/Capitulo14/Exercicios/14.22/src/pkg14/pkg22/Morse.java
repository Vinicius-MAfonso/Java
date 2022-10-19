package pkg14.pkg22;

import java.text.Normalizer;
import java.util.regex.Pattern;

public final class Morse {
    private final String[] ALPHABET = {"A","B","C","D","E","F","G","H","I","J",
                                        "K","L","M","N","O","P","Q","R","S","T",
                                        "U","V","W","X","Y","Z"};
    private final String[] MORSE_ALPHABET = {".-","-...","-.-.","-..",".","..-.",
                                             "--.","....","..",".---","-.-",".-..",
                                             "--","-.","---",".--.","--.-",".-.",
                                             "...","-","..-","...-",".--","-..-",
                                             "-.--","--.. "};
    private String languageText;
    private String morseText;
    private String[] arrayText;
    
    public Morse(String text){
        text = stringThreatment(text);
        if(!text.isBlank()){
            if(text.contains("-")||text.contains(".")){
                System.out.println("Código morse encontrado!");
                this.morseText = text;
                this.arrayText = text.split("   ");
            }
            if(text.matches("\\w*")){
                System.out.println("Idioma comum encontrado!");
                this.languageText = text;
                this.arrayText = text.split(" ");
            }
        }else{
            throw new IllegalArgumentException("Texto vázio");
        }
    }
    
    private String stringThreatment(String text){
        text = text.trim().strip().toUpperCase();
        String normalizer = Normalizer.normalize(text, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalizer).replaceAll("");
    }
    public String convertAlphabeticToMorse(){
        StringBuilder builder = new StringBuilder();
        for(String currentWord : getArrayText()){
            char[] letters = currentWord.toCharArray();
            for(char currentLetter : letters){
                for(int i = 0;i < getALPHABET().length; i++){
                    if(Character.toString(currentLetter).equals(getALPHABET()[i])){
                        builder.append(getMORSE_ALPHABET()[i]).append("   ");
                    }
                }
            }
        }
        return builder.toString();
    }
    
    public String convertMorseToAlphabetic(){
        StringBuilder builder = new StringBuilder();
        for(String currentCode : getArrayText()){
            for(int i = 0;i < getMORSE_ALPHABET().length;i++){
                if(getMORSE_ALPHABET()[i].equals(currentCode)){
                    builder.append(getALPHABET()[i]);
                }
            }
            builder.append(" ");
        }
        return builder.toString();
    }

    public String[] getALPHABET() {
        return ALPHABET;
    }

    public String[] getMORSE_ALPHABET() {
        return MORSE_ALPHABET;
    }

    public String getLanguageText() {
        return languageText;
    }

    public String getMorseText() {
        return morseText;
    }

    public String[] getArrayText() {
        return arrayText;
    }
    @Override
    public String toString(){
        if(getLanguageText() == null){
            return String.format("Formato em código MORSE: %s%nFormato alfabético: %s%n", 
                getMorseText(),convertMorseToAlphabetic());
        }
        else{
            return String.format("Formato em código MORSE: %s%nFormato alfabético: %s%n", 
                convertAlphabeticToMorse(),getLanguageText());
        }
    }
}