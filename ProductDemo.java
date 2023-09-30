package com.uno;


import java.util.ArrayList;

class Product{
	int id;
	String name;
	int price;
	String brand;
	int discount;
	
	public Product(int id, String name, int price, String brand, int discount) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.brand = brand;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
}
public class ProductDemo {

	public static void main(String[] args) {

		ArrayList<Product> prdList = new ArrayList<Product>();
		
		Product p1 = new Product(101,"Mobile",45000,"HP",0);
		Product p2 = new Product(102,"Mobile",55000,"Lenovo",10);
		Product p3 = new Product(103,"Mobile",75000,"Apple",20);
		
		Product p4 = new Product(104,"Watch",5000,"Titan",30);
		Product p5 = new Product(105,"Watch",75000,"Rado",0);
		Product p6 = new Product(106,"Watch",25000,"Apple",0);
		
		
	prdList.add(p1);prdList.add(p2);prdList.add(p3);prdList.add(p4);prdList.add(p5);prdList.add(p6);
	
	
	System.out.println("Name\tPrice\tBrand\tDiscount");
	Product eachPrd = null;
	for(int i=0;i<prdList.size();i++) {
		eachPrd = prdList.get(i);
		
		System.out.println(eachPrd.getName()+"\t"+eachPrd.getPrice()+"\t"+eachPrd.getBrand()+"\t"+
		eachPrd.getDiscount());
	}
	
	System.out.println("\n\n Mobile 5% DisCount Details");
	displayproducts(prdList,"Mobile",5);
	
	System.out.println("\n\n Watch 5% DisCount Details");
	displayproducts(prdList,"Watch",10);
	
	System.out.println("\n\n Watch No DisCount Details");
	displayproducts(prdList,"Watch",0);
	
	System.out.println("\n\n All Laptops Details");
	displayproducts(prdList,"Mobile",0);
	
	
	}// main

	static void displayproducts(ArrayList<Product> pList,String pName,int dis){
		
		Product onePrd = null;
		
		System.out.println("Name\tPrice\tBrand\tDiscount");
				
		for(int i=0;i<pList.size();i++) {
			onePrd = pList.get(i);
			
			if(onePrd.getName().equalsIgnoreCase(pName)) {//
				if(onePrd.getDiscount() >= dis) {
System.out.println(onePrd.getName()+"\t"+onePrd.getPrice()+"\t"+onePrd.getBrand()+"\t"+
												
onePrd.getDiscount());		
				}
			}
		
		}//for
		
	}// method
	
}

