package edu.kis.vh.nursery;

import edu.kis.vh.nursery.containers.Container;
import edu.kis.vh.nursery.containers.IntArrayStack;
import edu.kis.vh.nursery.containers.IntLinkedList;

public class DefaultCountingOutRhymer {

	// private Container container = new IntArrayStack();
	private Container container = new IntLinkedList();

	public DefaultCountingOutRhymer(){}

	public void countIn(final int in) {
		container.push(in);
	}

	public boolean callCheck() {
		return container.isEmpty();
	}

	public boolean isFull() {
		return container.isFull();
	}

	protected int peekaboo() {
		return container.peekaboo();
	}

	public int countOut() {
		return container.pop();
	}

	public DefaultCountingOutRhymer(IntArrayStack intArrayStack){
		this.container = intArrayStack;
	}

}
