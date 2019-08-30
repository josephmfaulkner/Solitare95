package solitare.cardstack;

import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

import solitare.card.Card;

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
