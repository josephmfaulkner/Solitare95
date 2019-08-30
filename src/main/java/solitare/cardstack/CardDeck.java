package solitare.cardstack;

import java.util.Collections;

import solitare.card.Card;

public class CardDeck extends CardStack{
	public CardDeck() {
		super();
		
	}
	
	public CardDeck(CardStack cardStack) {
		super(cardStack); 
	}
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public void nextCard() {
		
	}
	
	public void drawCard() {
		
	}

	public void addCard(Card card) {
		this.cards.add(card);
		
	}
	
	
}
