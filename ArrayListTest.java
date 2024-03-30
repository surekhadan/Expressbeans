package com.hdfc.ergo.business;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		//variables/methods-static or instance methods
		//store,retrieve/manipulate the data
		ArrayList<String>listOfCustomers=new ArrayList<>();
		listOfCustomers.add("gopi");
		listOfCustomers.add("priya");
		System.out.println(listOfCustomers.size());
	}
}