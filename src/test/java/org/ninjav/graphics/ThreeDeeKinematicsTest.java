package org.ninjav.graphics;

import org.junit.Test;

/**
 * Created by ninjav on 2/7/17.
 */
public class ThreeDeeKinematicsTest {

    @Test
    public void canFindEndEffector() {
        ThreePoint origin = new ThreePoint();
        origin.x = 0;
        origin.y = 0;
        origin.z = 0;

        ThreeOrientation orientation = new ThreeOrientation();
        orientation.pitch = 90;
        orientation.yaw = 0;
        orientation.roll = 0;

        double distance = 1;

        ThreePoint elbow = threePointFrom(origin, orientation, distance);
        System.out.println("Target: (" + elbow.x + "," + elbow.y + "," + elbow.z + ")");

        ThreePoint wrist = threePointFrom(elbow, orientation, distance);
        System.out.println("Target: (" + wrist.x + "," + wrist.y + "," + wrist.z + ")");

    }

    private ThreePoint threePointFrom(ThreePoint origin, ThreeOrientation orientation, double distance) {
        ThreePoint result = new ThreePoint();
        double yawRad = Math.toRadians(orientation.yaw);
        double pitchRad = Math.toRadians(orientation.pitch);
        result.x = origin.x + distance * Math.cos(yawRad) * Math.cos(pitchRad);
        result.y = origin.y + distance * Math.sin(pitchRad);
        result.z = origin.z + distance * Math.sin(yawRad) * Math.cos(pitchRad);

        return result;
    }
}
