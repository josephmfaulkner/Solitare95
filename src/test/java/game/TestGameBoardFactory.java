package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gameboard.GameBoard;
import gameboard.GameBoardFactory;
import util.SolitareUtil;

class TestGameBoardFactory {

	
	
	@Test
	void newGame() {
		GameBoard gameBoard = GameBoardFactory.newGame();
		
		SolitareUtil.printGameBoard(gameBoard);
		
		assertEquals(24,gameBoard.getDeck().getCards().size());
		
		assertEquals(0,gameBoard.getFoundation(1).getCards().size());
		assertEquals(0,gameBoard.getFoundation(2).getCards().size());
		assertEquals(0,gameBoard.getFoundation(3).getCards().size());
		assertEquals(0,gameBoard.getFoundation(4).getCards().size());
		
		assertEquals(1,gameBoard.getTableau(1).getCards().size());
		assertEquals(2,gameBoard.getTableau(2).getCards().size());
		assertEquals(3,gameBoard.getTableau(3).getCards().size());
		assertEquals(4,gameBoard.getTableau(4).getCards().size());
		assertEquals(5,gameBoard.getTableau(5).getCards().size());
		assertEquals(6,gameBoard.getTableau(6).getCards().size());
		assertEquals(7,gameBoard.getTableau(7).getCards().size());
			
	}

}
