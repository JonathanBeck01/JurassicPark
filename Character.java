import java.util.ArrayList;

public class Character {
	protected String name;
	private Hexagon location;
	protected int x;
	protected int y;
	protected int z;
	
	Character()
	{
		//No arg constructor
	}
	
	Character(String name, Hexagon location)
	{
		this.name = name;
		this.setLocation(location);
		this.x = location.getX();
		this.y = location.getY();
		this.z = location.getZ();
	}
	
	public Hexagon getLocation() {
		return location;
	}

	public void setLocation(Hexagon location) {
		this.location = location;
	}

	//Move the character based on direction input
	//Hold current location in a placeholder so that a check can be made to see if the character moved
	//Update x/y/z based on direction
	//Iterate through hexArray to find matching coordinates and equalize character location
	//If new character location matches old character location, reset xyz and return "Invalid location"
	public void Move(int i, ArrayList<Hexagon> hexArray)
	{
		String placeholderLocation = this.getLocation().getName();
		
		switch (i)
		{
			case 1:
				this.x+=1;
				this.z-=1;
				break;
			case 2:
				this.y+=1;
				this.z-=1;
				break;
			case 3:
				this.x-=1;
				this.y+=1;
				break;
			case 4:
				this.x-=1;
				this.z+=1;
				break;
			case 5:
				this.y-=1;
				this.z+=1;
				break;
			case 6:
				this.x+=1;
				this.y-=1;
				break;
			default:
				System.out.println("Invalid direction");
		}
		
		for (Hexagon hex : hexArray)
		{
			if (this.x == hex.getX() && this.y == hex.getY() && this.z == hex.getZ())
			{
				this.setLocation(hex);
			}
		}
		if (placeholderLocation == this.getLocation().getName())
		{
			this.x = this.getLocation().getX();
			this.y = this.getLocation().getY();
			this.z = this.getLocation().getZ();
			System.out.println("Invalid direction");
		}
	}
	
	@Override public String toString()
	{
		return name + " " + getLocation().getName() + " " + x + " " + y + " " + z;
	}
}
