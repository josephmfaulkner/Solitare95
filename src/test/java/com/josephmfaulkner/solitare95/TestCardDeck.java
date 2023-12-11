package com.josephmfaulkner.solitare95;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.josephmfaulkner.solitare95.core.card.Card;
import com.josephmfaulkner.solitare95.core.cardstack.CardDeck;
import com.josephmfaulkner.solitare95.core.cardstack.CardDeckFactory;

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

	@Test 
	void testDrawOneCard(){

		CardDeck testDeck = createTestDeck();
		testDeck.drawCard();

		Card topCard = testDeck.getCards().getFirst();
		assertEquals(Card.Rank.KING, topCard.getRank());
		assertEquals(Card.Suite.CLUBS, topCard.getSuite());
		assertEquals(Card.Facing.UP, topCard.getFacing());

		Card bottomCard = testDeck.getCards().getLast();
		assertEquals(Card.Rank.ACE, bottomCard.getRank());
		assertEquals(Card.Suite.SPADES, bottomCard.getSuite());
		assertEquals(Card.Facing.DOWN, bottomCard.getFacing());


	}

	private static CardDeck createTestDeck() {
		CardDeck testDeck = new CardDeck();
		testDeck.addCard(new Card(Card.Rank.ACE,   Card.Suite.SPADES,   Card.Facing.DOWN));
		testDeck.addCard(new Card(Card.Rank.KING,  Card.Suite.CLUBS ,   Card.Facing.DOWN));
		testDeck.addCard(new Card(Card.Rank.TEN,   Card.Suite.DIAMONDS, Card.Facing.DOWN));
		testDeck.addCard(new Card(Card.Rank.TWO,   Card.Suite.HEARTS,   Card.Facing.DOWN));
		return testDeck; 
	}

}
