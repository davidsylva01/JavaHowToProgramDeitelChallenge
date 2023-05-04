package deitelJavaHowToProgramChallenge.chapter7.cardShuffling;

import java.security.SecureRandom;

public class DeckOfCards {
    private static final SecureRandom random = new SecureRandom();
    public static int NUMBER_OF_CARDS = 52;

    private Card[] deckOfCards=new Card[NUMBER_OF_CARDS];
    private int currentCard;

    public DeckOfCards(){
        String[] faces ={"Ace","Deuce","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
        String[] suits ={"Diamonds","Spades","Clubs","Hearts"};

        for(int i=0;i<deckOfCards.length;i++){
            deckOfCards[i]=new Card(faces[i%13],suits[i/13]);
        }
    }
    public void shuffle(){
        int currentCard =0;
        for (int first=0;first<deckOfCards.length;first++){
            int second=random.nextInt(NUMBER_OF_CARDS);

            Card temp = deckOfCards[first];
            deckOfCards[first]=deckOfCards[second];
            deckOfCards[second]=temp;
        }
    }
    public Card dealCard(){
        if (currentCard<deckOfCards.length){
            return deckOfCards[currentCard++];
        }else {
            return null;
        }
    }
}
