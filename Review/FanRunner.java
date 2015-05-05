/**
* @author Steven T Hanna
* @date 5/4/15
* @class FanRunner - runner for Fan class
*/
public class FanRunner {
	
	public static void main(String[] args) {
		Fan f1 = new Fan();
		Fan f2 = new Fan();

		f1.setSpeed(Fan.FAST);
		f1.setRadius(10);
		f1.setColor("yellow");
		f1.setIO(true);

		f2.setSpeed(Fan.MEDIUM);

		System.out.println(f1);
		System.out.println(f2);
	}
}