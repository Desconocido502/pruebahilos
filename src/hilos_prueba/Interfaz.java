package hilos_prueba;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interfaz extends JFrame implements ActionListener {

    JLabel conejo = new JLabel("Conejo");
    JLabel tortuga = new JLabel("tortuga");
    JButton comenzar = new JButton("Comenzar");

    int posconejo = 20;
    int postortuga = 20;

    public Interfaz() {
        this.setLayout(null);
        this.setSize(950, 350);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        conejo.setBounds(posconejo, 100, 150, 50);
        tortuga.setBounds(postortuga, 200, 150, 50);
        comenzar.setBounds(10, 0, 100, 50);

        this.add(conejo);
        this.add(tortuga);
        this.add(comenzar);

        conejo.setVisible(true);
        tortuga.setVisible(true);
        comenzar.setVisible(true);

        comenzar.addActionListener(this);
    }

    public void MoverConejo() {
        posconejo += 30;
        conejo.setBounds(posconejo, 100, 150, 50);
    }

    public void MoverTortuga() {
        postortuga += 10;
        tortuga.setBounds(postortuga, 200, 150, 50);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == comenzar) {
            System.out.println("La carrera ha empezado");
            Carrera carrera = new Carrera(900, this);
        }
    }

}
