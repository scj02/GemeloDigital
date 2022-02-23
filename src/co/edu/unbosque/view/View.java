package co.edu.unbosque.view;

import javax.swing.*;

public class View extends JFrame {

    public View() {


        }

        public String pedirString (String mensaje){
            return (JOptionPane.showInputDialog(null, mensaje));

        }

        public int pedirEntero (String mensaje){
            String dato = JOptionPane.showInputDialog(null, mensaje);
            return (Integer.parseInt(dato));
        }

        public String mostrarensaje (String mensaje){
            JOptionPane.showMessageDialog(null, mensaje);

            return mensaje;
// xd
        }
    }

