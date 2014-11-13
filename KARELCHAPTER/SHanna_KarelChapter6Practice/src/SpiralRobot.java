import kareltherobot.*;

public class SpiralRobot extends Robot 
{

	public SpiralRobot(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	
	}
	public void spiralinside(int numS)
	{ 
		putBeeper();
		
		while(frontIsClear())
		{
		
		for (int a=0; a< numS ;a++)
		{			
			for (int b=0; b<a ;b++)
			{
				move(); //goes move 6 times
				putBeeper();
			}		
			turnLeft(); //then turns
			numS++;
		}
		}
	}
	public void turnRight()
	{
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	public void spiraloutside() {
		// Biggest length of spiral
		int numD=20;
		
		while(frontIsClear()) {
			for (int a=0; a<numD; a++){
				for (int b=20; b>a; b--) {
					move(); //goes move put
					putBeeper();
				}		
				turnRight(); //then turns
				numD++;
			}
		}
		
	}
	
	public void mySpiral() {
		int number = 20;
		
		while(frontIsClear()) {
			for(int a=number; a>0; a--) {
				for(int i=number; i>0; i--) {
					putBeeper();
					move();
				}
				number--;
				turnRight();
				if(number == 0) {
					turnOff();
				}
			}
		}
	}
	public static void main(String[] args)
	{
		World.setVisible(true);
		World.setSize(20,20);
		World.setDelay(1);
		
		SpiralRobot a = new SpiralRobot(20,1,East,infinity);
		// a.spiraloutside();
		a.mySpiral();

	}

}
