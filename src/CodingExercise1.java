import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
   	 // 3. ask the user what color they would like the Robot to draw
Robot rob=new Robot();
String ans= JOptionPane.showInputDialog("What color would you like the robot to draw? black or orange?");

   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
if(ans.equals("black")) {
	rob.setPenColor(Color.BLACK);	
}
if(ans.equals("orange")) {
rob.setPenColor(Color.ORANGE);
}

   	 // 2. set the pen width to 10
rob.setPenWidth(10);
   	 // 1. make the Robot draw a shape
rob.penDown();
rob.setSpeed(100);
rob.move(200);
rob.turn(90);
rob.move(200);
rob.turn(90);
rob.move(200);
rob.turn(90);
rob.move(200);






    }

}
