package javaWeek6;

public class Card {
	// Enforce encapsulation
	private int value;
	private String name;
	
	// Get card value
	public int getValue() {
		return value;
	}
	
	// Setter is used by Deck class
	public void setValue(int value) {
		this.value = value;
	}
	
	// Get card name
	public String getName() {
		return name;
	}
	
	// Setter is used by Deck class
	public void setName(String name) {
		this.name = name;
	}
	
	// Debugging method to show card name and value
	public void describe() {
		System.out.println("Card name and value: " + name + " : " + value);
	}
	
}
