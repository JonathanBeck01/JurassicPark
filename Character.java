
public class Character {
	String name;
	Hexagon location;
	int x;
	int y;
	int z;
	
	Character()
	{
		//No arg constructor
	}
	
	Character(String name, Hexagon location)
	{
		this.name = name;
		this.location = location;
		this.x = location.x;
		this.y = location.y;
		this.z = location.z;
	}
	
	@Override public String toString()
	{
		return name + " " + location.name + " " + x + " " + y + " " + z;
	}
}
