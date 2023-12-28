package week6CodingWAR;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand; 
	private int score; 
	private String name; 
	
	public Player(String name) {
		this.name = name; 
		this.hand = new ArrayList<>();
		this.score = 0;
		
	
	}
	public void describe() {
		System.out.println("Player: " + name);
		for (Card card : hand) {
			card.describe();
		}
	}
	public Card flip() {
		if(hand.isEmpty()) {
			return null; 
		}
		return hand.remove(0); 
		
	}
	public void draw(Deck deck) {
		Card card = deck.draw();
		if (card != null) {
			hand.add(card); 
		}
	}
	public void incrementScore() {
		score++; 
		
	}
	public int getScore() {
		return score; 
		
		
	}

}
