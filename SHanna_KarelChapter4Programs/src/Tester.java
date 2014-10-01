import kareltherobot.*;

public class Tester implements Directions{

	
	private OneLayer thad = new OneLayer(1,1,North, infinity);
	private OneLayer cobo = new OneLayer(1,4,North,infinity);
	private TwoLayer john = new TwoLayer(1,2,North,infinity);
	private TwoLayer jose = new TwoLayer(1,5,North,infinity);
	private ThreeLayer mark = new ThreeLayer(1,7,North,infinity);
	
	private void getToWork() {
		thad.layerOne();
		cobo.layerOne();
		john.twoRows();
		jose.twoRows();
		mark.threeRows();
	}
	
	
	public static void main(String[] args) {
		World.setVisible(true);
		World.setSize(10,10);
		BeeperLayer bill = new BeeperLayer(1,1,North,infinity);
		bill.getToWork();
		
		
	}




	
	
	
}
