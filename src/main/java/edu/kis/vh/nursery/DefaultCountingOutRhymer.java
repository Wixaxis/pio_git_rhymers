package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private IntArrayStack intArrayStack = new IntArrayStack();

	public DefaultCountingOutRhymer(){}

	public void countIn(final int in) {
		intArrayStack.countIn(in);
	}

	public boolean callCheck() {
		return intArrayStack.callCheck();
	}

	public boolean isFull() {
		return intArrayStack.isFull();
	}

	protected int peekaboo() {
		return intArrayStack.peekaboo();
	}

	public int countOut() {
		return intArrayStack.countOut();
	}

	public DefaultCountingOutRhymer(IntArrayStack intArrayStack){
		this.intArrayStack = intArrayStack;
	}

}
