import java.util.logging.Level;
import java.util.logging.Logger;

public class Sep4b {

	public static void main(String[] args) {
		
		Logger user = Logger.getLogger("user");
		Logger dev = Logger.getLogger("dev");
		
		user.severe("Stuff to tell tech support");
		dev.info("Got to this method");
		
		Logger logger = Logger.getGlobal();
		logger.setLevel(Level.OFF);
		
		logger.info("This thing just happened");
		
		logger.warning("This potentially bad thing happened");
		
		if (add(-5, -7) != 12) {
			logger.severe("This definitely bad thing happened");
		}

		System.out.println("Done!");
	}

	
	public static int add(int x, int y) {
		return x + Math.abs(y);
	}
}
