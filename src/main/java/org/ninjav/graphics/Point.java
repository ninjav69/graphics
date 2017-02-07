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

	public Vector subtract(Point from) {
		Vector v = new Vector(0f, 0f);

		v.x = this.x - from.x;
		v.y = this.y - from.y;

		return v;
	}
}
