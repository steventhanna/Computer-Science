import kareltherobot.*;

public class Question3 extends MessageScribe implements Directions {

	public Question3(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}

	public static void main(String[] args) {
		World.setSize(10, 22);
		World.setVisible(true);
		World.setDelay(0);
		MessageScribe sophia = new MessageScribe(5,1,East, infinity);
		MessageScribe matthew = new MessageScribe(2,1,East, infinity);
		MessageScribe josh = new MessageScribe(3,1,East, infinity);
		MessageScribe mark = new MessageScribe(4,1,East, infinity);
		MessageScribe john = new MessageScribe(1,1,East, infinity);
		sophia.scribeOne();
		matthew.scribeTwo();
		josh.scribeThree();
		mark.scribeFour();
		john.scribeFive();

	}

}
