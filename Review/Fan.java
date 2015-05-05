public class Fan {

	// Static constants
	private final int FAST = 3;
	private final int MEDIUM = 2;	
	private final int SLOW = 1;

	/**
	* Designates fan speed.
	* Default speed of fan is slow
	*/
	private int speed = SLOW;

	/**
	* Determines I/O of fan
	* true == on
	* false == off (default)
	*/
	private boolean io = false;

	/**
	* Determines radius of fan
	* Default is 5
	*/
	private int radius = 5;

	/**
	* Determiens fan color
	* Default is blue
	*/
	private String color = "blue";

	/**
	* Default fan constructor
	*/
	public Fan() {

	}

	/**
	* @return speed of fan object
	*/
	public int getSpeed() {
		return speed;
	}

	/**
	* @param int num to set the speed
	*/
	public void setSpeed(int num) {
		speed = num;
	}

	/**
	* @return io of fan
	*/
	public boolean getio() {
		return io;
	}

	/**
	* @param boolean io to set io
	*/
	public void setio(boolean i) {
		io = i;
	}

	/**
	* @return radius of fan
	*/
	public int getRadius() {
		return radius;
	}

	/**
	* @param int radius to set fan object
	*/
	public void setRadius(int radi)  {
		radius = radi;
	}

	/**
	* @return color of fan
	*/
	public String getColor() {
		return color;
	}

	/**
	* @param String col - set to lower case and saved
	* to color
	*/
	public void setColor(String col) {
		color = col.toLowerCase();
	}

	/**
	* @return description of fan
	*/
	@Override
	public String toString() {
		// 	if on
		if(io) {
			return "Fan speed: " + speed + " color: " + color + " radius: " + radius;
		} else {
			return "Color: " + color + " radius: " + radius + " fan is off";
		}
	}
}