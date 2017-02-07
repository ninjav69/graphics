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
}
