package com.xworkz.game.service;

import com.xworkz.game.dto.GameDTO;

public class GameServiceImpl implements GameService {

	@Override
	public String validateAndSave(GameDTO dto) {
		System.out.println("invoked validate and save method:"+dto);
		boolean nameValid = false;
		boolean versionValid = false;
		boolean developedByValid = false;
		boolean maxPlayers = false;
		boolean memoryRequired = false;
		if (dto != null) {
			System.out.println("dto is not null,will start validating");
			String name = dto.getName();
			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 10) {
				System.out.println("name is valid");
				nameValid = true;
			} else {
				System.out.println("name is invalid");
				nameValid = false;
			}
			String version = dto.getVersion();
			if (version != null && version.length() > 2 && version.length() < 50) {
				System.out.println("version is valid");
				versionValid = true;

			} else {
				System.out.println("version is invalid");
				versionValid = false;
			}
			String developedBy = dto.getDevelopedBy();
			if (developedBy.length() > 3 && developedBy.length() <= 15) {
				System.out.println("developedBy is valid");
				developedByValid = true;
			} else {

				System.out.println("developedBy is invalid ");
				developedByValid = false;
			}
			int maximumPlyers = dto.getMaxPlayers();

			if (maximumPlyers >= 1 && maximumPlyers <= 15) {
				System.out.println("maximumPlyaers is valid");
				maxPlayers = true;
			} else {
				System.out.println("maximumPlyaers is invalid ");
				maxPlayers = false;
			}
			double memory = dto.getMemoryRequired();
			if (memory > 500 && memory <= 500000) {
				System.out.println("memory is valid");
				memoryRequired = true;
			} else {
				System.out.println("memory is invalid");
				memoryRequired = false;
			}

			if (nameValid && versionValid && developedByValid && maxPlayers && memoryRequired) {
				System.out.println("data is valid returning success");
				return "Success";
			}
			System.out.println("data is invalid returning failed");

			return "Failed";
		}
		System.out.println("dto is null can not pass to dto");
		return "Failed";
	}
}
