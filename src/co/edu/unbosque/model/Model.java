package co.edu.unbosque.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Model {
    private ArrayList<String[]> array = new ArrayList<>();
    private final File f = new File("src/data.csv");

    public Model(){
    }

    public void setCSV() {

        String line;

        try {

            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            line = br.readLine();

            while (line!=null){
                String[] aux = line.split(",");
                array.add(aux);
                line = br.readLine();
            }

            fr.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<String[]> getArray() {
        return array;
    }

    public void setArray(ArrayList<String[]> array) {
        this.array = array;
    }
}
