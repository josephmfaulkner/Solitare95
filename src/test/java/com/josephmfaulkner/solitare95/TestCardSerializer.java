package com.josephmfaulkner.solitare95;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.josephmfaulkner.solitare95.solitare.card.Card;
import com.josephmfaulkner.solitare95.solitare.card.Card.Facing;
import com.josephmfaulkner.solitare95.solitare.card.Card.Rank;
import com.josephmfaulkner.solitare95.solitare.card.Card.Suite;
import com.josephmfaulkner.solitare95.solitare.card.CardSerializer;
import com.josephmfaulkner.solitare95.solitare.card.CardSerializerImpl;

class TestCardSerializer {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	
	}

	@Test
	void serializeCard1() {
		CardSerializer cardSerializer = new CardSerializerImpl();
		
		Card originalCard = new Card(Rank.ACE,Suite.SPADES,Facing.UP);
		String serializedCard = cardSerializer.serialize(originalCard);
		Card copyOfCard = cardSerializer.deserialize(serializedCard);
		
		assertEquals(originalCard.getRank(),  copyOfCard.getRank());
		assertEquals(originalCard.getSuite(), copyOfCard.getSuite());
		assertEquals(originalCard.getFacing(),copyOfCard.getFacing());
		assertEquals(originalCard.getColor(), copyOfCard.getColor());
		
	}
	
	@Test
	void serializeCard2() {
		CardSerializer cardSerializer = new CardSerializerImpl();
		
		Card originalCard = new Card(Rank.TEN,Suite.CLUBS,Facing.UP);
		String serializedCard = cardSerializer.serialize(originalCard);
		Card copyOfCard = cardSerializer.deserialize(serializedCard);
		
		assertEquals(originalCard.getRank(),  copyOfCard.getRank());
		assertEquals(originalCard.getSuite(), copyOfCard.getSuite());
		assertEquals(originalCard.getFacing(),copyOfCard.getFacing());
		assertEquals(originalCard.getColor(), copyOfCard.getColor());
		
	}
	@Test
	void serializeCard3() {
		CardSerializer cardSerializer = new CardSerializerImpl();
		
		Card originalCard = new Card(Rank.KING,Suite.HEARTS,Facing.UP);
		String serializedCard = cardSerializer.serialize(originalCard);
		Card copyOfCard = cardSerializer.deserialize(serializedCard);
		
		assertEquals(originalCard.getRank(),  copyOfCard.getRank());
		assertEquals(originalCard.getSuite(), copyOfCard.getSuite());
		assertEquals(originalCard.getFacing(),copyOfCard.getFacing());
		assertEquals(originalCard.getColor(), copyOfCard.getColor());
		
	}
	@Test
	void serializeCard4() {
		CardSerializer cardSerializer = new CardSerializerImpl();
		
		Card originalCard = new Card(Rank.FIVE,Suite.DIAMONDS,Facing.UP);
		String serializedCard = cardSerializer.serialize(originalCard);
		Card copyOfCard = cardSerializer.deserialize(serializedCard);
		
		assertEquals(originalCard.getRank(),  copyOfCard.getRank());
		assertEquals(originalCard.getSuite(), copyOfCard.getSuite());
		assertEquals(originalCard.getFacing(),copyOfCard.getFacing());
		assertEquals(originalCard.getColor(), copyOfCard.getColor());
		
	}
	
	

}
