package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	public static final int INT_1 = -1;
	public static final int INT_12 = 12;



	private int[] NUMBERS = new int[INT_12];

	public int total = INT_1;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
			return total == INT_1;
		}

		public boolean isFull() {
				return total == 11;
			}

			protected int peekaboo() {
					if (callCheck())
						return INT_1;
					return NUMBERS[total];
				}

				public int countOut() {
						if (callCheck())
							return INT_1;
						return NUMBERS[total--];
					}

}
