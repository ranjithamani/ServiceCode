package com.xworkz.transformer;

import com.xworkz.transformer.dto.TransformerDTO;
import com.xworkz.transformer.dto.constants.CharacterType;
import com.xworkz.transformer.service.TransformerService;
import com.xworkz.transformer.service.TransformerServiceImpl;

public class TransformerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransformerDTO dto=new TransformerDTO("Ranjitha","Bangalore",CharacterType.SILENT,"someone wakes me up","when my father happy","when am alone","travelling");
	
		TransformerService service = new TransformerServiceImpl();
		 String temp=service.validateAndSave(dto);
		 System.out.println(temp);
	
	}

}
