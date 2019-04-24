package org.SingleResponsabilityPrinciple;
//Single Responsibility Principle – A class should have only one reason to change.
//A responsibility can be defined as a reason for change.
interface Printable{
	public String getContent();
}

public class Book {
	private String author;
	private String text;
	private String name;
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

class Printer{
	public void print (Printable printable) {
		System.out.println(printable.getContent());
	}
}


