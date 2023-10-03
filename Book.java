package com.uno;

import java.util.ArrayList;

class Book{
	int id;
	String name;
	String author;
	int price;
	int discount;
	
	public Book(int id, String name, String author, int price, int discount) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;	
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public static void main(String[] args) {

		ArrayList<Book> prdList = new ArrayList<Book>();
		
		Book p1 = new Book(101,"Rajesh","socialbook",45000,0);
		Book p2 = new Book(102,"Mahabarath","valmiki",55000,10);
		Book p3 = new Book(103,"Ramanay","vasya",75000,20);

		
		
	prdList.add(p1);prdList.add(p2);prdList.add(p3);
	
	
	System.out.println("Name\tAuthor\tPrice\tDiscount");
	Book eachPrd = null;
	for(int i=0;i<prdList.size();i++) {
		eachPrd = prdList.get(i);
		
		System.out.println(eachPrd.getName()+"\t"+eachPrd.getAuthor()+"\t"+eachPrd.getPrice()+"\t"+
		eachPrd.getDiscount());
	}
	
		System.out.println("\n\n Mahabarath 10% DisCount Details");
	displayproducts(prdList,"Mahabarath",10);
	
	
			
	}// main

	static void displayproducts(ArrayList<Book> prdList,String pName,int dis){
		
		Book onePrd = null;
		
		System.out.println("Name\tAuthor\tPrice\tDiscount");
				
		for(int i=0;i<prdList.size();i++) {
			onePrd = prdList.get(i);
			
			if(onePrd.getName().equalsIgnoreCase(pName)) {//
				if(onePrd.getDiscount() >= dis) {
System.out.println(onePrd.getName()+"\t"+onePrd.getAuthor()+"\t"+onePrd.getPrice()+"\t"+
												
onePrd.getDiscount());		
				}
			}
		
		}//for
		
	}// method
	
}




