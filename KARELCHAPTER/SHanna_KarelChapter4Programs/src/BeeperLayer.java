import kareltherobot.*;


public abstract class BeeperLayer extends Robot {
	
	public BeeperLayer(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		
	}
	
	/*
	 * The project indicates that there are going to be several holes in the program.
	 * These holes are actually for our benefit. We can "plug these holes" in other programs.
	 * This will be indicated by an @override  
	 */
	public abstract void dropBeeper();
	
	// Because this is not abstract, it can be interpreted as any other method normally.
	public void turnRight() {
		World.setDelay(0);
		for(int i=3; i>0; i--) {
			turnLeft();
		}
		World.setDelay(10);
	}

}
