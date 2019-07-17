package solitare.card;

import solitare.card.Card.Facing;
import solitare.card.Card.Rank;
import solitare.card.Card.Suite;



public class CardSerializerImpl implements CardSerializer{

	public String serialize(Card card) {
		char rankCH  ;
		char suiteCH ;
		char faceCH  ;
		
		switch(card.getRank()) {
			case ACE: 
				rankCH = 'A';
				break; 
			case TWO: 
				rankCH = '2';
				break;
			case THREE: 
				rankCH = '3';
				break;
			case FOUR: 
				rankCH = '4';
				break;
			case FIVE: 
				rankCH = '5';
				break;
			case SIX: 
				rankCH = '6';
				break;
			case SEVEN: 
				rankCH = '7';
				break;
			case EIGHT: 
				rankCH = '8';
				break;
			case NINE: 
				rankCH = '9';
				break;
			case TEN: 
				rankCH = 'T';
				break;
			case JACK: 
				rankCH = 'J';
				break;
			case QUEEN: 
				rankCH = 'Q';
				break;
			case KING: 
				rankCH = 'K';
				break;
			default: 
				throw new RuntimeException("Invalid card (rank)"); 
		}
		
		switch(card.getSuite()) {
			case CLUBS:
				suiteCH = '♣';
				break;
			case DIAMONDS:
				suiteCH = '♦';
				break;
			case HEARTS:
				suiteCH = '♥';
				break;
			case SPADES:
				suiteCH = '♠';
				break;
			default: 
				throw new RuntimeException("Invalid card (suite)"); 
		}
		
		switch(card.getFacing()) {
			case UP: 
				faceCH = 'U';
				break;
			case DOWN: 
				faceCH = 'D';
				break;
			default: 
				throw new RuntimeException("Invalid card (facing)"); 
				
		}
		
		String serializedCard = String.format("%c%c%c", rankCH, suiteCH, faceCH);
		return serializedCard;
	}

	public Card deserialize(String serializedCard) throws RuntimeException{
		if (serializedCard.length() != 3) {
			throw new RuntimeException("String Format Not Valid (length)"); 
		}

		char rankCH  = serializedCard.charAt(0);
		char suiteCH = serializedCard.charAt(1);
		char faceCH  = serializedCard.charAt(2);
		
		Rank   cardRank   = null;
		Suite  cardSuite  = null; 
		Facing cardFacing = null; 
		
		
		switch(rankCH) {
			case 'A': 
				cardRank = Rank.ACE; 
				break; 
			case '2': 
				cardRank = Rank.TWO; 
				break; 
			case '3': 
				cardRank = Rank.THREE; 
				break; 
			case '4': 
				cardRank = Rank.FOUR; 
				break; 
			case '5': 
				cardRank = Rank.FIVE; 
				break; 
			case '6': 
				cardRank = Rank.SIX; 
				break; 
			case '7': 
				cardRank = Rank.SEVEN; 
				break; 
			case '8': 
				cardRank = Rank.EIGHT; 
				break; 
			case '9': 
				cardRank = Rank.NINE; 
				break; 
			case 'T': 
				cardRank = Rank.TEN; 
				break; 
			case 'J': 
				cardRank = Rank.JACK; 
				break; 
			case 'Q': 
				cardRank = Rank.QUEEN; 
				break; 
			case 'K': 
				cardRank = Rank.KING; 
				break; 
			default: 
				throw new RuntimeException("String Format Not Valid (rank)");
		}
		
		
		
		switch(suiteCH) {
			case '♣':
				cardSuite = Suite.CLUBS; 
				break; 
			case '♦':
				cardSuite = Suite.DIAMONDS; 
				break; 
			case '♥':
				cardSuite = Suite.HEARTS; 
				break; 
			case '♠':
				cardSuite = Suite.SPADES; 
				break; 
			default: 
				throw new RuntimeException("String Format Not Valid (suite)");
		}
		
		switch(faceCH) {
			case 'U':
				cardFacing = Facing.UP; 
				break; 
			case 'D':
				cardFacing = Facing.DOWN; 
				break; 
			default: 
				throw new RuntimeException("String Format Not Valid (facing)");
				
		}
		
		
		Card newCard = new Card(cardRank, cardSuite, cardFacing);

		return newCard;
	}

}
