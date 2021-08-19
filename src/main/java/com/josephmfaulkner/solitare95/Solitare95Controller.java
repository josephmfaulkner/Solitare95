package com.josephmfaulkner.solitare95;

import com.josephmfaulkner.solitare95.gameboard.GameBoard;
import com.josephmfaulkner.solitare95.gameboard.GameBoardFactory;
import com.josephmfaulkner.solitare95.utility.GameBoardPrinter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Solitare95Controller {

	@GetMapping("/")
	public String index() {

		GameBoard gameBoard = GameBoardFactory.newGame();

		return GameBoardPrinter.printBoard(gameBoard);
	}

}