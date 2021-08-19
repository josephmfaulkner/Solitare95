package com.josephmfaulkner.solitare95.gameboard;

import com.josephmfaulkner.solitare95.solitare.cardstack.CardDeck;
import com.josephmfaulkner.solitare95.solitare.cardstack.CardStack;

public class GameBoard {
	private CardDeck deck; 
	
	private CardStack foundation[];
	private CardStack tableau[];

	public GameBoard(
		CardDeck deck,
		CardStack foundation1,
		CardStack foundation2,
		CardStack foundation3,
		CardStack foundation4,
		CardStack tableau1,
		CardStack tableau2,
		CardStack tableau3,
		CardStack tableau4,
		CardStack tableau5,
		CardStack tableau6,
		CardStack tableau7
	) {
		
		boolean nullToConstructor = (deck == null);
		nullToConstructor = (deck == null)        || nullToConstructor; 
		nullToConstructor = (foundation1 == null) || nullToConstructor; 
		nullToConstructor = (foundation2 == null) || nullToConstructor; 
		nullToConstructor = (foundation3 == null) || nullToConstructor; 
		nullToConstructor = (foundation4 == null) || nullToConstructor; 
		nullToConstructor = (tableau1 == null)    || nullToConstructor; 
		nullToConstructor = (tableau2 == null)    || nullToConstructor; 
		nullToConstructor = (tableau3 == null)    || nullToConstructor; 
		nullToConstructor = (tableau4 == null)    || nullToConstructor; 
		nullToConstructor = (tableau5 == null)    || nullToConstructor; 
		nullToConstructor = (tableau6 == null)    || nullToConstructor; 
		nullToConstructor = (tableau7 == null)    || nullToConstructor; 
		
		if(nullToConstructor) {
			throw new RuntimeException("null cannot be passed to constructor");
		}

		
		this.foundation = new CardStack[4];
		this.tableau    = new CardStack[7];
		
		this.deck = deck; 
		
		this.foundation[0] = foundation1;
		this.foundation[1] = foundation2;
		this.foundation[2] = foundation3;
		this.foundation[3] = foundation4;
		
		this.tableau[0] = tableau1;
		this.tableau[1] = tableau2;
		this.tableau[2] = tableau3;
		this.tableau[3] = tableau4;
		this.tableau[4] = tableau5;
		this.tableau[5] = tableau6;
		this.tableau[6] = tableau7;
	}
	
	public CardDeck getDeck(){
		return this.deck; 
	}
	
	public CardStack getFoundation(int foundationNum) {		
		if(foundationNum < 1 || foundationNum > this.foundation.length)
		{
			throw new RuntimeException("Invalid Foundation: " + foundationNum);
		}
		return this.foundation[foundationNum -1];
	}
	
	public CardStack getTableau(int tableauNum) {
		if(tableauNum < 1 || tableauNum > this.tableau.length)
		{
			throw new RuntimeException("Invalid Tableau: " + tableauNum);
		}
		return this.tableau[tableauNum -1];
	}
	
	
	
	
	
	
}
