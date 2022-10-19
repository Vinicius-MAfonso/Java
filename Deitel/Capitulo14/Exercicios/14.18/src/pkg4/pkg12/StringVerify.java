package pkg4.pkg12;

import java.util.*;

public class StringVerify {
    private final String[] ALFABETO = {"A","B","C","D","E","F","G","H","I","J",
                                        "K","L","M","N","O","P","Q","R","S","T",
                                        "U","V","W","X","Y","Z"};
    private final ArrayList <StringBuilder> frequencyLetters;
    private final String string;
    private final List <String> letters;
    private final String[] arrayWords;
    private final ArrayList <String> numberOfLettersPerString = new ArrayList();
    private final ArrayList <String> repeatedWords = new ArrayList();
    
    public StringVerify(String string){
        this.string = string;
        //Tratamento da string
        string = string.trim().toUpperCase();
        this.arrayWords = string.split(" ");
        //Convertido para lista
        this.letters = Arrays.asList(string.split(""));
        this.frequencyLetters = new ArrayList<>();
        //Começa a criação da frequência
        for(String letra : getALFABETO()){
            //Condição verifica se a letra contém na frase
            if(getLetters().contains(letra)){        
                int vzsAparece = 0;
                //Verifica quantas vezes a letra aparece na frase
                for(int i = 0;i < getLetters().size();i++){
                    //Se aparecer aumenta a variavel
                    if(getLetters().get(i) == null ? letra == null : getLetters().get(i).equals(letra))
                        vzsAparece++;
                }
                //Adiciona a string completa ao array
                frequencyLetters.add(new StringBuilder(String.format("A letra %s aparece %d vezes", letra,vzsAparece)));
            }
        }
        //Localiza a maior palavra
        int biggestWord = 0;
        for(int i = 0;i < arrayWords.length;i++){
            if(i == 0)
                biggestWord = arrayWords[i].length();
            else
                if(arrayWords[i].length() > biggestWord)
                    biggestWord = arrayWords[i].length();
        }
        //Divive as palavras em tamanho
        int numberOfWords;
        for(int i = 0;i <= biggestWord;i++){
            numberOfWords = 0;
                for(String currentWord : arrayWords){
                   if(currentWord.length() == i){
                   numberOfWords++;
                   numberOfLettersPerString.add(String.format("%d palavras com %d letras", numberOfWords,i)); 
                }
            }
        }
        int numberOfrepeats = 0;
        for (String word : arrayWords) {
            numberOfrepeats = 0;
            String selectedWord = word;
            for(String currentWord : arrayWords)
                if(currentWord.equals(selectedWord))
                    numberOfrepeats++;
            if(numberOfrepeats > 1){
                if(!repeatedWords.contains(String.format("A palavra %s repetiu %d vezes", word,numberOfrepeats)))
                    repeatedWords.add(String.format("A palavra %s repetiu %d vezes", word,numberOfrepeats));
            }
        }
        
    }

    public List<StringBuilder> getFrequencyLetters() {
        return frequencyLetters;
    }

    private String[] getALFABETO() {
        return ALFABETO;
    }

    private List <String> getLetters() {
        return letters;
    }

    public List <String> getNumberOfLettersPerString() {
        return numberOfLettersPerString;
    }

    public ArrayList <String> getRepeatedWords() {
        return repeatedWords;
    }
    @Override
    public String toString(){
        return string;
    }
}
