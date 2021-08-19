package com.josephmfaulkner.solitare95;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.josephmfaulkner.solitare95.solitare.cardstack.CardDeck;
import com.josephmfaulkner.solitare95.solitare.cardstack.CardDeckFactory;

class TestCardDeck {

	@Test
	void testNewCardDeck() {
		CardDeck deck =  CardDeckFactory.makeNewDeck();
		int deckSize = deck.getCards().size();
		
		assertEquals(52,deckSize);
	}
	
	@Test 
	void testShuffleDeck() {
		CardDeck deck1 = CardDeckFactory.makeNewDeck();
		CardDeck deck2 = CardDeckFactory.makeNewDeck();
		
		assertEquals(true, deck1.equals(deck2));
		
		deck2.shuffle();
		
		assertEquals(false, deck1.equals(deck2));
		
		assertEquals(52,deck1.getCards().size());
		assertEquals(52,deck2.getCards().size());
	}

}
