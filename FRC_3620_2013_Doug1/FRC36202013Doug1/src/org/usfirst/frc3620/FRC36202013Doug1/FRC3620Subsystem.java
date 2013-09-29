/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc3620.FRC36202013Doug1;

/**
 *
 * @author wegscd
 */
public interface FRC3620Subsystem {
    public void rememberToRegisterMe (FRC3620Subsystem me);
    public void onRobotModeTransition (RobotMode robotMode);
    public void periodic (RobotMode robotMode);
}
