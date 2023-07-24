import javax.swing.*;
import java.awt.*;

public class Window {
    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Window window = new Window();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        new MouseMover().run();
    }

    public Window() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setResizable(false);
        frame.setTitle("Jerry");
        frame.setBounds(100, 100, 325, 124);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lbl = new JLabel("Move Jerry");
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(lbl, BorderLayout.CENTER);
    }
}
