package javaWeek6;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand;
	private int score;
	private String name;
	 
	public Player () {
		score = 0;
		hand = new ArrayList<Card>();
	}
	
	public void describe () {
		for (Card playerHand : hand)
			playerHand.describe();
	}
	
	public Card flip () {
		Card topCard = hand.get(0);
		hand.remove(0);
		return topCard;	
	}
	
	public void draw(Deck card)
	{
		hand.add(card.draw());
	}
	
	public void incrementScore() {
		score++;
	}
}
