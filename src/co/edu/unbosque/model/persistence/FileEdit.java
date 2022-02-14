package co.edu.unbosque.model.persistence;

import java.io.*;


public class FileEdit {

    private String archivo = "data.csv";

    public String leerArchivo() {

        String linea = "";
//        String cadena = "";

        File f = new File(this.archivo);
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            linea = br.readLine();

/*            while(linea != null) {
              cadena += linea+"\n";
            linea = br.readLine();
      }
 */
            fr.close();
        }
        catch(IOException e) {
            return null;
        }
        return linea;
    }

}

