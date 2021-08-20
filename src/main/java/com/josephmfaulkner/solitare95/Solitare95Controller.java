package com.josephmfaulkner.solitare95;

import javax.servlet.http.HttpSession;

import com.josephmfaulkner.solitare95.gameboard.GameBoard;
import com.josephmfaulkner.solitare95.gameboard.GameBoardFactory;
import com.josephmfaulkner.solitare95.utility.GameBoardPrinter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Solitare95Controller {

	@GetMapping("/")
	public String index(HttpSession httpSession) {

		GameBoard gameBoard = GameBoardFactory.newGame();

		String gameBoardData = GameBoardPrinter.printBoard(gameBoard);

		httpSession.setAttribute("board", gameBoardData);

		return "index";
		
	}

}