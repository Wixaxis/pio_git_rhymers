package edu.kis.vh.nursery;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

//TODO: many unused imports

class RhymersDemo {

	public static final int INT_15 = 15;

	public static void main(String[] args) {
		Rhymersfactory factory = new DefaultRhymersFactory();

		testRhymers(factory);

	}

	private static void testRhymers(Rhymersfactory factory) {
		DefaultCountingOutRhymer[] rhymers = { factory.GetStandardRhymer(), factory.GetFalseRhymer(),
				factory.GetFIFORhymer(), factory.GetHanoiRhymer() };

		for (int i = 1; i < INT_15; i++)
			for (int j = 0; j < 3; j++)
				rhymers[j].countIn(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < INT_15; i++)
			rhymers[3].countIn(rn.nextInt(20));

		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((HanoiRhymer) rhymers[3]).reportRejected());
	}

}