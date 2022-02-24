package co.edu.unbosque.view;

import javax.swing.*;

/**
 * The type View.
 */
public class View extends JFrame {

    /**
     * Instantiates a new View.
     */
    public View() {


        }

    /**
     * Pedir string string.
     *
     * @param mensaje the mensaje
     * @return the string
     */
    public String pedirString (String mensaje){
            return (JOptionPane.showInputDialog(null, mensaje));

        }

    /**
     * Pedir entero int.
     *
     * @param mensaje the mensaje
     * @return the int
     */
    public int pedirEntero (String mensaje){
            String dato = JOptionPane.showInputDialog(null, mensaje);
            return (Integer.parseInt(dato));
        }

    /**
     * Mostrarensaje string.
     *
     * @param mensaje the mensaje
     * @return the string
     */
    public String mostrarensaje (String mensaje){
            JOptionPane.showMessageDialog(null, mensaje);

            return mensaje;
// xd
        }
    }

