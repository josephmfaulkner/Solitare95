package com.josephmfaulkner.solitare95.solitare.cardstack;

import java.util.LinkedList;

import com.josephmfaulkner.solitare95.solitare.card.Card;

public class CardStack {
	protected LinkedList<Card> cards; 
	
	public LinkedList<Card> getCards(){
		return this.cards; 
	}
	
	public CardStack() {
		this.cards = new LinkedList<Card>(); 
	}
	
	public CardStack(CardStack cardStack) {
		this.cards = cardStack.cards; 
	}
	
	public void transfer(int cardNum, CardStack otherStack) {
		int index = cardNum - 1; 
		if(index > this.cards.size() - 1) {
			throw new RuntimeException("Invalid Card Index: " + index);
		}
		
		for(int i = index; i >= 0; i--) {
			Card transferCard = this.cards.remove(i);
			otherStack.cards.push(transferCard);
		}
		
	}
	
	public boolean equals (CardStack otherStack) {
		if (this.cards.size() != otherStack.cards.size())
		{
			return false;
		}
		
		java.util.Iterator thisCardsItor = this.cards.iterator();
		java.util.Iterator<Card> otherCardsItor = otherStack.cards.iterator();
		
		while(thisCardsItor.hasNext() && otherCardsItor.hasNext()) {
			Card thisCard =  (Card) thisCardsItor.next();
			Card otherCard = (Card) otherCardsItor.next();
			
			if(!thisCard.equals(otherCard))
			{
				return false;
			}
		}
		
		return true; 
	}
	
}
