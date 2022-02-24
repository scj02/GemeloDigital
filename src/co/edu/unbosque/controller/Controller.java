package co.edu.unbosque.controller;

import co.edu.unbosque.model.Model;
import co.edu.unbosque.model.Register;
import co.edu.unbosque.view.View;

public class Controller {

    private View v;
    private Model m;


    public Controller() {
        v = new View();
        m = new Model();
        funcionar();
    }

    public void funcionar() {
        m.uploadData();

        for (Register register : m.getArray()) {
            System.out.println(register);
        }

        System.out.println(m.findByInvoiceNo("533677"));

        System.out.println(m.sumTotalSales());

        String searchedNumbers;
        do {
            String b = v.pedirString("Ingrese el archivo que desea buscar: ");
            searchedNumbers = m.findByInvoiceNo(b);
        }
        while (searchedNumbers.length() == 0);
        System.out.println(searchedNumbers);

        System.out.println(m.avgMonthlySales(true));

        System.out.println(m.countByStockCode("22623"));

    }
}


