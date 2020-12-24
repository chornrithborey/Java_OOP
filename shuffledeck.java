public class shuffleDeck {
    public static void main(String[] args) {
        String[] cards = {
                "Aceofspades",
                "2ofspades",
                "3ofspades",
                "4ofspades",
                "5ofspades",
                "6ofspades",
                "7ofspades",
                "8ofspades",
                "9ofspades",
                "10ofspades",
                "Jackofspades",
                "Queenofspades",
                "Kingofspades",
                "AceofHearts",
                "2ofHearts",
                "3ofHearts",
                "4ofHearts",
                "5ofHearts",
                "6ofHearts",
                "7ofHearts",
                "8ofHearts",
                "9ofHearts",
                "10ofHearts",
                "JackofHearts",
                "QueenofHearts",
                "KingofHearts",
                "AceofDiamonds",
                "2ofDiamonds",
                "3ofDiamonds",
                "4ofDiamonds",
                "5ofDiamonds",
                "6ofDiamonds",
                "7ofDiamonds",
                "8ofDiamonds",
                "9ofDiamonds",
                "10ofDiamonds",
                "JackofDiamonds",
                "QueenofDiamonds",
                "KingofDiamonds",
                "AceofClubs",
                "2ofClubs",
                "3ofClubs",
                "4ofClubs",
                "5ofClubs",
                "6ofClubs",
                "7ofClubs",
                "8ofClubs",
                "9ofClubs",
                "10ofClubs",
                "JackofClubs",
                "QueenofClubs",
                "KingofClubs"
        };
        String[] card_random=new String[52];

        for (String card : cards) {
            System.out.println(card);

        }
        System.out.println("< == Shuffle ==>");
        int i;
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