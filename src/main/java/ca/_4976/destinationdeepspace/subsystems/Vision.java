package ca._4976.destinationdeepspace.subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.command.Subsystem;
import ca._4976.destinationdeepspace.Robot;

public class Vision extends Subsystem {

    NetworkTable vision = NetworkTableInstance.getDefault().getTable("Vision");

    @Override
    protected void initDefaultCommand() {

    }
}
