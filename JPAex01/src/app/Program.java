package app;

import domain.Person;

public class Program {

	public static void main(String[] args) {
		Person p = new  Person(1, "Zeca das Couves", "zedacouve@gmail.com");
		
		System.out.println(p.toString());
	}

}
