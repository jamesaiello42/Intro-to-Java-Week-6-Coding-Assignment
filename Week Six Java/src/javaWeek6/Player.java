package javaWeek6;

import java.util.ArrayList;
import java.util.List;

public class Player {
	// variable for player hand, their scores and the name of player
	private List<Card> hand;
	private int score;
	private String name;

	// In the constructor set score to zero, set name to empty string and create a hand object
	public Player () {
		score = 0;
		name = "";
		hand = new ArrayList<Card>();
	}
	
	// Debug function for what cards the player has in its deck and prints info about the player
	public void describe () {
		System.out.println(name + "'s Score so far: " + score + "\n" + name + "'s Hand:");
		
		// Go through card describe method display info about each card
		for (Card playerHand : hand) {
			playerHand.describe();
		}
		
		// Line for neatness
		System.out.println();
	}
	
	// Flip the first card and remove it
	public Card flip () {
		Card topCard = hand.get(0);
		hand.remove(0);
		return topCard;	
	}
	
	// Add a card from the deck to player's hand
	public void draw(Deck card)
	{
		hand.add(card.draw());
	}
	
	// increment score
	public void incrementScore() {
		score = getScore() + 1;
	}

	// Get player score
	public int getScore() {
		return score;
	}
	
	// Get the name of player
	public String getName() {
		return name;
	}

	// Name the player
	public void setName(String name) {
		this.name = name;
	}
}
