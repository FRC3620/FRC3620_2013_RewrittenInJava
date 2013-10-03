/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc3620.FRC36202013RobotRedo;

/**
 *
 * @author wegscd
 */
public class HarvesterDirection {
    public static HarvesterDirection IN = new HarvesterDirection("IN");
    public static HarvesterDirection OUT = new HarvesterDirection("OUT");
    public static HarvesterDirection OFF = new HarvesterDirection("OFF");
    
    public String toString() {
        return name;
    }
    
    private String name;
    private HarvesterDirection (String s) {
        name = s;
    }
}
