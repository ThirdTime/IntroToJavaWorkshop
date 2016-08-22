package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class DrawASquare {
public static void main(String[] args) {
	
	Robot bean = new Robot("batman");
Robot birb = new Robot("batman");
birb.setSpeed(15);
birb.moveTo(500, 450);
birb.penDown();
birb.setPenColor(255, 255, 50);

bean.setSpeed(15);
bean.moveTo(500, 450);
bean.penDown();
bean.setPenColor(255, 255, 50);

	for (int i = 0; i < 360; i++) {
		birb.move(5);
		birb.turn(1);
		
		
	}
	
}
}
