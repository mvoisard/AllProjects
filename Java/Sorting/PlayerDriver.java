import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {

//		Player[] players = new Player[100];
		
		ArrayList<Player> players = new ArrayList<>();
		
		Player p1 = new Player("Alice", 24, 2, 55);
		Player p2 = new Player("Bob", 50, 100, 10);
		Player p3 = new Player("Carol", 33, 33, 33);
		Player p4 = new Player("Dave", 50, 0, 0);
		
		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);
		
//		for (int i=0; i<players.size(); i++) {
//			System.out.println(players.get(i));
//		}
		
		for (Player p: players) {
			System.out.println(p);
		}
		
		System.out.println();
		
		Collections.sort(players);
		
		for (Player p: players) {
			System.out.println(p);
		}
		
//		ArrayList<Integer> temp = new ArrayList<>();
//		temp.add(22);
//		temp.add(47);
//		temp.add(16);
//		temp.add(5);
//		temp.add(55);
//		
//		System.out.println(temp);
//		Collections.sort(temp);
//		System.out.println(temp);
		
		PrintWriter pw = new PrintWriter("tictactoe.text");
		
		String s1 = "Michelle";
		
		if (Math.random() < 1.0) {
			s1 = null;
		}
		
		System.out.println(s1.length());
	}

}
