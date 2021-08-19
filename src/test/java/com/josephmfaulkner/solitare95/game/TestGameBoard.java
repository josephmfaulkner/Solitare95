package com.josephmfaulkner.solitare95.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.josephmfaulkner.solitare95.solitare.cardstack.CardDeck;
import com.josephmfaulkner.solitare95.solitare.cardstack.CardDeckFactory;
import com.josephmfaulkner.solitare95.solitare.cardstack.CardStack;
import com.josephmfaulkner.solitare95.gameboard.GameBoard;

class TestGameBoard {

	CardDeck gameDeck;
	
	CardStack foundation1;
	CardStack foundation2;
	CardStack foundation3;
	CardStack foundation4;
	
	CardStack tableau1;
	CardStack tableau2;
	CardStack tableau3;
	CardStack tableau4;
	CardStack tableau5;
	CardStack tableau6;
	CardStack tableau7;
	
	GameBoard gameBoard;
	
	@BeforeEach
	void setup() {
		gameDeck = CardDeckFactory.makeNewDeck();
		
		foundation1 = new CardStack();
		foundation2 = new CardStack();
		foundation3 = new CardStack();
		foundation4 = new CardStack();
		
		tableau1 = new CardStack();
		tableau2 = new CardStack();
		tableau3 = new CardStack();
		tableau4 = new CardStack();
		tableau5 = new CardStack();
		tableau6 = new CardStack();
		tableau7 = new CardStack();
				
		gameBoard = new GameBoard(
				gameDeck, 
				foundation1, 
				foundation2, 
				foundation3, 
				foundation4, 
				tableau1, 
				tableau2, 
				tableau3, 
				tableau4, 
				tableau5, 
				tableau6, 
				tableau7
				);
	}
	
	@Test
	void testNewGameBoard() {
		
		assertEquals(gameDeck,gameBoard.getDeck());
		
		assertEquals(foundation1,gameBoard.getFoundation(1));
		assertEquals(foundation2,gameBoard.getFoundation(2));
		assertEquals(foundation3,gameBoard.getFoundation(3));
		assertEquals(foundation4,gameBoard.getFoundation(4));
		
		assertEquals(tableau1,gameBoard.getTableau(1));
		assertEquals(tableau2,gameBoard.getTableau(2));
		assertEquals(tableau3,gameBoard.getTableau(3));
		assertEquals(tableau4,gameBoard.getTableau(4));
		assertEquals(tableau5,gameBoard.getTableau(5));
		assertEquals(tableau6,gameBoard.getTableau(6));
		assertEquals(tableau7,gameBoard.getTableau(7));
			
	}
	
	@Test
	public void invalidFoundation0() {
	    try {
	        gameBoard.getFoundation(0);
	        fail("Expected a runtime exception to be thrown");
	    } catch (Exception exception) {
	        assertEquals(exception.getMessage(), "Invalid Foundation: 0");
	    }
	}
	
	@Test
	public void invalidFoundation5() {
	    try {
	        gameBoard.getFoundation(5);
	        fail("Expected a runtime exception to be thrown");
	    } catch (Exception exception) {
	        assertEquals(exception.getMessage(), "Invalid Foundation: 5");
	    }
	}
	
	@Test
	public void invalidTableau0() {
	    try {
	        gameBoard.getTableau(0);
	        fail("Expected a runtime exception to be thrown");
	    } catch (Exception exception) {
	        assertEquals(exception.getMessage(), "Invalid Tableau: 0");
	    }
	}
	
	@Test
	public void invalidTableau8() {
	    try {
	        gameBoard.getTableau(8);
	        fail("Expected a runtime exception to be thrown");
	    } catch (Exception exception) {
	        assertEquals(exception.getMessage(), "Invalid Tableau: 8");
	    }
	}
	
}
