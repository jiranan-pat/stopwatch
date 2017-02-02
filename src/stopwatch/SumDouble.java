package stopwatch;

public class SumDouble implements Runnable {
	static final int ARRAY_SIZE = 500000;
	private int counter;
	private Double[] values;
	private Double sum;

	/**
	 * 
	 * 
	 * @param 
	 */
	public SumDouble(int counter) {
		this.counter = counter;
		this.values = new Double[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			this.values[i] = new Double(i + 1);
		this.sum = new Double(0.0);
	}

	/**
	 * 
	 */
	@Override
	public void run() {
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= this.values.length)
				i = 0;
			this.sum = this.sum + this.values[i];
		}
		System.out.println("sum = " + this.sum);
	}

	/**
	 * Return String to task
	 * 
	 * @return String that describe what the task do
	 */
	@Override
	public String toString() {
		return String.format("Sum array of Double objects with count = %,d\n",
				counter);
	}

}
