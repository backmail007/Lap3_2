import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JPanel main;
    private JTextField username;
    private JPasswordField pass;
    private JButton Login;
    private JButton clear;

    public Login() {
        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,username.getText() +" "+ new String (pass.getPassword()));
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                username.setText("");
                pass.setText("");
            }
        });
    }

    public JPanel getMain() {
        return main;
    }
}
