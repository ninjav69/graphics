package org.ninjav.graphics;

public class Point {
	public float x;
	public float y;

	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public void addVector(Vector vector) {
		this.x += vector.x;
		this.y += vector.y;
	}
}
