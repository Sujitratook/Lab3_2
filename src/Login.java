import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField txtUserlogin;
    private JPasswordField pwdUser;
    private JButton btnsubmit;
    private JButton btnclear;
    private JPanel mainPanel;

    public Login() {
        btnsubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, txtUserlogin.getText()
                        +" "+ new String(pwdUser.getPassword()));
            }
        });
        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUserlogin.setText("");
                pwdUser.setText("");
            }
        });
    }
    public JPanel getMainPanel(){
        return mainPanel;
    }
}
