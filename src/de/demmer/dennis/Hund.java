package de.demmer.dennis;

public class Hund {
	
	private String name;
	public int alter;
	

	public String getName() {
		return name;
	}
	
	
	
	public void setName(String neuerName) {
		name = neuerName;
	}
	
	
	public void bellen() {
		System.out.println("Wuff!");
	}
	
	
}
