package cards;
import java.security.SecureRandom;

public class DeckOfCards {
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final SecureRandom randomNumbers = new SecureRandom();
    
    public DeckOfCards(){
        String[] faces = {"Às","Dois","Três","Quatro","Cinco","Seis","Sete","Oito",
            "Nove","Dez","Valete","Dama","Rei"};
        String[] suits = {"Copas","Ouro","Paus","Espadas"};
        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;
        
        for(int count = 0;count < deck.length;count++){
            deck[count] = new Card(faces[count%13], suits[count / 13]);
        }
    }
    public void shuffle(){
        currentCard = 0;
        
        for(int first = 0;first < deck.length; first++){
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp; 
        }
    }
    public Card dealCard(){
        if(currentCard < deck.length){
            return deck[currentCard++];
        }
        else{
            return null;
        }
    }
}
