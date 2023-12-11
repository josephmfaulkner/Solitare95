package com.josephmfaulkner.solitare95.webapp.service;

import org.springframework.stereotype.Service;

import com.josephmfaulkner.solitare95.core.gameboard.GameBoard;
import com.josephmfaulkner.solitare95.core.gameboard.GameBoardFactory;

@Service
public class SolitareGameService {
    
    private GameBoard gameBoard;

    public SolitareGameService() {
        this.gameBoard = GameBoardFactory.newGame();
    }

    public GameBoard getGameBoard() {
        return this.gameBoard;
    }

    public GameBoard drawCard() {
        this.gameBoard.getDeck().drawCard();
        return this.gameBoard;
    }
}
