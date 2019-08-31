package gameboard;

import solitare.cardstack.CardDeck;
import solitare.cardstack.CardDeckFactory;
import solitare.cardstack.CardStack;

public class GameBoardFactory {
	public static GameBoard makeGameBoard(CardDeck deck) {	
		if(deck == null) {
			throw new RuntimeException("CardDeck cannot be null");
		}
		
		return new GameBoard(
				deck,
				new CardStack(),
				new CardStack(),
				new CardStack(),
				new CardStack(),
				new CardStack(),
				new CardStack(),
				new CardStack(),
				new CardStack(),
				new CardStack(),
				new CardStack(),
				new CardStack()
			);
	}
	
	public static void dealGame(GameBoard gameBoard) {
		int deckSize = gameBoard.getDeck().getCards().size();
		if(deckSize < 28) {
			throw new RuntimeException("Not enough cards to deal: " + deckSize + ", needs: 28");
		}
		
		gameBoard.getDeck().transfer(1, gameBoard.getTableau(1));
		gameBoard.getTableau(1).getCards().getFirst().flip();
		
		gameBoard.getDeck().transfer(2, gameBoard.getTableau(2));
		gameBoard.getTableau(2).getCards().getFirst().flip();
		
		gameBoard.getDeck().transfer(3, gameBoard.getTableau(3));
		gameBoard.getTableau(3).getCards().getFirst().flip();
		
		gameBoard.getDeck().transfer(4, gameBoard.getTableau(4));
		gameBoard.getTableau(4).getCards().getFirst().flip();
		
		gameBoard.getDeck().transfer(5, gameBoard.getTableau(5));
		gameBoard.getTableau(5).getCards().getFirst().flip();
		
		gameBoard.getDeck().transfer(6, gameBoard.getTableau(6));
		gameBoard.getTableau(6).getCards().getFirst().flip();
		
		gameBoard.getDeck().transfer(7, gameBoard.getTableau(7));
		gameBoard.getTableau(7).getCards().getFirst().flip();
	}
	
	
	public static GameBoard newGame() {
		CardDeck gameDeck = CardDeckFactory.makeNewDeck();
		gameDeck.shuffle();
		
		GameBoard gameBoard = makeGameBoard(gameDeck);
		dealGame(gameBoard);
		
		return gameBoard; 
	}
}
