import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class JurassicParkDanger {
		public static ArrayList<Hexagon> GenerateBoard()
	{
		//createGameBoard();
		//Create each hexagon piece
		//Add them to an arraylist of hexagons
		//Add the loose hexagons to arraylists specific to them
		//Randomly spin all of the "loose" hexagons
		//Assign coordinates to hexagons
		
		Hexagon start = new Start("start", SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.OPEN, 0, 0, 0);
		Hexagon center1 = new Hexagon("center1", SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.CLIFF, SideType.DE_FENCE);
		Hexagon center2 = new Hexagon("center2", SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.CLIFF, SideType.OPEN);
		Hexagon center3 = new Hexagon("center3", SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.CLIFF, SideType.DE_FENCE);
		Hexagon center4 = new Hexagon("center4", SideType.CLIFF, SideType.OPEN, SideType.OPEN, SideType.CLIFF, SideType.OPEN, SideType.OPEN);
		Hexagon center5 = new Hexagon("center5", SideType.DE_FENCE, SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.CLIFF, SideType.OPEN);
		Hexagon center6 = new Hexagon("center6", SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.OPEN);
		Hexagon perimeter1 = new Perimeter("perimeter1", SideType.CLIFF, SideType.OPEN, SideType.OPEN, SideType.CLIFF, SideType.OPEN, SideType.OPEN, true, "brach");
		Hexagon perimeter2 = new Perimeter("perimeter2", SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.CLIFF, SideType.DE_FENCE, true, "trike");
		Hexagon perimeter3 = new Perimeter("perimeter3", SideType.DE_FENCE, SideType.OPEN, SideType.OPEN, SideType.DE_FENCE, SideType.OPEN, SideType.OPEN, true, "raptor");
		Hexagon perimeter4 = new Perimeter("perimeter4", SideType.DE_FENCE, SideType.OPEN, SideType.OPEN, SideType.DE_FENCE, SideType.OPEN, SideType.OPEN, true, "dilo");
		Hexagon perimeter5 = new Perimeter("perimeter5", SideType.DE_FENCE, SideType.OPEN, SideType.OPEN, SideType.DE_FENCE, SideType.OPEN, SideType.OPEN, true, "trex");
		Hexagon perimeter6 = new Perimeter("perimeter6", SideType.CLIFF, SideType.OPEN, SideType.OPEN, SideType.CLIFF, SideType.OPEN, SideType.OPEN, false, "null");
		Hexagon perimeter7 = new Perimeter("perimeter7", SideType.OPEN, SideType.CLIFF, SideType.OPEN, SideType.DE_FENCE, SideType.OPEN, SideType.OPEN, false, "null");
		Hexagon perimeter8 = new Perimeter("perimeter8", SideType.DE_FENCE, SideType.OPEN, SideType.CLIFF, SideType.OPEN, SideType.OPEN, SideType.OPEN, false, "null");
		Hexagon perimeter9 = new Perimeter("perimeter9", SideType.DE_FENCE, SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.CLIFF, SideType.OPEN, false, "null");
		Hexagon perimeter10 = new Perimeter("perimeter10", SideType.CLIFF, SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.OPEN, false, "null");
		Hexagon perimeter11 = new Perimeter("perimeter11", SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.CLIFF, SideType.CLIFF, false, "null");
		Hexagon perimeter12 = new Perimeter("perimeter12", SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.OPEN, false, "null");
		Hexagon board1 = new BoardHex("board1", SideType.BORDER, SideType.BORDER, SideType.OPEN, SideType.OPEN, SideType.OPEN, SideType.OPEN, -2, 3, -1);
		Hexagon board2 = new BoardHex("board2", SideType.OPEN, SideType.OPEN, SideType.BORDER, SideType.BORDER, SideType.OPEN, SideType.OPEN, -1, 3, -2);
		Hexagon helicopter = new BoardHex("helicopter", SideType.BORDER, SideType.BORDER, SideType.BORDER, SideType.BORDER, SideType.OPEN, SideType.OPEN, -2, 4, -2);
		
		ArrayList<Hexagon> hexagonArray = new ArrayList<Hexagon>(22); //All the hexagons
		ArrayList<Hexagon> centerHexagonArray = new ArrayList<Hexagon>(); //Only the center ring of hexagons
		ArrayList<Hexagon> perimeterHexagonArray = new ArrayList<Hexagon>(); //Only the center ring of hexagons
		
		hexagonArray.add(start);
		hexagonArray.add(center1);
		hexagonArray.add(center2);
		hexagonArray.add(center3);
		hexagonArray.add(center4);
		hexagonArray.add(center5);
		hexagonArray.add(center6);
		hexagonArray.add(perimeter1);
		hexagonArray.add(perimeter2);
		hexagonArray.add(perimeter3);
		hexagonArray.add(perimeter4);
		hexagonArray.add(perimeter5);
		hexagonArray.add(perimeter6);
		hexagonArray.add(perimeter7);
		hexagonArray.add(perimeter8);
		hexagonArray.add(perimeter9);
		hexagonArray.add(perimeter10);
		hexagonArray.add(perimeter11);
		hexagonArray.add(perimeter12);
		hexagonArray.add(board1);
		hexagonArray.add(board2);
		hexagonArray.add(helicopter);
		
		//Hold the center hexagons in a center hexagon list
		for (int i = 1; i<7; i++)
		{
			centerHexagonArray.add(hexagonArray.get(i));
		}
		//Hold the perimeter hexagons in a perimeter hexagon list
		for (int i = 7; i<19; i++)
		{
			perimeterHexagonArray.add(hexagonArray.get(i));
		}
		
		//Spin the centers
		for (Hexagon hex : centerHexagonArray)
		{
			RandomSpin(hex);
		}
		//Spin the perimeters
		for (Hexagon hex : perimeterHexagonArray)
		{
			RandomSpin(hex);
		}

		//Shuffle the loose hexagon arrays
		Collections.shuffle(perimeterHexagonArray);
		Collections.shuffle(centerHexagonArray);
		
		//Assign coordinates to hexagons
		int hexDepth = -2;
		for (int i = hexDepth; i<Math.abs(hexDepth)+1; i++)
		{
			for (int j = hexDepth; j<Math.abs(hexDepth)+1; j++)
			{
				for (int k = hexDepth; k<Math.abs(hexDepth)+1; k++)
				{
					if (i + j + k == 0)
					{
						//Loop for Center ring
						if (Math.abs(i) < 2 && Math.abs(j) < 2 && Math.abs(k) < 2)
						{
							if (Math.abs(i) > 0 || Math.abs(j) > 0 || Math.abs(k) > 0)
							{
								for (Hexagon hex : centerHexagonArray)
								{
									//If a hex doesn't have coordinates yet, assign them then break out of the loop
									if (hex.getHasCoordinates() == false)
									{
										hex.setX(i);
										hex.setY(j);
										hex.setZ(k);
										hex.setHasCoordinates(true);
										break;
									}
								}
							}
						}
						//Loop for Perimeter ring
						else if (Math.abs(i) == 2 || Math.abs(j) == 2 || Math.abs(k) == 2)
						{
							for (Hexagon hex : perimeterHexagonArray)
							{
								//If a hex doesn't have coordinates yet, assign them then break out of the loop
								if (hex.getHasCoordinates() == false)
								{
									hex.setX(i);
									hex.setY(j);
									hex.setZ(k);
									hex.setHasCoordinates(true);
									break;
								}
							}
						}
					}
				}
			}
		}
		//Finds the perimeter hexes in the human victory locations and renames them
		for (Hexagon hex : hexagonArray)
		{
			if (hex.getX() == -2 && hex.getY() == 0 && hex.getZ() == 2)
			{
				hex.setName("Control Center");
			}
			else if (hex.getX() == 1 && hex.getY() == -2 && hex.getZ() == 1)
			{
				hex.setName("Visitor's Center");
			}
			else if (hex.getX() == 2 && hex.getY() == 0 && hex.getZ() == -2)
			{
				hex.setName("Maintenance Shed");
			}
		}
		return hexagonArray;
	}
	
	public static ArrayList<Character> GenerateCharacters(ArrayList<Hexagon> hexArray)
	{
		ArrayList<Character> characterArray = new ArrayList<Character>();
		
		Character alanGrant = new Human("Alan Grant", 0,0,0);
		Character dennisNedry = new Human("Dennis Nedry", 0,0,0);
		Character elliSatler = new Human("Ellie Satler",0,0,0);
		Character ianMalcom = new Human("Ian Malcom",0,0,0);
		Character donaldGennaro = new Human("Donald Gennaro",0,0,0);
		Character lexMurphy = new Human("Lex Murphy",0,0,0);
		Character timMurphy = new Human("Tim Murphy",0,0,0);
		Character johnHammond = new Human("John Hammond",0,0,0);
		Character rayArnold = new Human("Ray Arnold", 0,0,0);
		Character robertMuldoon = new Human("Robert Muldoon", 0,0,0);
		characterArray.add(alanGrant);
		characterArray.add(robertMuldoon);
		characterArray.add(lexMurphy);
		characterArray.add(donaldGennaro);
		characterArray.add(dennisNedry);
		characterArray.add(elliSatler);
		characterArray.add(rayArnold);
		characterArray.add(timMurphy);
		characterArray.add(ianMalcom);
		characterArray.add(johnHammond);
		
		for (Character a : characterArray)
		{
		for (Hexagon hex : hexArray)
			{
				if (a.x == hex.getX() && a.y == hex.getY() && a.z == hex.getZ())
				{
					a.setLocation(hex);
				}
			}
		}
		
		Character raptor = new Character();
		Character trex = new Character();
		Character dilo = new Character();
		
		//Iterate through the hex array and place the dinosaurs
		for (Hexagon hex : hexArray)
		
		{
			if (hex.toString().contains("dilo"))
			{
				dilo.name = "Dilophosaurus";
				dilo.setLocation(hex);
				dilo.x = hex.getX();
				dilo.y = hex.getY();
				dilo.z = hex.getZ();
			}
			else if (hex.toString().contains("trex"))
			{
				trex.name = "Tyranasaurus Rex";
				trex.setLocation(hex);
				trex.x = hex.getX();
				trex.y = hex.getY();
				trex.z = hex.getZ();
			}
			else if (hex.toString().contains("raptor"))
			{
				raptor.name = "Velociraptor";
				raptor.setLocation(hex);
				raptor.x = hex.getX();
				raptor.y = hex.getY();
				raptor.z = hex.getZ();
			}
		}
		
		characterArray.add(dilo);
		characterArray.add(trex);
		characterArray.add(raptor);
		
		return characterArray;
	}
	
	//Rotates the hex by assigning the side value one value forward (Rotates *left*)
	public static void SingleSpin(Hexagon a)
	{
		String side1String = a.getSide1().name();
		String side2String = a.getSide2().name();
		String side3String = a.getSide3().name();
		String side4String = a.getSide4().name();
		String side5String = a.getSide5().name();
		String side6String = a.getSide6().name();
		a.setSide1(SideType.valueOf(side2String));
		a.setSide2(SideType.valueOf(side3String));
		a.setSide3(SideType.valueOf(side4String));
		a.setSide4(SideType.valueOf(side5String));
		a.setSide5(SideType.valueOf(side6String));
		a.setSide6(SideType.valueOf(side1String));
	}
	
	//Rotates the hex a random number of times by calling SingleSpin a random number of times (0-6)
	public static void RandomSpin(Hexagon a)
	{
		Random rand = new Random();
		int randInt = rand.nextInt(6);
		for (int i = 0; i < randInt; i++)
		{
			SingleSpin(a);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Hexagon> hexagonArray = new ArrayList<Hexagon>(); //Create hexagon arraylist to hold generated board elements
		hexagonArray.addAll(GenerateBoard()); //Generate board and return generated board, which is an arraylist of hexagons
		//GameBoard gameBoard = new GameBoard(GenerateBoard());
		//System.out.println(gameBoard.toString());
		
		/*
		for (Hexagon a : hexagonArray)
		{
			System.out.println(a.toString());
		*/
		
		
		//ArrayList<Character> characterArray = new ArrayList<Character>();
		//characterArray.addAll(GenerateCharacters(hexagonArray));
		CharacterList characterList = new CharacterList(GenerateCharacters(hexagonArray));
		
		/*
		for (Character a : characterArray)
		{
			System.out.println(a.toString());
		}
		*/
		
		
		
		System.out.println(characterList.getCharacter("Velociraptor").toString());
		characterList.getCharacter("Velociraptor").Move(4, hexagonArray);
		System.out.println(characterList.getCharacter("Velociraptor").toString());
		System.out.println(characterList.getCharacter("Dilophosaurus").toString());
		characterList.getCharacter("Dilophosaurus").Move(4, hexagonArray);
		System.out.println(characterList.getCharacter("Dilophosaurus").toString());
		System.out.println(characterList.getCharacter("Tyranasaurus Rex").toString());
		characterList.getCharacter("Tyranasaurus Rex").Move(4, hexagonArray);
		System.out.println(characterList.getCharacter("Tyranasaurus Rex").toString());
		
		
	}
}