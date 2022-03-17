// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.commandgroups;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.commands.ActivateConveyor;
import frc.robot.commands.GrabBalls;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.StorageSystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class IntakeAndConveyor extends ParallelCommandGroup {

  

  public IntakeAndConveyor(Intake intake, StorageSystem storageSystem, double speed){
    addCommands(
      new GrabBalls(intake, speed),
      new ActivateConveyor(storageSystem, speed)
    );
  }


}

