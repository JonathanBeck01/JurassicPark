
public class BoardHex extends Hexagon {

	BoardHex(String name, SideType side1, SideType side2, SideType side3, SideType side4, SideType side5,
			SideType side6, int x, int y, int z) {
		super(name, side1, side2, side3, side4, side5, side6);
		this.x = x;
		this.y = y;
		this.z = z;
	}

}
