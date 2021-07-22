package com.xworkz.transformer.service;

import com.xworkz.transformer.dto.TransformerDTO;
import com.xworkz.transformer.dto.constants.CharacterType;

public class TransformerServiceImpl implements TransformerService {

	@Override
	public String validateAndSave(TransformerDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("invoked validate and save method:"+dto);
		boolean nameValid = false;
		boolean placeValid = false;
		boolean angryValid = false;
		boolean happyValid= false;
		boolean sadValid= false;
		boolean likeToDoValid= false;

		if (dto != null) {
			System.out.println("dto is not null,will start validating");
			String name = dto.getName();
			if (name != null && !name.isEmpty() && name.length() >= 5 && name.length() <= 50) {
				System.out.println("name is valid");
				nameValid = true;
			} else {
				System.out.println("name is invalid");
				nameValid = false;
			}
			String place = dto.getPlace();
			if (place != null && place.length() > 4 && place.length() <=20) {
				System.out.println("place is valid");
				placeValid = true;

			} else {
				System.out.println("place is invalid");
				placeValid = false;
			}
			String sad = dto.getSad();
			if (sad.length()> 4 && sad.length()<=12) {
				System.out.println("sad is valid");
				sadValid = true;
			} else {

				System.out.println("sad is invalid ");
				sadValid = false;
			}
			String happy = dto.getHappy();

			if (happy.length() >= 4 && happy.length() <= 12) {
				System.out.println("happy is valid");
				happyValid = true;
			} else {
				System.out.println("happy is invalid ");
				happyValid = false;
			}
			String like = dto.getLikeToDo();
			if (like.length() >4&& like.length() <=12) {
				System.out.println("like is valid");
				likeToDoValid = true;
			} else {
				System.out.println("like is invalid");
				likeToDoValid = false;
			}
			String angry = dto.getLikeToDo();
			if (angry.length() >4 && angry.length() <=12) {
				System.out.println("angry is valid");
				angryValid = true;
			} else {
				System.out.println("angry is invalid");
				angryValid = false;
			}

			if (nameValid && placeValid && sadValid && happyValid && angryValid && likeToDoValid) {
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
