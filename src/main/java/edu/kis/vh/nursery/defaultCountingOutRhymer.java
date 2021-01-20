package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int DEFAULT_VALUE = -1;
	public static final int MAX = 12;
	public static final int EMPTY_RHYMER_INDICATOR = -1;


	final private int[] numbers = new int[MAX];
	public int total = EMPTY_RHYMER_INDICATOR;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == -1;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return -1;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}

}
