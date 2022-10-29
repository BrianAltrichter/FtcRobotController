package org.firstinspires.ftc.teamcode.testopmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class ColorDetection extends LinearOpMode {
    DcMotor Motor1;

    @Override
    public void runOpMode() throws InterruptedException {
        Motor1 = hardwareMap.get(DcMotor.class,"Motor1");
        Motor1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        waitForStart();
        Motor1.setPower(1);
        //Motor1.setTargetPosition(500);
        sleep(1000);
        Motor1.setPower(0);
    }
}
