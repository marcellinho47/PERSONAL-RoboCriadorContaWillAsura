import java.awt.*;

public class CreateAccount {

  public static void main(String[] args) {
    try {

      Robot robot = new Robot();

      // robot.mouseMove(280, 450);

      go(robot);

    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  private static void go(Robot robot) {

    final int x = 279;

    // Quick start
    robot.mouseMove(x + 200, 450);
    Commons.click(robot);

    robot.delay(1000);

    // allow
    robot.mouseMove(x + 385, 450);
    Commons.click(robot);

    robot.delay(1000);

    // skip
    for (int i = 0; i < 8; i++) {
      Commons.click(robot);
      robot.delay(500);
    }

    // submit
    robot.delay(2000);
    robot.mouseMove(x + 300, 480);
    Commons.click(robot);

    // skip
    Commons.click(robot);

    // summon
    robot.mouseMove(x + 285, 545);

    // free sumon
    robot.mouseMove(x + 150, 600);
    robot.delay(6000);

    // out
    robot.mouseMove(x + 240, 750);
    Commons.click(robot);
    robot.delay(6000);

    // ok
    robot.mouseMove(x + 350, 610);
    Commons.click(robot);
  }
}
