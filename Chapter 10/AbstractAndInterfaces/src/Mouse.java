
public class Mouse extends Animal implements Edible {

	public Mouse() {
		
	}

	@Override
	public String howToEat() {
		return "Catch it and Devour";
	}

	@Override
	public void eat(Edible edible) {
		System.out.println("You ate " + edible.toString());
	}
	
	public String toString() {
		return "Mouse";
	}

}
