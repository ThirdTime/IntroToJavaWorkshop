package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
//This robot is a disappointment just like me
		
	Robot birb = new Robot();
	Robot bean = new Robot();

	birb.setSpeed(10);
	bean.setSpeed(10);
	
	//prepare for trouble
		birb.clear();
		birb.moveTo(400, 400);
		birb.setPenColor(17, 100, 204);
		birb.penDown();
		birb.move(-200);
		//and make it double
		bean.clear();
		bean.moveTo(600, 600);
		bean.setPenColor(17, 100, 204);
		bean.penDown();
		bean.move(200);
		//whoa we're halfway there
		birb.turn(90);
		birb.move(200);
		//whoa LIVIN ON A PRAYER
		bean.turn(270);
		bean.move(200);
		
		birb.turn(270);
		birb.move(100);
		
		
	}
}

