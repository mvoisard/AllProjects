public class Player implements Comparable<Player> {
	
	private String name;
	private char symbol;
	private int wins;
	private int losses;
	private int ties;
	
	public Player(String name) {
		this.name = name;
		wins = 0;
		losses = 0;
		ties = 0;
	}
	
	public Player(String name, char symbol) {
		this(name);
		this.symbol = symbol;
	}
	
	public Player(String name, int wins, int losses, int ties) {
		this(name);
		this.wins = wins;
		this.losses = losses;
		this.ties = ties;
	}
	
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	
	public void incrementWins() {
		wins++;
	}
	
	public void incrementLosses() {
		losses++;
	}
	
	public void incrementTies() {
		ties++;
	}
	
	@Override
	public String toString() {
		return name + "\t" + wins + "-" + losses + "-" + ties;
	}

	@Override
	public int compareTo(Player o) {
		
		if (this.wins > o.wins) {
			return -1;
		} else if (this.wins < o.wins) {
			return 1;
		} else {
			if (this.losses < o.losses) {
				return -1;
			} else if (this.losses > o.losses) {
				return 1;
			} else {
				if (this.ties > o.ties) {
					return -1;
				} else if (this.ties < o.ties) {
					return 1;
				} else {
					// if same record, sort alphabetically
					return this.name.compareTo(o.name);
				}
			}
		}
	}
}