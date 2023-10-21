import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home {

    public void PanelHome() {

        // crea Jframe
        JFrame frame = new JFrame("autoPlaz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 700);

        JPanel panel = new JPanel();

        //mantenimiento
        JButton btnMante = new JButton("mantenimiento");
        btnMante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar un mensaje cuando se hace clic en el botón
                JOptionPane.showMessageDialog(null, "¡Hola, mantenimiento!");
            }
        });

        //venta
        JButton btnVen = new JButton("venta");
        btnVen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar un mensaje cuando se hace clic en el botón
                JOptionPane.showMessageDialog(null, "¡Hola, venta!");
            }
        });

        //repuestos
        JButton btnRep = new JButton("repuestos");
        btnRep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar un mensaje cuando se hace clic en el botón
                JOptionPane.showMessageDialog(null, "¡Hola, repuestos!");
            }
        });

        //inventario
        JButton btnInv = new JButton("inventario");
        btnInv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar un mensaje cuando se hace clic en el botón
                JOptionPane.showMessageDialog(null, "¡Hola, inventario!");
            }
        });

        panel.add(btnMante);
        panel.add(btnVen);
        panel.add(btnRep);
        panel.add(btnInv);

        frame.add(panel);
        frame.setVisible(true);

    }
}
