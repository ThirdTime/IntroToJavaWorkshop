package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
Robot kiddo = new Robot("vic");
kiddo.hide();
kiddo.moveTo(700, 360);
kiddo.penDown();
kiddo.setSpeed(10);



for (int i = 0; i < 300; i++) {
	kiddo.turn(360/20);
	kiddo.setRandomPenColor();
	
kiddo.move(1*i);
kiddo.setPenWidth(i);

}

	}
}
