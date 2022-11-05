package org.firstinspires.ftc.teamcode.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.wrappers.JoystickWrapper;
//lol
@TeleOp
public class ColorDetection extends LinearOpMode {
    DcMotor Motor1;
    JoystickWrapper joystickWrapper;
    @Override
    public void runOpMode() throws InterruptedException {
        Motor1 = hardwareMap.get(DcMotor.class,"bottomMotor");
        joystickWrapper = new JoystickWrapper(gamepad1, gamepad2);
        waitForStart();


        while (!isStopRequested()) {
            System.out.println(joystickWrapper.gamepad1GetLeftStickX());
            Motor1.setPower(joystickWrapper.gamepad1GetLeftStickX());
        }
        Motor1.setPower(0);
    }
}
