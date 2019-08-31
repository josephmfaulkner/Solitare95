import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import solitare.cardstack.CardDeck;
import solitare.cardstack.CardDeckFactory;
import solitare.cardstack.CardStack;
import solitare.cardstack.CardStackSerializer;
import solitare.cardstack.CardStackSerializerImpl;

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
