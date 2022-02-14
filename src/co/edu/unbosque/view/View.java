package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {

    public static void main(String[] args) {

    }

    public View() {


        }

        public String pedirString (String mensaje){
            return (JOptionPane.showInputDialog(null, mensaje));

        }

        public int pedirEntero (String mensaje){
            String dato = JOptionPane.showInputDialog(null, mensaje);
            int numero = Integer.parseInt(dato);
            return (numero);
        }

        public String mostrarensaje (String mensaje){
            JOptionPane.showMessageDialog(null, mensaje);

            return mensaje;

        }
    }

