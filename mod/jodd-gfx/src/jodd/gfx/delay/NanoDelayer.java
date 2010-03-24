// Copyright (c) 2003-2010, Jodd Team (jodd.org). All Rights Reserved.

package jodd.gfx.delay;

/**
 * Delayer that uses <code>System.nanoTime</code> and <code>Thread.sleep</code>.
 */
public class NanoDelayer extends Delayer {

	@Override
	public void start() {
		start = System.nanoTime();
	}

	@Override
	public boolean end() {
		diff = (System.nanoTime() - start);
		return endAndWait();
	}

	@Override
	public void sleep(long nanoSeconds) {
		int delay = (int) (nanoSeconds / 1000000L);
		if (delay == 0) {
			delay = 1;
		}
		try {
			Thread.sleep(delay);
		} catch (InterruptedException iex) {
			// ignore
		}
	}

}
