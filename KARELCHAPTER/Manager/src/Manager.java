import kareltherobot.*;

public class Manager extends Robot implements Directions {

	public Manager(int street, int avenue, Direction direction, int beepers, BeeperLayer w1, BeeperLayer w2, BeeperLayer w3) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
		work1 = w1;
		work2 = w2;
		work3 = w3;
	}

	public void doYourThang() {
		// TODO Auto-generated method stub
		work1.go();
		work2.go();
		work3.go();
		
	}
	
	private BeeperLayer work1;
	private BeeperLayer work2;
	private BeeperLayer work3;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		World.setVisible(true); 
		World.setDelay(15); 
		 
		OneLayer worker1 = new OneLayer(1, 1, North, infinity); // fill in location 
		BeeperLayer worker2 = new TwoLayer(3, 2, South, infinity); // fill in location 
		ThreeLayer worker3 = new ThreeLayer(1, 4, North, infinity); // fill in location 
		Manager romney = new Manager(1, 7, North, 0, worker1, worker2, worker3); 
		romney.setVisible(false);
		romney.doYourThang(); 


	}



}
