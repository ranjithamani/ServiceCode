package com.xworkz.game;

import com.xworkz.game.dto.GameDTO;
import com.xworkz.game.service.GameService;
import com.xworkz.game.service.GameServiceImpl;

public class GameTester {

	public static void main(String[] args) {
		GameDTO dto = new GameDTO("Ludo", "103", "EA sports", 4, 5000, false);

		GameService service = new GameServiceImpl();
		 String temp=service.validateAndSave(dto);
		 System.out.println(temp);
	}

}
