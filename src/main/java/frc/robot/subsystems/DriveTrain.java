/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.analog.adis16470.frc.ADIS16470_IMU;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.commands.Drive;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private WPI_TalonSRX talon0 = new WPI_TalonSRX(0);
  private WPI_TalonSRX talon1 = new WPI_TalonSRX(1);
  private WPI_TalonSRX talon2 = new WPI_TalonSRX(2);
  private WPI_TalonSRX talon3 = new WPI_TalonSRX(3);

  private SpeedControllerGroup left = new SpeedControllerGroup(talon0, talon1);
  private SpeedControllerGroup right = new SpeedControllerGroup(talon2, talon3);

  public DifferentialDrive driveThingy = new DifferentialDrive(left, right);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new Drive());
  }

  public void stop(){
    driveThingy.stopMotor();
  }

  // public double getAngle(){
  //   return imu.getAngle();
  // }
}
