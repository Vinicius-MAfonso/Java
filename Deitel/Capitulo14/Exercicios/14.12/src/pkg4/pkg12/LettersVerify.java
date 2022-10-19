package pkg4.pkg12;

import java.util.*;

public class LettersVerify {
    private final String[] ALFABETO = {"A","B","C","D","E","F","G","H","I","J",
                                        "K","L","M","N","O","P","Q","R","S","T",
                                        "U","V","W","X","Y","Z"};
    private final List <StringBuilder> frequency;
    private final List <String> phrase;
    
    public LettersVerify(String string){
        //Tratamento da string
        string = string.trim().toUpperCase();
        //Divisão em array
        String[] arrayPhrase = string.split("");
        //Convertido para lista
        this.phrase = Arrays.asList(arrayPhrase);
        this.frequency = new LinkedList<>();
        //Começa a criação da frequência
        for(String letra : getALFABETO()){
            //Condição verifica se a letra contém na frase
            if(getPhrase().contains(letra)){        
                int vzsAparece = 0;
                //Verifica quantas vezes a letra aparece na frase
                for(int i = 0;i < getPhrase().size();i++){
                    //Se aparecer aumenta a variavel
                    if(getPhrase().get(i) == null ? letra == null : getPhrase().get(i).equals(letra))
                        vzsAparece++;
                }
                //Adiciona a string completa ao array
                frequency.add(new StringBuilder(String.format("A letra %s aparece %d vezes", letra,vzsAparece)));
            }
        }
    }

    List<StringBuilder> getFrequency() {
        return frequency;
    }

    private String[] getALFABETO() {
        return ALFABETO;
    }

    private List <String> getPhrase() {
        return phrase;
    }
   
}
