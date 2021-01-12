package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	public static final int DEFAULT_VALUE = -1;
	public static final int MAX = 12;
	public static final int EMPTY_RHYMER_INDICATOR = -1;


	final private int[] NUMBERS = new int[INT_12];

	public int total = EMPTY_RHYMER_INDICATOR;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
			return total == INT_1;
		}

		public boolean isFull() {
				return total == MAX-1;
			}

			protected int peekaboo() {
					if (callCheck())
						return DEFAULT_VALUE;
					return NUMBERS[total];
				}

				public int countOut() {
						if (callCheck())
							return DEFAULT_VALUE;
						return NUMBERS[total--];
					}

}
