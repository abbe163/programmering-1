package lektion5.konstruktorer;

/**
 * 
 * @author abdullahiahmed.ali
 *
 */
public class Car {
	private int numberOfDoors = 5;
	private int numberOfWheels = 4;
	private String color = "purple";
	private int antaletRattar = 2;
	private String carBrand = "Volvo";
	private int speed = 0;

	/**
	 * konstruktor för Bil classen sätter färgen på bilen vid skapande
	 */
	public Car(String selectedColor) {
		color = selectedColor;
	}

	/**
	 * 
	 * @param newSpeed
	 */
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	/**
	 * 
	 * @return
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * 
	 * @param newColor
	 */
	public void setColor(String newColor) {
		color = newColor;

	}

	/**
	 * 
	 * @return
	 */
	public String getColor() {
		return color;

	}
}