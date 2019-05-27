public class BasketballPlayer implements Comparable<BasketballPlayer> {
	private String firstName;
	private String lastName;
	private double ppg;
	
	public BasketballPlayer(String first, String last, double PPG) {
		firstName = first;
		lastName = last;
		ppg = PPG;
	}
	
	public String toString() {
		String ppg2 = Double.toString(ppg);
		String player = firstName + ", " + lastName + " (" + ppg + ")";
		return player;
	}

    @Override
	public int compareTo(BasketballPlayer o) {
    	if (this.ppg < o.ppg)
            return -1;
        if (this.ppg == o.ppg)
            return 0;
        if (this.ppg > o.ppg)
        	return 1;
	}
}
