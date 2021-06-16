import java.util.ArrayList;

public class GameBoard {
	ArrayList<Hexagon> hexList;
	GameBoard(ArrayList<Hexagon> hexList){
		this.hexList = hexList;
	}
	
	@Override public String toString() {
		return String.valueOf(hexList.get(0));
	}
}
