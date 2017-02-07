package org.ninjav.graphics;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class VectorTest {

	@Test
	public void canGetLength() {
		Vector v = new Vector(1, 1);

		double length = v.length();

		assertThat(length, closeTo(1.414d, 0.001d));
	}


	@Test
	public void canGetLengthSqr() {
		Vector v = new Vector(1, 1);

		double lengthSqr = v.lengthSqr();

		assertThat(lengthSqr, is(equalTo(2d)));
	}

	@Test
	public void canMultiplyByScalar() {
		Vector v = new Vector(1, 1);

		Vector r = v.multiplyBy(2);

		assertThat(r.x, is(equalTo(2f)));
		assertThat(r.y, is(equalTo(2f)));
	}

	@Test
	public void canDivideByScalar() {
		Vector v = new Vector(1, 1);

		Vector r = v.divideBy(2);

		assertThat(r.x, is(equalTo(0.5f)));
		assertThat(r.y, is(equalTo(0.5f)));
	}
}
