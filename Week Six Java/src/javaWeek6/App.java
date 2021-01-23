package javaWeek6;

/* This is the main driver for the game of War */

public class App {

	public static void main(String[] args) {
		// Variables the store player scores and who won
		int player1Value = 0, player2Value = 0;
		String whoWon;
		
		// Create a deck and shuffle it to randomize the game
		Deck deck = new Deck();
		deck.shuffle();
		
		// Create two players
		Player player1 = new Player();
		Player player2 = new Player();
		
		// Name Players
		player1.setName("Player 1");
		player2.setName("Player 2");
		
		// Split deck in half to give 26 cards to each player
		for (int i = 0; i < 26; i++) {
			player1.draw(deck);
			player2.draw(deck);
		}
		
		// Player flips card up and compares their cards to each other 
		for (int i = 0; i < 26; i++) {
			
			// Get the card value of the card each player flips up
			player1Value = player1.flip().getValue();
			player2Value = player2.flip().getValue();
			
			// Compare player cards and increment the score of player whose card value is greater than the other
			if (player1Value > player2Value) 
				player1.incrementScore();
			else if (player2Value > player1Value)
				player2.incrementScore();
			
		}
		
		// Determine if Player 1 wins, or Player 2 wins, of if the draw is a draw
		if (player1.getScore() > player2.getScore())
			whoWon = player1.getName();
		else if (player2.getScore() > player1.getScore())
			whoWon = player2.getName();
		else 
			whoWon = "Draw";
		
		// Print out scores of each player and who wins (or draw)
		System.out.println("Scores: \n" + "Player 1: " + player1.getScore() + "\nPlayer 2: " + player2.getScore() + "\n\nWho Won: \n" + whoWon);
	}

}
