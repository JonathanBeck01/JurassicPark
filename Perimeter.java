
public class Perimeter extends Hexagon {

	boolean dinoLocation;
	String startingDinoName;
	
	Perimeter(String name, SideType side1, SideType side2, SideType side3, SideType side4, SideType side5,
			SideType side6, boolean dinoLocation, String startingDinoName) {
		super(name, side1, side2, side3, side4, side5, side6);
		// TODO Auto-generated constructor stub
		this.dinoLocation = dinoLocation;
		this.startingDinoName = startingDinoName;
	}
	
	@Override public String toString()
	{
		return super.toString() + " " + dinoLocation + " " + startingDinoName;
	}
	
}
