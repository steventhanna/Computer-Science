import kareltherobot.*; 

public class ManipulatorRunner implements Directions
{
	public static void main(String[] args)
	{
		World.setVisible(true);
		World.setDelay(20);
		World.setSize(11,11); 
		
		Manipulator profX = new Manipulator(1, 1, North, infinity); 
		MileWalker zombie = new MileWalker(2, 1, East, 0);
		BackWalker jackson = new BackWalker(5, 5, North, 0);
		Knight john = new Knight(3, 3, North, 0); 
		
		// Are these move methods different?
		profX.move(zombie);
		profX.move(jackson);
		profX.move(john); 
		profX.move(); 
		profX.move(); 
		profX.move();
		
		// things I can't try to do
		// jackson.turnAround(); 
		// john.turnRight(); 
		
		// things I can do
		// jackson.move(); 
		// john.move();
		// zombie.turnLeft(); 
		// zombie.move();
		
		// tell more than one robot to move
		// profX.move(jackson,john); 
		// profX.move(profX, jackson); 
	}
}
