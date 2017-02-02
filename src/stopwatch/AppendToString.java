package stopwatch;

/**
 * Append char 'a' to String
 * @author Jiranan Patrathamakul
 *
 */

public class AppendToString implements Runnable {

	private int count;

	/**
	 * 
	 * Declare number of chars
	 * @param count is number of chars
	 * 
	 */
	public AppendToString(int count) {
		this.count = count;
	}

	/**
	 * add 'a' to String until it reaches count.
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		String result = "";
		int k = 0;
		while (k++ < count) {
			result = result + CHAR;
		}
		System.out.println("final string length = " + result.length());
	}

	/**
	 * return the result of Task
	 * @return String that describes result of Task
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to String\n", count);
	}
}
