package javaWeek6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	// Deck of cards
	private List<Card> cards;
	
	// Create the deck of cards when object is created
	public Deck() {
		cards = new ArrayList<Card>();
		int j = 0;
		
		// Two array of strings to assist in naming the cards. They are marked final because there is no need to change elements
		final String ranks [] = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		final String suits [] = {"Clubs", "Diamonds", "Hearts", "Spades"};
		
		// Add cards to list, set value and name of each card
		// There is a loop for ranks and suits each
		for (int i = 2; i <= 14; i++) {		
			for (int k = 1; k <= 4; k++) {			
				cards.add(new Card());
				cards.get(j).setValue(i);
				cards.get(j).setName(ranks[i - 2] + " of " + suits[k - 1]);		
				j++;
			}
		}
			
	}
	
	// Shuffle up the card deck, by randomly swapping them
	public void shuffle() {
		for (int i = 0; i < 52; i++) 
			Collections.swap(cards, i, (int)(Math.random() * 51));
	}
	
	// Remove the top from the deck and return it
	public Card draw() {
		Card topCard = cards.get(0);
		cards.remove(0);
		return topCard;		
	}
}
