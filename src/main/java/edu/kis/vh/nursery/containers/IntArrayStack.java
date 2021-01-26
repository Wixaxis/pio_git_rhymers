package edu.kis.vh.nursery.containers;

public class IntArrayStack implements Container {
    public static final int DEFAULT_VALUE = -1;
    public static final int MAX_SIZE = 12;
    public static final int EMPTY_RHYMER_INDICATOR = -1;

    final private int[] numbers = new int[MAX_SIZE];
    public int CURRENT_TOTAL_NUMBERS = EMPTY_RHYMER_INDICATOR;

    @Override
    public void push(final int in) {
        if (!isFull())
            numbers[++CURRENT_TOTAL_NUMBERS] = in;
    }

    @Override
    public boolean isEmpty() {
        return CURRENT_TOTAL_NUMBERS == EMPTY_RHYMER_INDICATOR;
    }

    @Override
    public boolean isFull() {
        return CURRENT_TOTAL_NUMBERS == 11;
    }

    public int peekaboo() {
        if (isEmpty())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[CURRENT_TOTAL_NUMBERS];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[CURRENT_TOTAL_NUMBERS--];
    }

    @Override
    public int size() {
        return CURRENT_TOTAL_NUMBERS + 1;
    }
}
