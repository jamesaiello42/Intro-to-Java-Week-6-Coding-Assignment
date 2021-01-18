package javaWeek6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards;
	
	public Deck() {
		cards = new ArrayList<Card>();
		int j = 0;
		
		String ranks [] = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		String suits[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
		
		for (int i = 2; i <= 14; i++) {		
			for (int k = 1; k <= 4; k++) {			
				cards.add(new Card());
				cards.get(j).setValue(i);
				cards.get(j).setName(ranks[i - 2] + " of " + suits[k - 1]);		
				j++;
			}
		}
			
	}
	
	public void shuffle() {
		for (int i = 0; i < 52; i++) 
			Collections.swap(cards, i, (int)(Math.random() * 51));
	}
	
	public Card draw() {
		Card topCard = cards.get(0);
		cards.remove(0);
		System.out.println(cards.size());
		return topCard;		
	}
}
