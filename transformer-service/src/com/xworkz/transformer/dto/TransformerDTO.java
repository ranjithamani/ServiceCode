package com.xworkz.transformer.dto;
import java.io.Serializable;

import com.xworkz.transformer.dto.constants.CharacterType;

public class TransformerDTO implements Serializable{

	private String name;
	private String place;
	private CharacterType type;
	private String angry;
	private  String happy;
	private String sad;
	private String likeToDo;
	
	public TransformerDTO() {
		// TODO Auto-generated constructor stub
	}

	public TransformerDTO(String name, String place, CharacterType type, String angry, String happy, String sad,
			String likeToDo) {
		super();
		this.name = name;
		this.place = place;
		this.type = type;
		this.angry = angry;
		this.happy = happy;
		this.sad = sad;
		this.likeToDo = likeToDo;
	}

	@Override
	public String toString() {
		return "TransformerDTO [name=" + name + ", place=" + place + ", type=" + type + ", angry=" + angry + ", happy="
				+ happy + ", sad=" + sad + ", likeToDo=" + likeToDo + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(obj instanceof TransformerDTO) {
			TransformerDTO casted=(TransformerDTO)obj;
			if(this.name.equals(casted.name)&& this.place.equals(casted.place)
					&& this.angry.equals(casted.angry)) {
				return true;
			}
		}
		
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public CharacterType getType() {
		return type;
	}

	public void setType(CharacterType type) {
		this.type = type;
	}

	public String getAngry() {
		return angry;
	}

	public void setAngry(String angry) {
		this.angry = angry;
	}

	public String getHappy() {
		return happy;
	}

	public void setHappy(String happy) {
		this.happy = happy;
	}

	public String getSad() {
		return sad;
	}

	public void setSad(String sad) {
		this.sad = sad;
	}

	public String getLikeToDo() {
		return likeToDo;
	}

	public void setLikeToDo(String likeToDo) {
		this.likeToDo = likeToDo;
	}
	
	
}
