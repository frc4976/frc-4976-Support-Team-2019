package ca._4976.destinationdeepspace.subsystems;

import ca._4976.destinationdeepspace.commands.DriveWithJoystick;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

import static com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput;

public class Drive extends Subsystem {
    
    NetworkTable drive = NetworkTableInstance.getDefault().getTable("Drive");
    
    @Override
    protected void initDefaultCommand() {
        setDefaultCommand();
    }
}
