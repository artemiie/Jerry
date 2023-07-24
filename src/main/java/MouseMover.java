

import java.awt.*;

public class MouseMover implements Runnable {
    @Override
    public void run() {
        try {
            boolean isMoved=true;
            while (true) {
                Point mousePoint = MouseInfo.getPointerInfo().getLocation();
                Robot robot = new Robot();
                if(isMoved){
                    robot.mouseMove(mousePoint.x+ 5, mousePoint.y - 5);
                    isMoved=false;
                }else {
                    robot.mouseMove(mousePoint.x - 5, mousePoint.y + 5);
                    isMoved=true;
                }
                Thread.sleep(2000);
            }
        } catch (AWTException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
