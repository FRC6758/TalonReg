/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.GrabbyThing;

/**
 * Add your docs here.
 */
public class Grabber extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private Solenoid grabber = new Solenoid(0);
  private Solenoid ballKicker = new Solenoid(1);
  private Solenoid hatchKicker = new Solenoid(2);

  Compressor compressor = new Compressor();

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new GrabbyThing());
  }

  public void hatchDispense(){
    hatchKicker.set(true);
  }

  public void ballDispense(){
    ballKicker.set(true);
  }

  public void grab(){
    grabber.set(true);
  }
}
