package cards;

public class Card {
    //Variaveis de instância
    private final String face;//Valor da carta
    private final String suit;//Naipe da carta
    //Contrutor que cria a carta com o valor e o naipe
    public Card(String cardFace, String cardSuit){
        this.face = cardFace;//Inicializa o valor da carta
        this.suit = cardSuit;//Inicializa o naipe da carta
    }
    @Override
    public String toString(){
        return face + " de " + suit;//Método toString que retorna o valor "of" naipe
    }   
}
