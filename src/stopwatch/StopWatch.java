package stopwatch;

/**
 * A Stopwatch that measures elapsed time between a starting time and stopping
 * time, or until the present time.
 * 
 * @author Jiranan Patrathamakul
 * @version 1.0
 *
 */

public class StopWatch {
	/** Constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	/** time that the stopwatch was stopped in nanoseconds. */
	private long stopTime;
	/** Status of stopwatch, (run or not run) */
	private boolean running;

	public StopWatch() {
		this.startTime = 0;
		this.stopTime = 0;
		this.running = false;

	}

	/** Start the stopwatch in case it isn't running yet. */
	public void start() {
		if (this.running == false) {
			this.startTime = System.nanoTime();
			this.running = true;
		}
	}

	/** Stop the stopwatch in case it's running. */
	public void stop() {
		if (this.isRunning()) {
			this.stopTime = System.nanoTime();
			this.running = false;
		}
	}

	/**
	 * Compute the time that's running.
	 * 
	 * @return time from start to the current time when stopwatch's running and
	 *         time between start and stop when stopwatch is already stopped.
	 */
	public double getElapsed() {
		if (this.running) {
			return (System.nanoTime() - this.startTime) * NANOSECONDS;
		} else {
			return (this.stopTime - this.startTime) * NANOSECONDS;
		}

	}

	/**
	 * Check whether stopwatch is running or not
	 * 
	 * @return true if the stopwatch is running.
	 */
	public boolean isRunning() {
		if (this.running) {
			return true;
		} else
			return false;
	}
}
