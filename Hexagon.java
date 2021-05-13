
enum SideType 
{
	OPEN, CLIFF, DE_FENCE, AC_FENCE, BORDER;
}
public class Hexagon {
	String name;
	int x;
	int y;
	int z;
	SideType side1, side2, side3, side4, side5, side6;
	boolean hasCoordinates;
	
	Hexagon(String name, SideType side1, SideType side2, SideType side3, SideType side4, SideType side5, SideType side6)
	{
		this.name = name;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.side4 = side4;
		this.side5 = side5;
		this.side6 = side6;
	}
	
	@Override public String toString()
	{
		return this.name + " " + side1 + " " + side2 + " " + side3 + " " + side4 + " " + side5 + " " + side6 + " " + x + " " + y + " " + z;
	}
	
}
