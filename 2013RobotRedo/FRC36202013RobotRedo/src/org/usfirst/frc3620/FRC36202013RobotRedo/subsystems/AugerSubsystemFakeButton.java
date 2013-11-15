/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc3620.FRC36202013RobotRedo.subsystems;

import edu.wpi.first.wpilibj.buttons.InternalButton;
import org.usfirst.frc3620.FRC36202013RobotRedo.Robot;
import org.usfirst.frc3620.FRC36202013RobotRedo.RobotMap;

/**
 *
 * @author RCB
 */
public class AugerSubsystemFakeButton extends InternalButton{

    public boolean get() {
        return Robot.augerSubsystem.readAugerLimitSwitch();
    }
    
    
}
