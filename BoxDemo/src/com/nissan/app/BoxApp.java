package com.nissan.app;

import com.nissan.beam.Box;

public class BoxApp {

	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box();
		b1.width=2;
		b1.height=4;
		b1.depth=6;
		b2.width=5;
		b2.height=2;
		b2.depth=3;
		int x=b1.volume();
		System.out.println("Volume of first box="+x);
		int y=b2.volume();
		System.out.println("Volume of first box="+y);
		

	}

}
