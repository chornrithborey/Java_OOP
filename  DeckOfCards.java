public class DeckOfCards {
    public static void main(String[] args) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] cards = new String[52];
        int i,j,k;
        for(i=0;i< suits.length;i++){
            for (j=0;j< ranks.length;j++){
                System.out.println(ranks[j]+" of "+suits[i]);
                if(i==0){
                    for (k=j;k< cards.length;k++){
                        cards[k]=ranks[j]+" of "+suits[i];
                    }
                }
                if(i==1){
                    for (k=j+13;k < cards.length;k++){
                        cards[k]=ranks[j]+" of "+suits[i];
                    }
                }
                if(i==2){
                    for (k=j+26;k < cards.length;k++){
                        cards[k]=ranks[j]+" of "+suits[i];
                    }
                }
                if(i==3){
                    for (k=j+39;k < cards.length;k++){
                        cards[k]=ranks[j]+" of "+suits[i];
                    }
                }

            }
        }
        System.out.println("< == Shuffle == >");
        for (i = 0; i < cards.length; i++) {
            // Generate an index randomly
            int index = (int)(Math.random() * cards.length);
            String temp = cards[i];
            cards[i] = cards[index];
            cards[index] = temp;
            System.out.println(cards[i]);
        }
    }
}