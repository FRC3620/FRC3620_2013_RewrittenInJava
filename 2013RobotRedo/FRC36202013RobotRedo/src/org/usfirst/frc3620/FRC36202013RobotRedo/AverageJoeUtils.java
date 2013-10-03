/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc3620.FRC36202013RobotRedo;

import edu.wpi.first.wpilibj.Relay;

/**
 *
 * @author wegscd
 */
public class AverageJoeUtils {

    public static void commandStarted(Object o) {
        System.out.println(o.getClass() + " started");
    }

    public static void commandEnded(Object o) {
        System.out.println(o.getClass() + " ended");
    }

    public static String relayValueString(Relay.Value v) {
        if (v == Relay.Value.kOff) {
            return "off";
        } else if (v == Relay.Value.kForward) {
            return "forward";
        } else if (v == Relay.Value.kReverse) {
            return "reverse";
        } else if (v == Relay.Value.kOn) {
            return "on";
        } else {
            return "?";
        }
    }
    
}
