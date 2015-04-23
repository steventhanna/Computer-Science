
public abstract class Fruit implements Edible {

	public String type;
	
	public Fruit() {
		type = "Fruit";
	}
	
	public Fruit(String type) {
		this.type = type;
	}
	
	public String howToEat() {
		return null;
	}
	
}
