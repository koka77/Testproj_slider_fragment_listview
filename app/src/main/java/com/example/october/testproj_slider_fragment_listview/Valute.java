package com.example.october.testproj_slider_fragment_listview;

import java.util.ArrayList;

public class Valute {
	public String name;
	public String value;

	public Valute(String name, String hometown) {
		this.name = name;
		this.value = hometown;
	}

	public static ArrayList<Valute> getValutes() {
		ArrayList<Valute> valutes = new ArrayList<Valute>();
		valutes.add(new Valute("RUB", "1"));
		valutes.add(new Valute("USD", "2"));
		valutes.add(new Valute("EUR", "3"));
		return valutes;
	}
}
