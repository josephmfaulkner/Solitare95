package com.josephmfaulkner.solitare95.core.cardstack;

import com.josephmfaulkner.solitare95.core.card.Card;
import com.josephmfaulkner.solitare95.core.card.CardSerializer;
import com.josephmfaulkner.solitare95.core.card.CardSerializerImpl;

public class CardStackSerializerImpl implements CardStackSerializer{
	
	public String serialize(CardStack stack) {
		CardSerializer cardSerializer = new CardSerializerImpl();
		StringBuilder stackSerialized = new StringBuilder();
		for(Card card: stack.cards) {
			stackSerialized.append(cardSerializer.serialize(card)).append(';');
		}
		return stackSerialized.toString();
	}
	
	
	public CardStack deserialize(String stackString) {
		CardSerializer cardSerializer = new CardSerializerImpl();
		CardStack stack = new CardStack();
		
		String[] cardStrings = stackString.split(";");
		for(String cardString: cardStrings) {
			Card card = cardSerializer.deserialize(cardString);
			stack.cards.add(card);
		}
		
		return stack; 
	}
}
