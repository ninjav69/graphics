package org.ninjav.graphics;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class VectorTest {

	@Test
	public void canGetLength() {
		Vector v = new Vector(1, 1);

		double length = v.length();

		assertThat(length, closeTo(1.414d, 0.001d));
	}
}
