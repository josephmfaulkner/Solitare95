package com.josephmfaulkner.solitare95.webapp.controller;

import com.josephmfaulkner.solitare95.core.gameboard.GameBoard;
import com.josephmfaulkner.solitare95.utility.MiscUtil;
import com.josephmfaulkner.solitare95.webapp.service.SolitareGameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
public class Solitare95Controller {

	@Autowired 
	SolitareGameService solitareGameService;

	@GetMapping("/")
	public String getGameBoard(Model model) {
		setViewModel(model);
		return "index";
	}

	@GetMapping("/drawcard/{randomnumber}")
	public String drawACard(Model model) {
		solitareGameService.drawCard();
		setViewModel(model);
		return "index";
	}

	private void setViewModel(Model model) {

		GameBoard gameBoard = solitareGameService.getGameBoard();
		model.addAttribute("gameBoard", gameBoard);
		model.addAttribute("uuid", MiscUtil.makeUUID());

	}
	



}