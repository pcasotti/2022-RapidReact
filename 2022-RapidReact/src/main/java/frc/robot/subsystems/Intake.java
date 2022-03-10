// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {

  private VictorSPX motor;
  private boolean isInverted = true;

  public Intake() {
    motor = new VictorSPX(Constants.Intake.MOTOR_ID);
  }

  public void periodic() {}

  public void grabBalls(double speed) {
    motor.set(ControlMode.PercentOutput, speed);
  }

  public void stop() {
    motor.set(ControlMode.PercentOutput, 0);
  }

  public boolean isInverted() {
    return isInverted;
  }
  
  public void setInverted(boolean isInverted) {
    this.isInverted = isInverted;
  }
  
  public void invert() {
    isInverted = !isInverted;
  }
}
