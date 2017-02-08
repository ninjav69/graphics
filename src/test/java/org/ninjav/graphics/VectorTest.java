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

	@Test
	public void canNormalize() {
		Point i = new Point(3, 4);
		Point p = new Point(1, 2);

		Vector v = i.subtract(p);
		Vector n = v.normalized();

		assertThat((double)n.x, is(closeTo(0.7d, 0.1d)));
		assertThat((double)n.y, is(closeTo(0.7d, 0.1d)));
	}

	@Test
	public void canAdd() {
		Vector d = new Vector(0, 4);
		Vector r = new Vector(4, 0);

		Vector v = d.add(r);

		assertThat(v.x, is(equalTo(4f)));
		assertThat(v.y, is(equalTo(4f)));
	}

	@Test
	public void canSubtract() {
		Vector i = new Vector(1, 1);
		Vector j = new Vector(1, 1);

		Vector v = j.subtract(i);

		assertThat(v.x, is(equalTo(0f)));
		assertThat(v.y, is(equalTo(0f)));
	}
}
