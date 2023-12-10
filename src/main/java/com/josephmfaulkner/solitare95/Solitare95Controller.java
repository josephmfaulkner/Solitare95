package com.josephmfaulkner.solitare95;

import javax.servlet.http.HttpSession;

import com.josephmfaulkner.solitare95.gameboard.GameBoard;
import com.josephmfaulkner.solitare95.gameboard.GameBoardFactory;
import com.josephmfaulkner.solitare95.utility.GameBoardPrinter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class Solitare95Controller {

	@GetMapping("/")
	public String index(Model model) {

		GameBoard gameBoard = GameBoardFactory.newGame();

		String gameBoardData = GameBoardPrinter.printBoard(gameBoard);

		model.addAttribute("gameBoard", gameBoard);
		model.addAttribute("gameBoardString", gameBoardData);

		return "index";
		
	}

}