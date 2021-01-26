package edu.kis.vh.nursery;

public class IntArrayStack {
    public static final int DEFAULT_VALUE = -1;
    public static final int MAX_SIZE = 12;
    public static final int EMPTY_RHYMER_INDICATOR = -1;

    final private int[] numbers = new int[MAX_SIZE];
    public int CURRENT_TOTAL_NUMBERS = EMPTY_RHYMER_INDICATOR;

    // TODO: lack of comments on anything, add comments

    public void countIn(final int in) {
        if (!isFull())
            numbers[++CURRENT_TOTAL_NUMBERS] = in;
    }

    public boolean callCheck() {
        return CURRENT_TOTAL_NUMBERS == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return CURRENT_TOTAL_NUMBERS == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[CURRENT_TOTAL_NUMBERS];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[CURRENT_TOTAL_NUMBERS--];
    }
}
