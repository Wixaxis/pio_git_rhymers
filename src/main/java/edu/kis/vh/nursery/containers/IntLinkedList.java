package edu.kis.vh.nursery.containers;

public class IntLinkedList implements Container {

	public static final int DEFAULT_VALUE = -1;
	Node last;
	int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int peekaboo() {
		if (isEmpty())
			return DEFAULT_VALUE;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return DEFAULT_VALUE;
		int ret = last.getValue();
		last = last.prev;
		return ret;
	}

	@Override
	public int size() {
		int size = 0;
		Node current = last;
		while (true) {
			if (current.prev == null)
				break;
			current = current.prev;
		}
		while (true) {
			if (current.next == null)
				break;
			current = current.next;
			size++;
		}
		return size;
	}

}
