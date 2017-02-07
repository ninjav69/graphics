package org.ninjav.graphics;

public class Vector {

	public float x;
	public float y;

	public Vector(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public double length() {
		return Math.sqrt(Math.pow(x, x) + Math.pow(y, y));
	}
}