package com.nissan.beam;

public class Box {
public int width;
public int height;
public int depth;
int volume;

public Box() {
	
}

public int volume()
{
	volume=width*height*depth;
	return volume;
}
}
