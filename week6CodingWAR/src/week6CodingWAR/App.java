package week6CodingWAR;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		deck.shuffle();
		
		for (int i = 0; i < 52; i++) {
            player1.draw(deck);
            player2.draw(deck);
        }
		for (int i = 0; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			System.out.println("Player 1 flipped: ");
			card1.describe();
			System.out.println("Player 2 flipped: ");
			card2.describe();
			
			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				System.out.println("Player 1 gets a point");
			} else if (card1.getValue() < card2.getValue()) {
				player2.incrementScore();
				System.out.println("Player 2 gets a point");
			} else {
				System.out.println("It's a tie, which results in no points");
				
			}
		}
		System.out.println("Final Score - Player1: " + player1.getScore());
		System.out.println("Final Score - Player2: " + player2.getScore());
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 wins");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("Player 2 wins");
		} else {
			System.out.println("Its a tie");
		}

	}

}
