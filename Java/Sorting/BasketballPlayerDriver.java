import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		
			ArrayList<BasketballPlayer> players = new ArrayList<>();
			BasketballPlayer p1 = new BasketballPlayer("Smith", "Jay", 12.7);
			BasketballPlayer p2 = new BasketballPlayer("Smith", "DeShaun", 12.7);
			BasketballPlayer p3 = new BasketballPlayer("Taylor", "DeShaun", 18.1);
			players.add(p1);
			players.add(p2);
			players.add(p3);
			for (BasketballPlayer p: players)
				System.out.println(p);
			Collections.sort(players);
			for (BasketballPlayer p: players)
				System.out.println(p);
	}
}
