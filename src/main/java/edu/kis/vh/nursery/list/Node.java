package edu.kis.vh.nursery.list;

public class Node {

	final private int value;
	public Node prev, next;

	public Node(int i) {
		value = i;
	}

	public int getValue(){
			return value;
	}
	
}
