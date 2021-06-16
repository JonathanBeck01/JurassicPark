import java.util.ArrayList;

public class CharacterList {
	
	private ArrayList<Character> characterList;
	
	CharacterList(ArrayList<Character> characterList) {
		this.characterList = characterList;
	}
	
	public Character getCharacter (String a) {
		for (Character b : characterList)
		{
			if (a == b.name) {
				return b;
			}
		}
		return null;
	}
}
