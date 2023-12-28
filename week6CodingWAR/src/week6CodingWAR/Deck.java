package week6CodingWAR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Deck {
	private List<Card> cards; 
	
	public Deck() {
		cards = new ArrayList<>();
		initializeDeck();
		
	}
	
	private void initializeDeck() {
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] values = {"2", "3", "4", "5", "6",	"7", "8", "9", "10", "Jack", "Queen", "King", "Ace"}; 
		
		for (String suit : suits) {
			for (String value : values) {
				String cardName = value + " of " + suit; 
				cards.add(new Card(getCardValue(value), cardName));
				
			}
		}
	}
	private int getCardValue(String value) {
		switch (value) {
		case "Jack":
			return 11;
		case "Queen":
			return 12; 
		case "King":
			return 13;
		case "Ace":
			return 14;
		default:
			return Integer.parseInt(value);
			
		}
	} 
	public void shuffle() {
		Collections.shuffle(cards);
		
	}
	public Card draw() {
		if (cards.isEmpty()) {
			return null; 
		}
		return cards.remove(0);
		
	}

}
