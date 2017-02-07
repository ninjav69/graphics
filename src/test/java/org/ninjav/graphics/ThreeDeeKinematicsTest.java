package org.ninjav.graphics;

import org.junit.Test;

/**
 * Created by ninjav on 2/7/17.
 */
public class ThreeDeeKinematicsTest {

    @Test
    public void nothing() {
        ThreePoint origin = new ThreePoint();
        origin.x = 0;
        origin.y = 0;
        origin.z = 0;

        ThreeDir direction = new ThreeDir();
        direction.pitch = 0;
        direction.yaw = 0;
        direction.roll = 45;

        double distance = 1;

        ThreePoint target = threePointFrom(origin, direction, distance);

        System.out.println("Target: (" + target.x + "," + target.y + "," + target.z + ")");
    }

    private ThreePoint threePointFrom(ThreePoint origin, ThreeDir direction, double distance) {
        ThreePoint result = new ThreePoint();
        result.x = origin.x + distance * Math.cos(Math.toRadians(direction.yaw)) * Math.cos(Math.toRadians(direction.pitch));
        result.y = origin.y + distance * Math.sin(Math.toRadians(direction.pitch));
        result.z = origin.z + distance * Math.sin(Math.toRadians(direction.yaw) * Math.cos(Math.toRadians(direction.pitch)));
        return result;
    }
}
