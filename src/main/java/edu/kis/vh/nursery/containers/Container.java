package edu.kis.vh.nursery.containers;

public interface Container {
    public int pop();

    public void push(int value);

    public int peekaboo();

    public int size();

    public boolean isEmpty();

    public boolean isFull();
}
