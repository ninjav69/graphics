package org.ninjav.graphics;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class PointTest {
	@Test
	public void canAddVector() {
		Point p = new Point(1, 1);

		p.addVector(new Vector(1, 1));

		assertThat(p.x, is(equalTo(2f)));
		assertThat(p.y, is(equalTo(2f)));
	}

	@Test
	public void canSubtractPoint() {
		Point p1 = new Point(1, 1);
		Point p2 = new Point(2, 2);

		Vector v = p1.subtract(p2);

		assertThat(v.x, is(equalTo(-1f)));
		assertThat(v.y, is(equalTo(-1f)));
	}
}
