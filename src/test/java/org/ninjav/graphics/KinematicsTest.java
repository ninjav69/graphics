package org.ninjav.graphics;

import org.junit.Test;

/**
 * Created by ninjav on 2/7/17.
 */
public class KinematicsTest {
    @Test
    public void nothing() {
        Point shoulder = new Point(0, 0);
        double shoulderAngle = -45.0d;
        double elbowAngle = 0.0d;
        double distance = 1.0d;

        Point elbow = pointPositionFrom(shoulder, shoulderAngle, distance);
        Point wrist = pointPositionFrom(elbow, elbowAngle, distance);
        log("Elbow", elbow);
        log("Wrist", wrist);
    }

    private Point pointPositionFrom(Point origin, double angle, double distance) {
        Point result = new Point(0, 0);
        double radians = Math.toRadians(angle);
        result.x = origin.x + (float) (Math.cos(radians) * distance);
        result.y = origin.y + (float) (Math.sin(radians) * distance);
        return result;
    }

    private void log(String label, Point p) {
        System.out.println(label + ": (" + p.x + "," + p.y + ")");
    }
}
