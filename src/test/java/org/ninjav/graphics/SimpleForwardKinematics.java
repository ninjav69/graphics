package org.ninjav.graphics;

import org.junit.Test;

public class SimpleForwardKinematics {
	@Test
	public void canFindEndEffector() {
		float distance = 1.0f;
		float angle = 90.0f;
		Point root = new Point(0, 0);

		Point one = from(root, angle, distance);
		System.out.println("P1: (" + one.x + "," + one.y + ")");

	}

	Point from(Point origin, float angle, float distance) {
		Point result = new Point(0,0);
		result.x = origin.x + (float)(Math.cos(angle)) * distance;
		result.y = origin.y + (float)(Math.sin(angle)) * distance;
		return result;
	}
}
