package com.josephmfaulkner.solitare95;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.josephmfaulkner.solitare95.solitare.cardstack.CardDeck;
import com.josephmfaulkner.solitare95.solitare.cardstack.CardDeckFactory;
import com.josephmfaulkner.solitare95.solitare.cardstack.CardStackSerializer;
import com.josephmfaulkner.solitare95.solitare.cardstack.CardStackSerializerImpl;

class TestStackSerializer {

	@Test
	void serializeNewDeck() {
		CardStackSerializer stackSerializer = new CardStackSerializerImpl();
		CardDeck deck = new CardDeckFactory().makeNewDeck();
		
		String serializedDeck = stackSerializer.serialize(deck);
		
		System.out.print(serializedDeck);
		
		CardDeck deSerializedDeck = new CardDeck(stackSerializer.deserialize(serializedDeck));
		
		Boolean stacksEqual = deck.equals(deSerializedDeck);
		assertEquals(true,stacksEqual);
	}
	
	@Test
	void serializeAndShuffle() {
		CardStackSerializer stackSerializer = new CardStackSerializerImpl();
		CardDeck deck = new CardDeckFactory().makeNewDeck();
		
		String serializedDeck = stackSerializer.serialize(deck);
		CardDeck deSerializedDeck = new CardDeck(stackSerializer.deserialize(serializedDeck));
		deSerializedDeck.shuffle();
		
		Boolean stacksEqual = deck.equals(deSerializedDeck);
		assertEquals(false,stacksEqual);
	}

}
