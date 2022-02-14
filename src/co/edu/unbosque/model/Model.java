package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.FileEdit;

import java.util.ArrayList;

public class Model {
    private ArrayList<String[]> array = new ArrayList<>();
    private FileEdit file = new FileEdit();

    public Model(){
    }

    public ArrayList<String[]> getArray() {
        return array;
    }

    public void setArray(ArrayList<String[]> array) {
        this.array = array;
    }

    public FileEdit getFile() {
        return file;
    }

    public void setFile(FileEdit file) {
        this.file = file;
    }
}
