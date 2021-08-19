package com.josephmfaulkner.solitare95.solitare.cardstack;

import com.josephmfaulkner.solitare95.solitare.card.Card;

public class CardDeckFactory {
	public static CardDeck makeNewDeck() {
		
		CardDeck deck = new CardDeck(); 
		
		// ACES
		Card newCardAceOfSpades     = new Card(Card.Rank.ACE,   Card.Suite.SPADES,   Card.Facing.DOWN);
		Card newCardAceOfClubs      = new Card(Card.Rank.ACE,   Card.Suite.CLUBS ,   Card.Facing.DOWN);
		Card newCardAceOfDiamonds   = new Card(Card.Rank.ACE,   Card.Suite.DIAMONDS, Card.Facing.DOWN);
		Card newCardAceOfHearts     = new Card(Card.Rank.ACE,   Card.Suite.HEARTS,   Card.Facing.DOWN);
		
		deck.addCard(newCardAceOfSpades);
		deck.addCard(newCardAceOfClubs);
		deck.addCard(newCardAceOfDiamonds);
		deck.addCard(newCardAceOfHearts);
		
		// TWOS 
		Card newCardTwoOfSpades     = new Card(Card.Rank.TWO,   Card.Suite.SPADES,   Card.Facing.DOWN);
		Card newCardTwoOfClubs      = new Card(Card.Rank.TWO,   Card.Suite.CLUBS ,   Card.Facing.DOWN);
		Card newCardTwoOfDiamonds   = new Card(Card.Rank.TWO,   Card.Suite.DIAMONDS, Card.Facing.DOWN);
		Card newCardTwoOfHearts     = new Card(Card.Rank.TWO,   Card.Suite.HEARTS,   Card.Facing.DOWN);
		
		deck.addCard(newCardTwoOfSpades);
		deck.addCard(newCardTwoOfClubs);
		deck.addCard(newCardTwoOfDiamonds);
		deck.addCard(newCardTwoOfHearts);
		
		// THREES
		Card newCardThreeOfSpades   = new Card(Card.Rank.THREE, Card.Suite.SPADES,   Card.Facing.DOWN);
		Card newCardThreeOfClubs    = new Card(Card.Rank.THREE, Card.Suite.CLUBS ,   Card.Facing.DOWN);
		Card newCardThreeOfDiamonds = new Card(Card.Rank.THREE, Card.Suite.DIAMONDS, Card.Facing.DOWN);
		Card newCardThreeOfHearts   = new Card(Card.Rank.THREE, Card.Suite.HEARTS,   Card.Facing.DOWN);
		
		deck.addCard(newCardThreeOfSpades);
		deck.addCard(newCardThreeOfClubs);
		deck.addCard(newCardThreeOfDiamonds);
		deck.addCard(newCardThreeOfHearts);
		
		// FOURS
		Card newCardFourOfSpades    = new Card(Card.Rank.FOUR,  Card.Suite.SPADES,   Card.Facing.DOWN);
		Card newCardFourOfClubs     = new Card(Card.Rank.FOUR,  Card.Suite.CLUBS ,   Card.Facing.DOWN);
		Card newCardFourOfDiamonds  = new Card(Card.Rank.FOUR,  Card.Suite.DIAMONDS, Card.Facing.DOWN);
		Card newCardFourOfHearts    = new Card(Card.Rank.FOUR,  Card.Suite.HEARTS,   Card.Facing.DOWN);
		
		deck.addCard(newCardFourOfSpades);
		deck.addCard(newCardFourOfClubs);
		deck.addCard(newCardFourOfDiamonds);
		deck.addCard(newCardFourOfHearts);
		
		// FIVES
		Card newCardFiveOfSpades    = new Card(Card.Rank.FIVE,  Card.Suite.SPADES,   Card.Facing.DOWN);
		Card newCardFiveOfClubs     = new Card(Card.Rank.FIVE,  Card.Suite.CLUBS ,   Card.Facing.DOWN);
		Card newCardFiveOfDiamonds  = new Card(Card.Rank.FIVE,  Card.Suite.DIAMONDS, Card.Facing.DOWN);
		Card newCardFiveOfHearts    = new Card(Card.Rank.FIVE,  Card.Suite.HEARTS,   Card.Facing.DOWN);
	
		deck.addCard(newCardFiveOfSpades);
		deck.addCard(newCardFiveOfClubs);
		deck.addCard(newCardFiveOfDiamonds);
		deck.addCard(newCardFiveOfHearts);
		
		// SIXES
		Card newCardSixOfSpades     = new Card(Card.Rank.SIX,   Card.Suite.SPADES,   Card.Facing.DOWN);
		Card newCardSixOfClubs      = new Card(Card.Rank.SIX,   Card.Suite.CLUBS ,   Card.Facing.DOWN);
		Card newCardSixOfDiamonds   = new Card(Card.Rank.SIX,   Card.Suite.DIAMONDS, Card.Facing.DOWN);
		Card newCardSixOfHearts     = new Card(Card.Rank.SIX,   Card.Suite.HEARTS,   Card.Facing.DOWN);
	
		deck.addCard(newCardSixOfSpades);
		deck.addCard(newCardSixOfClubs);
		deck.addCard(newCardSixOfDiamonds);
		deck.addCard(newCardSixOfHearts);
		
		// SEVEN
		Card newCardSevenOfSpades   = new Card(Card.Rank.SEVEN, Card.Suite.SPADES,   Card.Facing.DOWN);
		Card newCardSevenOfClubs    = new Card(Card.Rank.SEVEN, Card.Suite.CLUBS ,   Card.Facing.DOWN);
		Card newCardSevenOfDiamonds = new Card(Card.Rank.SEVEN, Card.Suite.DIAMONDS, Card.Facing.DOWN);
		Card newCardSevenOfHearts   = new Card(Card.Rank.SEVEN, Card.Suite.HEARTS,   Card.Facing.DOWN);
		
		deck.addCard(newCardSevenOfSpades);
		deck.addCard(newCardSevenOfClubs);
		deck.addCard(newCardSevenOfDiamonds);
		deck.addCard(newCardSevenOfHearts);
		
		// EIGHT
		Card newCardEightOfSpades   = new Card(Card.Rank.EIGHT, Card.Suite.SPADES,   Card.Facing.DOWN);
		Card newCardEightOfClubs    = new Card(Card.Rank.EIGHT, Card.Suite.CLUBS ,   Card.Facing.DOWN);
		Card newCardEightOfDiamonds = new Card(Card.Rank.EIGHT, Card.Suite.DIAMONDS, Card.Facing.DOWN);
		Card newCardEightOfHearts   = new Card(Card.Rank.EIGHT, Card.Suite.HEARTS,   Card.Facing.DOWN);
		
		deck.addCard(newCardEightOfSpades);
		deck.addCard(newCardEightOfClubs);
		deck.addCard(newCardEightOfDiamonds);
		deck.addCard(newCardEightOfHearts);
		
		// NINE
		Card newCardNineOfSpades    = new Card(Card.Rank.NINE,  Card.Suite.SPADES,   Card.Facing.DOWN);
		Card newCardNineOfClubs     = new Card(Card.Rank.NINE,  Card.Suite.CLUBS ,   Card.Facing.DOWN);
		Card newCardNoneOfDiamonds  = new Card(Card.Rank.NINE,  Card.Suite.DIAMONDS, Card.Facing.DOWN);
		Card newCardNineOfHearts    = new Card(Card.Rank.NINE,  Card.Suite.HEARTS,   Card.Facing.DOWN);
		
		deck.addCard(newCardNineOfSpades);
		deck.addCard(newCardNineOfClubs);
		deck.addCard(newCardNoneOfDiamonds);
		deck.addCard(newCardNineOfHearts);
		
		// TENS
		Card newCardTenOfSpades     = new Card(Card.Rank.TEN,   Card.Suite.SPADES,   Card.Facing.DOWN);
		Card newCardTenOfClubs      = new Card(Card.Rank.TEN,   Card.Suite.CLUBS ,   Card.Facing.DOWN);
		Card newCardTenOfDiamonds   = new Card(Card.Rank.TEN,   Card.Suite.DIAMONDS, Card.Facing.DOWN);
		Card newCardTenOfHearts     = new Card(Card.Rank.TEN,   Card.Suite.HEARTS,   Card.Facing.DOWN);
		
		deck.addCard(newCardTenOfSpades);
		deck.addCard(newCardTenOfClubs);
		deck.addCard(newCardTenOfDiamonds);
		deck.addCard(newCardTenOfHearts );
		
		// JACK
		Card newCardJackOfSpades    = new Card(Card.Rank.JACK,  Card.Suite.SPADES,   Card.Facing.DOWN);
		Card newCardJackOfClubs     = new Card(Card.Rank.JACK,  Card.Suite.CLUBS ,   Card.Facing.DOWN);
		Card newCardJackOfDiamonds  = new Card(Card.Rank.JACK,  Card.Suite.DIAMONDS, Card.Facing.DOWN);
		Card newCardJackOfHearts    = new Card(Card.Rank.JACK,  Card.Suite.HEARTS,   Card.Facing.DOWN);
		
		deck.addCard(newCardJackOfSpades);
		deck.addCard(newCardJackOfClubs);
		deck.addCard(newCardJackOfDiamonds);
		deck.addCard(newCardJackOfHearts);
		
		// QUEENS
		Card newCardQueenOfSpades   = new Card(Card.Rank.QUEEN, Card.Suite.SPADES,   Card.Facing.DOWN);
		Card newCardQueenOfClubs    = new Card(Card.Rank.QUEEN, Card.Suite.CLUBS ,   Card.Facing.DOWN);
		Card newCardQueenOfDiamonds = new Card(Card.Rank.QUEEN, Card.Suite.DIAMONDS, Card.Facing.DOWN);
		Card newCardQueenOfHearts   = new Card(Card.Rank.QUEEN, Card.Suite.HEARTS,   Card.Facing.DOWN);
		
		deck.addCard(newCardQueenOfSpades);
		deck.addCard(newCardQueenOfClubs);
		deck.addCard(newCardQueenOfDiamonds);
		deck.addCard(newCardQueenOfHearts);
		
		// KINGS
		Card newCardKingOfSpades    = new Card(Card.Rank.KING,  Card.Suite.SPADES,   Card.Facing.DOWN);
		Card newCardKingOfClubs     = new Card(Card.Rank.KING,  Card.Suite.CLUBS ,   Card.Facing.DOWN);
		Card newCardKingOfDiamonds  = new Card(Card.Rank.KING,  Card.Suite.DIAMONDS, Card.Facing.DOWN);
		Card newCardKingOfHearts    = new Card(Card.Rank.KING,  Card.Suite.HEARTS,   Card.Facing.DOWN);
		
		deck.addCard(newCardKingOfSpades);
		deck.addCard(newCardKingOfClubs);
		deck.addCard(newCardKingOfDiamonds);
		deck.addCard(newCardKingOfHearts);
				
		return deck; 
	}
}
