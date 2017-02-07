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

	public double lengthSqr() {
		return Math.pow(x, x) + Math.pow(y, y);
	}

	public Vector multiplyBy(int scalar) {
		Vector v = new Vector(0, 0);
		v.x = this.x * scalar;
		v.y = this.y * scalar;
		return v;
	}

	public Vector divideBy(int scalar) {
		Vector v = new Vector(0, 0);
		v.x = this.x / scalar;
		v.y = this.y / scalar;
		return v;
	}
}
