import java.util.ArrayList;
import java.util.*;
public class DeckOfCardsArrayList {
    public static void main(String[] args){
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        ArrayList<String> cards = new ArrayList<>();
        int i,j,k;
        for(i=0;i< suits.length;i++){
            for (j=0;j< ranks.length;j++){
                cards.add(ranks[j]+"of"+suits[i]);
            }
        }
        System.out.println("< == shuffle ==>");
        System.out.println(cards);

		
		Collections.shuffle(cards);
        System.out.println(cards);
	
      





    }
}