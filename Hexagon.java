
enum SideType 
{
	OPEN, CLIFF, DE_FENCE, AC_FENCE, BORDER;
}
public class Hexagon {
	private String name;
	private int x;
	private int y;
	private int z;
	private SideType side1, side2, side3, side4, side5, side6;
	private boolean hasCoordinates;
	
	public Hexagon(String name, SideType side1, SideType side2, SideType side3, SideType side4, SideType side5, SideType side6)
	{
		this.name = name;
		this.setSide1(side1);
		this.setSide2(side2);
		this.setSide3(side3);
		this.setSide4(side4);
		this.setSide5(side5);
		this.setSide6(side6);
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public SideType getSide1() {
		return side1;
	}

	public void setSide1(SideType side1) {
		this.side1 = side1;
	}

	public SideType getSide2() {
		return side2;
	}

	public void setSide2(SideType side2) {
		this.side2 = side2;
	}

	public SideType getSide3() {
		return side3;
	}

	public void setSide3(SideType side3) {
		this.side3 = side3;
	}

	public SideType getSide4() {
		return side4;
	}

	public void setSide4(SideType side4) {
		this.side4 = side4;
	}

	public SideType getSide5() {
		return side5;
	}

	public void setSide5(SideType side5) {
		this.side5 = side5;
	}

	public SideType getSide6() {
		return side6;
	}

	public void setSide6(SideType side6) {
		this.side6 = side6;
	}

	public boolean getHasCoordinates() {
		return hasCoordinates;
	}

	public void setHasCoordinates(boolean hasCoordinates) {
		this.hasCoordinates = hasCoordinates;
	}

	@Override public String toString()
	{
		return this.name + " " + getSide1() + " " + getSide2() + " " + getSide3() + " " + getSide4() + " " + getSide5() + " " + getSide6() + " " + getX() + " " + getY() + " " + getZ();
	}
	
}
