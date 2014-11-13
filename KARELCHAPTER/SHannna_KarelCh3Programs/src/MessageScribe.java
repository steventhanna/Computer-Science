import kareltherobot.*;

public class MessageScribe extends BetterMethods implements Directions {

	public MessageScribe(int street, int avenue, Direction direction,
			int beepers) {
		super(street, avenue, direction, beepers);
		
	}
	
	static int[] messageArrayOne = {
		0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0,
	};
	
	static int[] messageArrayTwo = {
		0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 
	};
	
	static int[] messageArrayThree = {
		0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0,
	};
	
	static int[] messageArrayFour = {
		0, 1, 0 ,0 ,1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0,
	};
	
	static int[] messageArrayFive = {
		0, 1, 0, 0 ,1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0,
	};
	
	
	public void scribeOne() {
		for(int i=0; i < messageArrayOne.length; i++) {
			int messageVariable = messageArrayOne[i];
			if(messageVariable == 0) {
				move();
			} else if(messageVariable == 1) {
				putBeeper();
				move();
			}
		}
	}
	
	public void scribeTwo() {
		for(int i=0; i < messageArrayTwo.length; i++) {
			int messageVariable = messageArrayTwo[i];
			if(messageVariable == 0) {
				move();
			} else if(messageVariable == 1) {
				putBeeper();
				move();
			}
		}
	}
	
	public void scribeThree() {
		for(int i=0; i < messageArrayThree.length; i++) {
			int messageVariable = messageArrayThree[i];
			if(messageVariable == 0) {
				move();
			} else if(messageVariable == 1) {
				putBeeper();
				move();
			}
		}
	}
	
	public void scribeFour() {
		for(int i=0; i < messageArrayFour.length; i++) {
			int messageVariable = messageArrayFour[i];
			if(messageVariable == 0) {
				move();
			} else if(messageVariable == 1) {
				putBeeper();
				move();
			}
		}
	}
	
	public void scribeFive() {
		for(int i=0; i < messageArrayFive.length; i++) {
			int messageVariable = messageArrayFive[i];
			if(messageVariable == 0) {
				move();
			} else if(messageVariable == 1) {
				putBeeper();
				move();
			}
		}
	}

}
