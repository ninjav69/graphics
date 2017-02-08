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

	public Vector multiplyBy(float scalar) {
		Vector v = new Vector(0, 0);
		v.x = this.x * scalar;
		v.y = this.y * scalar;
		return v;
	}

	public Vector divideBy(float scalar) {
		Vector v = new Vector(0, 0);
		v.x = this.x / scalar;
		v.y = this.y / scalar;
		return v;
	}

	public Vector add(Vector arg) {
		Vector v = new Vector(this.x, this.y);
		v.x += arg.x;
		v.y += arg.y;
		return v;
	}

	public Vector subtract(Vector arg) {
		Vector v = new Vector(this.x, this.y);
		v.x -= arg.x;
		v.y -= arg.y;
		return v;
	}

	public Vector normalized() {
		Vector v;
		v = this.divideBy((float)this.length());
		return v;
	}
}
