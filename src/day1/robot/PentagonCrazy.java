package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		
Robot kennith = new Robot("mini");
kennith.moveTo(400, 400);
kennith.setSpeed(10);
kennith.penDown();
kennith.setPenColor(68, 238, 187);

Robot bri = new Robot("mini");
bri.moveTo(540, 290);
bri.setSpeed(10);
bri.penDown();
bri.setPenColor(68, 238, 187);

for (int i = 0; i < 200; i++) {
	
	
int steph = 5;
int death = 360/5;

	kennith.move(200);
	bri.move(i);	
	kennith.turn(death);
	bri.turn(death);
	kennith.turn(1);
	
	
	
	
	bri.turn(1);
}
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}