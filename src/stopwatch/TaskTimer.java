package stopwatch;

public class TaskTimer {
	StopWatch timer = new StopWatch();

	public void measureAndPrint(Runnable runTask) {
		timer.start();
		runTask.run();
		timer.stop();
		System.out.print(runTask.toString());
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}

}
