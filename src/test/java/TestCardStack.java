import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import solitare.card.Card;
import solitare.card.Card.Facing;
import solitare.card.Card.Rank;
import solitare.card.Card.Suite;
import solitare.cardstack.CardStack;

class TestCardStack {

	@Test
	void testCardStackTransferAllEmpty() {
		CardStack cardStack1 = new CardStack(); 
		CardStack cardStack2 = new CardStack(); 
		
		cardStack1.transfer(cardStack1.getCards().size(), cardStack2);
		
		assertEquals(true, cardStack1.equals(cardStack2));
	}
	
	@Test
	void testCardStackTransferAllToEmpty() {
		CardStack cardStack1 = new CardStack(); 
		CardStack cardStack2 = new CardStack(); 
		
		cardStack1.getCards().add(new Card(Rank.ACE,     Suite.SPADES,   Facing.DOWN));
		cardStack1.getCards().add(new Card(Rank.QUEEN,   Suite.HEARTS,   Facing.UP));
		cardStack1.getCards().add(new Card(Rank.EIGHT,   Suite.SPADES,   Facing.DOWN));
		cardStack1.getCards().add(new Card(Rank.ACE,     Suite.DIAMONDS, Facing.DOWN));
		cardStack1.getCards().add(new Card(Rank.TWO,     Suite.CLUBS,    Facing.UP));
		
		cardStack1.transfer(cardStack1.getCards().size(), cardStack2);
		
		CardStack expectedCardStack1 = new CardStack();
		CardStack expectedCardStack2 = new CardStack();
		
		expectedCardStack2.getCards().add(new Card(Rank.ACE,     Suite.SPADES,   Facing.DOWN));
		expectedCardStack2.getCards().add(new Card(Rank.QUEEN,   Suite.HEARTS,   Facing.UP));
		expectedCardStack2.getCards().add(new Card(Rank.EIGHT,   Suite.SPADES,   Facing.DOWN));
		expectedCardStack2.getCards().add(new Card(Rank.ACE,     Suite.DIAMONDS, Facing.DOWN));
		expectedCardStack2.getCards().add(new Card(Rank.TWO,     Suite.CLUBS,    Facing.UP));
		
		
		assertEquals(true, cardStack1.equals(expectedCardStack1));
		assertEquals(true, cardStack2.equals(expectedCardStack2));
	}
	
	@Test
	void testCardStackTransferNoneToEmpty() {
		CardStack cardStack1 = new CardStack(); 
		CardStack cardStack2 = new CardStack(); 
		
		cardStack1.getCards().add(new Card(Rank.ACE,     Suite.SPADES,   Facing.DOWN));
		cardStack1.getCards().add(new Card(Rank.QUEEN,   Suite.HEARTS,   Facing.UP));
		cardStack1.getCards().add(new Card(Rank.EIGHT,   Suite.SPADES,   Facing.DOWN));
		cardStack1.getCards().add(new Card(Rank.ACE,     Suite.DIAMONDS, Facing.DOWN));
		cardStack1.getCards().add(new Card(Rank.TWO,     Suite.CLUBS,    Facing.UP));
		
		cardStack1.transfer(0, cardStack2);
		
		CardStack expectedCardStack1 = new CardStack();
		CardStack expectedCardStack2 = new CardStack();
		
		expectedCardStack1.getCards().add(new Card(Rank.ACE,     Suite.SPADES,   Facing.DOWN));
		expectedCardStack1.getCards().add(new Card(Rank.QUEEN,   Suite.HEARTS,   Facing.UP));
		expectedCardStack1.getCards().add(new Card(Rank.EIGHT,   Suite.SPADES,   Facing.DOWN));
		expectedCardStack1.getCards().add(new Card(Rank.ACE,     Suite.DIAMONDS, Facing.DOWN));
		expectedCardStack1.getCards().add(new Card(Rank.TWO,     Suite.CLUBS,    Facing.UP));
		
		
		assertEquals(true, cardStack1.equals(expectedCardStack1));
		assertEquals(true, cardStack2.equals(expectedCardStack2));
	}
	
	@Test
	void testCardStackTransferOne() {
		CardStack cardStack1 = new CardStack(); 
		cardStack1.getCards().add(new Card(Rank.ACE,     Suite.SPADES,   Facing.DOWN));
		cardStack1.getCards().add(new Card(Rank.QUEEN,   Suite.HEARTS,   Facing.UP));
		cardStack1.getCards().add(new Card(Rank.EIGHT,   Suite.SPADES,   Facing.DOWN));
		cardStack1.getCards().add(new Card(Rank.ACE,     Suite.DIAMONDS, Facing.DOWN));
		cardStack1.getCards().add(new Card(Rank.TWO,     Suite.CLUBS,    Facing.UP));
		
		CardStack cardStack2 = new CardStack(); 	
		cardStack2.getCards().add(new Card(Rank.THREE,   Suite.SPADES,   Facing.DOWN));
		cardStack2.getCards().add(new Card(Rank.JACK,    Suite.DIAMONDS, Facing.UP));
		cardStack2.getCards().add(new Card(Rank.ACE,     Suite.HEARTS,   Facing.UP));
		cardStack2.getCards().add(new Card(Rank.TEN,     Suite.CLUBS,    Facing.UP));
		cardStack2.getCards().add(new Card(Rank.NINE,    Suite.CLUBS,    Facing.DOWN));
		
		cardStack1.transfer(1, cardStack2);
		
		CardStack expectedCardStack1 = new CardStack();
		expectedCardStack1.getCards().add(new Card(Rank.QUEEN,   Suite.HEARTS,   Facing.UP));
		expectedCardStack1.getCards().add(new Card(Rank.EIGHT,   Suite.SPADES,   Facing.DOWN));
		expectedCardStack1.getCards().add(new Card(Rank.ACE,     Suite.DIAMONDS, Facing.DOWN));
		expectedCardStack1.getCards().add(new Card(Rank.TWO,     Suite.CLUBS,    Facing.UP));
		
		CardStack expectedCardStack2 = new CardStack();
		expectedCardStack2.getCards().add(new Card(Rank.ACE,     Suite.SPADES,   Facing.DOWN));
		expectedCardStack2.getCards().add(new Card(Rank.THREE,   Suite.SPADES,   Facing.DOWN));
		expectedCardStack2.getCards().add(new Card(Rank.JACK,    Suite.DIAMONDS, Facing.UP));
		expectedCardStack2.getCards().add(new Card(Rank.ACE,     Suite.HEARTS,   Facing.UP));
		expectedCardStack2.getCards().add(new Card(Rank.TEN,     Suite.CLUBS,    Facing.UP));
		expectedCardStack2.getCards().add(new Card(Rank.NINE,    Suite.CLUBS,    Facing.DOWN));
		
		assertEquals(true, cardStack1.equals(expectedCardStack1));
		assertEquals(true, cardStack2.equals(expectedCardStack2));
	}
	
	@Test
	void testCardStackTransferFour() {
		CardStack cardStack1 = new CardStack(); 
		cardStack1.getCards().add(new Card(Rank.ACE,     Suite.SPADES,   Facing.DOWN));
		cardStack1.getCards().add(new Card(Rank.QUEEN,   Suite.HEARTS,   Facing.UP));
		cardStack1.getCards().add(new Card(Rank.EIGHT,   Suite.SPADES,   Facing.DOWN));
		cardStack1.getCards().add(new Card(Rank.ACE,     Suite.DIAMONDS, Facing.DOWN));
		cardStack1.getCards().add(new Card(Rank.TWO,     Suite.CLUBS,    Facing.UP));
		
		CardStack cardStack2 = new CardStack(); 	
		cardStack2.getCards().add(new Card(Rank.THREE,   Suite.SPADES,   Facing.DOWN));
		cardStack2.getCards().add(new Card(Rank.JACK,    Suite.DIAMONDS, Facing.UP));
		cardStack2.getCards().add(new Card(Rank.ACE,     Suite.HEARTS,   Facing.UP));
		cardStack2.getCards().add(new Card(Rank.TEN,     Suite.CLUBS,    Facing.UP));
		cardStack2.getCards().add(new Card(Rank.NINE,    Suite.CLUBS,    Facing.DOWN));
		
		cardStack1.transfer(4, cardStack2);
		
		CardStack expectedCardStack1 = new CardStack();
		expectedCardStack1.getCards().add(new Card(Rank.TWO,     Suite.CLUBS,    Facing.UP));
		
		CardStack expectedCardStack2 = new CardStack();
		expectedCardStack2.getCards().add(new Card(Rank.ACE,     Suite.SPADES,   Facing.DOWN));
		expectedCardStack2.getCards().add(new Card(Rank.QUEEN,   Suite.HEARTS,   Facing.UP));
		expectedCardStack2.getCards().add(new Card(Rank.EIGHT,   Suite.SPADES,   Facing.DOWN));
		expectedCardStack2.getCards().add(new Card(Rank.ACE,     Suite.DIAMONDS, Facing.DOWN));
		expectedCardStack2.getCards().add(new Card(Rank.THREE,   Suite.SPADES,   Facing.DOWN));
		expectedCardStack2.getCards().add(new Card(Rank.JACK,    Suite.DIAMONDS, Facing.UP));
		expectedCardStack2.getCards().add(new Card(Rank.ACE,     Suite.HEARTS,   Facing.UP));
		expectedCardStack2.getCards().add(new Card(Rank.TEN,     Suite.CLUBS,    Facing.UP));
		expectedCardStack2.getCards().add(new Card(Rank.NINE,    Suite.CLUBS,    Facing.DOWN));
		
		assertEquals(true, cardStack1.equals(expectedCardStack1));
		assertEquals(true, cardStack2.equals(expectedCardStack2));
	}
	
	@Test
	void testCardStackTransferAll() {
		CardStack cardStack1 = new CardStack(); 
		cardStack1.getCards().add(new Card(Rank.ACE,     Suite.SPADES,   Facing.DOWN));
		cardStack1.getCards().add(new Card(Rank.QUEEN,   Suite.HEARTS,   Facing.UP));
		cardStack1.getCards().add(new Card(Rank.EIGHT,   Suite.SPADES,   Facing.DOWN));
		cardStack1.getCards().add(new Card(Rank.ACE,     Suite.DIAMONDS, Facing.DOWN));
		cardStack1.getCards().add(new Card(Rank.TWO,     Suite.CLUBS,    Facing.UP));
		
		CardStack cardStack2 = new CardStack(); 	
		cardStack2.getCards().add(new Card(Rank.THREE,   Suite.SPADES,   Facing.DOWN));
		cardStack2.getCards().add(new Card(Rank.JACK,    Suite.DIAMONDS, Facing.UP));
		cardStack2.getCards().add(new Card(Rank.ACE,     Suite.HEARTS,   Facing.UP));
		cardStack2.getCards().add(new Card(Rank.TEN,     Suite.CLUBS,    Facing.UP));
		cardStack2.getCards().add(new Card(Rank.NINE,    Suite.CLUBS,    Facing.DOWN));
		
		cardStack1.transfer(cardStack1.getCards().size(), cardStack2);
		
		CardStack expectedCardStack1 = new CardStack();;
		
		CardStack expectedCardStack2 = new CardStack();
		expectedCardStack2.getCards().add(new Card(Rank.ACE,     Suite.SPADES,   Facing.DOWN));
		expectedCardStack2.getCards().add(new Card(Rank.QUEEN,   Suite.HEARTS,   Facing.UP));
		expectedCardStack2.getCards().add(new Card(Rank.EIGHT,   Suite.SPADES,   Facing.DOWN));
		expectedCardStack2.getCards().add(new Card(Rank.ACE,     Suite.DIAMONDS, Facing.DOWN));
		expectedCardStack2.getCards().add(new Card(Rank.TWO,     Suite.CLUBS,    Facing.UP));
		expectedCardStack2.getCards().add(new Card(Rank.THREE,   Suite.SPADES,   Facing.DOWN));
		expectedCardStack2.getCards().add(new Card(Rank.JACK,    Suite.DIAMONDS, Facing.UP));
		expectedCardStack2.getCards().add(new Card(Rank.ACE,     Suite.HEARTS,   Facing.UP));
		expectedCardStack2.getCards().add(new Card(Rank.TEN,     Suite.CLUBS,    Facing.UP));
		expectedCardStack2.getCards().add(new Card(Rank.NINE,    Suite.CLUBS,    Facing.DOWN));

		
		assertEquals(true, cardStack1.equals(expectedCardStack1));
		assertEquals(true, cardStack2.equals(expectedCardStack2));
	}

}
