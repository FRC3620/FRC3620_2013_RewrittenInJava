/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc3620.FRC36202013Doug1;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author wegscd
 */
public class FRC3620SubsystemHelper {
    private static FRC3620SubsystemHelper instance;

    /**
     * Returns the {@link Scheduler}, creating it if one does not exist.
     *
     * @return the {@link Scheduler}
     */
    public synchronized static FRC3620SubsystemHelper getInstance() {
        return instance == null ? instance = new FRC3620SubsystemHelper() : instance;
    }
    /**
     * The {@link Set} of all {@link Subsystem Subsystems}
     */
    private Set subsystems = new Set();
    
    public static void registerFRC3620SubsystemHelper(FRC3620Subsystem frc3620Subsystem) {
       getInstance().subsystems.add(frc3620Subsystem);
    }
    
    public static void onRobotModeTransition (RobotMode robotMode) {
        getInstance()._onRobotModeTransition(robotMode);
    }
    
    void _onRobotModeTransition (RobotMode robotMode) {
        for (Enumeration e = subsystems.getElements(); e.hasMoreElements(); ) {
            FRC3620Subsystem ss = (FRC3620Subsystem) e.nextElement();
            ss.onRobotModeTransition(robotMode);
        }
    }
    
    public static void periodic (RobotMode robotMode) {
        getInstance()._periodic(robotMode);
    }
    
    void _periodic (RobotMode robotMode) {
        for (Enumeration e = subsystems.getElements(); e.hasMoreElements(); ) {
            FRC3620Subsystem ss = (FRC3620Subsystem) e.nextElement();
            ss.periodic(robotMode);
        }
    }
    
    class Set {
    Vector set = new Vector();

    public Set() {
    }

    public void add(Object o){
        if(set.contains(o)) return;
        set.addElement(o);
    }

    public boolean contains(Object o) {
        return set.contains(o);
    }

    public Enumeration getElements(){
        return set.elements();
    }
}

}
