package lab4;

public class Card {
        private String rank;
        private String suit;
        private int id;

        // constructor
        public Card(String rank, String suit, int id) {
                this.rank = rank;
                this.suit = suit;
                this.id = id;
        }

        // getter methods
        String rank() {
                return rank;
        }

        String suit() {
                return suit;
        }

        int id() {
                return id;
        }

        // matches method
        boolean matches(Card c2) {
                if (this.rank == c2.rank)
                        if (this.suit == c2.suit)
                                return true;
                return false;
        }
}
