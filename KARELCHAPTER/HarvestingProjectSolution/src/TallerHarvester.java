
public class TallerHarvester extends Harvester
{
	public TallerHarvester(int st, int ave, Direction direction, int numOfBeepers) 
	{
		super(st, ave, direction, numOfBeepers); 
	}
	
	public void harvestField()
	{
		pickTwoRows();
		pickTwoRows();
		pickTwoRows(); 
		pickTwoRows(); 
	}

}
