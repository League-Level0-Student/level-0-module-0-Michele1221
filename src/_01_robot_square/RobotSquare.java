package _01_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot freckles = new Robot ();

        // 3. Put the robot's pen down
freckles.penDown();

        // 6. Make the robot move as fast as possible
freckles.setSpeed(10);

        // 5. Do everything below here 4 times
int sides=0;
while (sides<70) {
	freckles.move(250);
	freckles.setRandomPenColor();
	freckles.turn(80);
	freckles.turn(65);
	sides++;
	
	
	
}
Robot Fred = new Robot ();
 sides=0;
while (sides<56) {
	Fred.setSpeed(10);
Fred.move(sides);
Fred.turn(45);
Fred.setRandomPenColor();

}
        //         2. Move your robot 200 pixels
freckles.move(200);

        //         4. Turn the robot 90 degrees to the right (90 degrees
   freckles.turn(90);
    } }