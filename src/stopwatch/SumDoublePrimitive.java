package stopwatch;

public class SumDoublePrimitive implements Runnable {
	static final int ARRAY_SIZE = 500000;
	private int counter;
	private double[] values;
	private double sum;

	/**
	 * To declare how many time that DoublePrimitive have to sum
	 * 
	 * @param counter
	 *            is the time to sum DoublePrimitive
	 */
	public SumDoublePrimitive(int counter) {
		this.counter = counter;
		this.values = new double[ARRAY_SIZE];
		for (int k = 0; k < ARRAY_SIZE; k++)
			this.values[k] = k + 1;
		this.sum = 0.0;
	}

	/**
	 * The task that sum DoublePrimitive until reach the counter
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
		return String.format("Sum array of double primitives with count = %,d\n",
				counter);
	}

}
