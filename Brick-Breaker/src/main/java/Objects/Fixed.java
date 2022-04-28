package main.java.Objects;

public abstract class Fixed extends GameObject {
	// Attributes for the class Fixed----------------------------------------

	private static int uId = 1;
	private int id;

	// Behaviours for the class Fixed----------------------------------------

	// Default constructor
	public Fixed() {

		id = uId;
		uId++;

	}

	// Method to override the toString method for the class Fixed
	public String toString() {

		return super.toString();

	}

	// Getter method for id
	public int getId() {

		return id;

	}

	// Method to set the location of the object
	public void setLocation(double x, double y) {

		super.setLocation(x, y);

	}
}
