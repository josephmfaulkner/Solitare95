package com.josephmfaulkner.solitare95.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.josephmfaulkner.solitare95.core.gameboard.GameBoard;
import com.josephmfaulkner.solitare95.core.gameboard.GameBoardFactory;

class TestGameBoardFactory {
	
	@Test
	void newGame() {

		GameBoard gameBoard = GameBoardFactory.newGame();
		
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
