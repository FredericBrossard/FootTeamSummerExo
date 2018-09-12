package co.simplon.footteam.model;

public class Player {

	/*
	 * Code attributes here
	 * - First name of the player
	 * - Last name of the player
	 * - Position on the field (number)
	 * - Average note (0 to 100)
	 */
	public String firstName;
	public String name;
	public int positionField;
	public int noteAverage;
	
	
	/*
	 * Code constructors here
	 * - One empty constructor
	 * - One constructor with all attributes
	 */
	
	public Player () {};
	
	public Player(String firstName, String name, int positionField, int noteAverage) {
		this.firstName = firstName;
		this.name = name;
		this.positionField = positionField;
		this.noteAverage = noteAverage;
	}

	@Override
	public String toString() {
		return "Player [firstName=" + firstName + ", name=" + name + ", positionField=" + positionField
				+ ", noteAverage=" + noteAverage + "]";
	}
	
	
}
