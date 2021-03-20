import java.util.*;

public class Deck {

    private List<Card> deck;

    public Deck(List<Card> deck) {
        this.deck = deck;
    }

    public void changeOrder() {
        List<Card> newOrder = new ArrayList<Card>();

        Card[] cards = deck.toArray(new Card[12]);
        int z = cards.length;
        for (int i = 0; i < z; i++) {

            int n = (int) (Math.random() * 12);
            if (!newOrder.contains(cards[n])) {
                newOrder.add(cards[n]);
                System.out.println(cards[n].suit + " " + cards[n].value + " " + cards[n].trump);
                z = z + 2;
            }
        }
        newOrder.addAll(Arrays.asList(cards));

    }
}
