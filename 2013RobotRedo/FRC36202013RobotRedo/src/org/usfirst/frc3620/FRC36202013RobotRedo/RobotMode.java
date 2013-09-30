/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc3620.FRC36202013RobotRedo;

/**
 *
 * @author wegscd
 */
public class RobotMode {
   private String name;
   public RobotMode (String n) {
       name = n;
   } 
   public String toString() {
       return name;
   }
   public static final RobotMode DISABLED = new RobotMode("DISABLED");
   public static final RobotMode AUTONOMOUS = new RobotMode("AUTONOMOUS");
   public static final RobotMode TELEOP = new RobotMode("TELEOP");
   public static final RobotMode TEST = new RobotMode("TEST");
   
}
