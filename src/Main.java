
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {

        Home pHome = new Home();
        // crea Jframe
        JFrame frame = new JFrame("autoPlaz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 700);

        // Home

        // crea el Jpanel
        JPanel panel = new JPanel();

        // declara los input
        JTextField inputEmail = new JTextField(15);
        JTextField inputPasw = new JTextField(15);

        // boton de login
        JButton button = new JButton("Login");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pHome.PanelHome();
            }
        });

        // se agrega y se hace visible la ventana
        panel.add(new JLabel("email: "));
        panel.add(inputEmail);
        panel.add(new JLabel("password: "));
        panel.add(inputPasw);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}