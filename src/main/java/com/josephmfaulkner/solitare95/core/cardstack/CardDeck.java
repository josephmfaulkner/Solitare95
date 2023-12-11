package com.josephmfaulkner.solitare95.core.cardstack;

import java.util.Collections;

import com.josephmfaulkner.solitare95.core.card.Card;

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
		if(this.cards.size() > 0) {
			
			Card topCard = this.cards.removeFirst();
			if(topCard.getFacing() == Card.Facing.UP)
			{
				topCard.flip();
			}
			this.cards.addLast(topCard);
			
			Card newTopCard = this.cards.getFirst();
			if(newTopCard.getFacing() == Card.Facing.DOWN)
			{
				newTopCard.flip();
			}
		}
	}

	public void addCard(Card card) {
		this.cards.add(card);
	}
	
	
}
