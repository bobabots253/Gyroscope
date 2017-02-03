package org.usfirst.frc253.gyroscope.commands;


import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class Command1 extends Command {
	public Gyro gyro1;
	//    AxisCamera camera;
    public Command1() {
    	gyro1 = new AnalogGyro(0);
//    	gyro1.setSensitivity(.0125);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	gyro1.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double gyroAngle = gyro1.getAngle();
     	System.out.println(gyroAngle);
 		SmartDashboard.putNumber("Gyroscope Angle", gyroAngle);
    }
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
