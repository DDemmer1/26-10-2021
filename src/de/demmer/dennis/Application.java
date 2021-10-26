package de.demmer.dennis;

public class Application {
	
	public static void main(String[] args) {
		
		Hund hund1 = new Hund();
		Hund hund2 = new Hund();
				
		hund1.setName("Günni");
		
		hund1.alter = 5;
		
		System.out.println(hund1.alter);
		
		System.out.println(hund1.getName());
		
		String name;
		name = hund2.getName();
		System.out.println(name);
		
		

	}

}
