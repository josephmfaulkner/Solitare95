import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import solitare.card.Card;
import solitare.card.Card.Color;
import solitare.card.Card.Facing;
import solitare.card.Card.Rank;
import solitare.card.Card.Suite;

class TestCard {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void createACECard() {
		Card card = new Card(Rank.ACE, Suite.SPADES, Facing.DOWN); 
		assertEquals(card.getRank()  ,  Rank.ACE);
		assertEquals(card.getSuite() ,  Suite.SPADES);
		assertEquals(card.getFacing(),  Facing.DOWN);
		assertEquals(card.getColor() ,  Color.BLACK);
	}
	
	@Test
	void flipCard() {
		Card card = new Card(Rank.ACE, Suite.SPADES, Facing.DOWN); 
		card.flip(); 
		assertEquals(card.getFacing(),  Facing.UP);
		card.flip(); 
		assertEquals(card.getFacing(),  Facing.DOWN);		
	}
	
	@Test
	void compareColor() {
		Card cardBLACK1 = new Card(Rank.ACE, Suite.SPADES,   Facing.DOWN);
		Card cardBLACK2 = new Card(Rank.ACE, Suite.CLUBS,    Facing.DOWN);
		Card cardRED1   = new Card(Rank.ACE, Suite.DIAMONDS, Facing.DOWN);
		Card cardRED2   = new Card(Rank.ACE, Suite.HEARTS,   Facing.DOWN);
		
		assertEquals(cardBLACK1.sameColor(cardBLACK2), true);
		assertEquals(cardRED1.sameColor(cardRED2),     true);
		assertEquals(cardBLACK1.sameColor(cardRED1),   false);
		assertEquals(cardBLACK2.sameColor(cardRED2),   false);
				
	}
	
	@Test
	void compareRank1() {
		Card ace  = new Card(Rank.ACE,  Suite.SPADES,   Facing.DOWN);
		Card king = new Card(Rank.KING, Suite.SPADES,   Facing.DOWN);
		assertEquals(-12, ace.compareRank(king));
	}
	
	@Test
	void compareRank2() {
		Card ten  = new Card(Rank.TEN,  Suite.SPADES,   Facing.DOWN);
		Card nine = new Card(Rank.NINE, Suite.SPADES,   Facing.DOWN);
		assertEquals(1, ten.compareRank(nine));
	}
	
	
	
	

}
