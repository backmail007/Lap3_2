import javax.swing.*;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Login log = new Login();
        frame.setContentPane(log.getMain());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
