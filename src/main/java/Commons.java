import java.awt.*;
import java.awt.event.InputEvent;

public class Commons {

  public static void click(Robot robot) {
    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
  }
}
