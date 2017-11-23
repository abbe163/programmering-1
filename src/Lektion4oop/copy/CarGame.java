package Lektion4oop.copy;

public class CarGame {

	public static void main(String args) {
		Car coffeBil = new Car();

		System.out.println(coffeBil.getSpeed());

		coffeBil.setSpeed(2000);

		System.out.println(coffeBil.getSpeed());

	}

}