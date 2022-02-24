package co.edu.unbosque.model;


import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * The type Model.
 */
public class Model {
    private ArrayList<Register> array = new ArrayList<>();
    private final File f = new File("src/data.csv");


    /**
     * Instantiates a new Model.
     */
    public Model() {
        this.array = array;
    }

    /**
     * Upload data.
     */
    public void uploadData() {

        String[] line;

        try {

            CSVReader reader = new CSVReader(new FileReader(f));

            line = reader.readNext();

            while (line != null) {

                array.add(new Register(line[0], line[1], line[2], line[3], line[4], line[5], line[6], line[7]));
                line = reader.readNext();
            }
            array.remove(0);
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    /**
     * Sum total sales float.
     *
     * @return the float
     */
    public float sumTotalSales() {
        float total = 0;

        for (int i = 0; i < array.size(); i++) {
            Register aux = array.get(i);
            float x = Float.parseFloat(aux.getQty());
            float y = Float.parseFloat(aux.getUnitPrice());

            float mul = x * y;

            total += mul;
        }

        return total;
    }

    /**
     * Find by invoice no string.
     *
     * @param invoiceNo the invoice no
     * @return the string
     */
    public String findByInvoiceNo(String invoiceNo) {
        String items = "";
        for (int i = 0; i < array.size(); i++) {
            Register aux = array.get(i);
            if (aux.getInvoiceNo().equals(invoiceNo)) {

                items += aux + "\n";
            }
        }

        return items;
    }

    /**
     * Count by stock code int.
     *
     * @param stockCode the stock code
     * @return the int
     */
    public int countByStockCode(String stockCode) {

        int counter = 0;

        for (int i = 0; i < array.size(); i++) {
            Register aux = array.get(i);
            if (aux.getStockCode().equalsIgnoreCase(stockCode)) {
                counter += Integer.parseInt(aux.getQty());
            }
        }

        return counter;
    }

    /**
     * Avg monthly sales string.
     *
     * @param groupByCountry the group by country
     * @return the string
     */
    public String avgMonthlySales(boolean groupByCountry) {

        ArrayList<String> country = new ArrayList();
        country.add("");
        ArrayList<Float> totalByCountry = new ArrayList<Float>();
        totalByCountry.add((float) 0);
        int j = 1;
        int in = 0;

        if (!groupByCountry) {
            float total = sumTotalSales();
            float avg = total / 12;
            return "Promedio mensual: " + avg;

        } else {
            for (int i = 0; i < array.size(); i++) {
                Register aux = array.get(i);
                int index = country.indexOf(aux.getCountry());
                if (index == -1) {
                    country.add(index + j, aux.getCountry());
                    j++;
                }
            }
            for (int i = 0; i < array.size(); i++) {
                Register aux = array.get(i);
                int index = country.indexOf(aux.getCountry());

                float x = Float.parseFloat(aux.getQty());
                float y = Float.parseFloat(aux.getUnitPrice());

                float mul = x * y;
                if (index <= in) {
                    float total = totalByCountry.get(index) + mul;
                    totalByCountry.remove(index);
                    totalByCountry.add(index, total);
                } else {
                    in++;
                    float total = mul;
                    totalByCountry.add(index, total);
                }

            }

            float total = sumTotalSales();
            float average = total / 12;
            String out = "Average Monthly Sales: " + String.valueOf(average) + "\n";

            for (int i = 0; i < totalByCountry.size(); i++) {
                float avg = totalByCountry.get(i) / 12;
                totalByCountry.remove(i);
                totalByCountry.add(i, avg);

                out += country.get(i) + ": " + totalByCountry.get(i) + "\n";
            }


            return out;
        }

    }

    /**
     * Find partially by description string.
     *
     * @param search   the search
     * @param order    the order
     * @param intMonth the int month
     * @param endMonth the end month
     * @return the string
     */
    public String findPartiallyByDescription(String search, boolean order, int intMonth, int endMonth) {

        if (order == false) {
            for (int i = 0; i < array.size(); i++) {
                Register aux = array.get(i);
                String invoiceDate = aux.getDate().split("/", 2)[0];
                if (aux.getDescription().contains(search)) {
                    if (Integer.parseInt(invoiceDate) >= intMonth && Integer.parseInt(invoiceDate) <= endMonth) {
                        System.out.println(aux.getDescription() + ": " + aux.getQty());
                    }
                }
            }
        } else if (order) {
            Collections.sort(array, new Comparator<Register>() {
                @Override
                public int compare(Register o1, Register o2) {
                    return new Integer(Integer.parseInt(o2.getQty())).compareTo(new Integer(Integer.parseInt(o1.getQty())));
                }
            });

            for (int i = 0; i < array.size(); i++) {
                Register aux = array.get(i);
                String invoiceDate = aux.getDate().split("/", 2)[0];
                if (aux.getDescription().contains(search)) {
                    if (Integer.parseInt(invoiceDate) >= intMonth && Integer.parseInt(invoiceDate) <= endMonth) {
                        System.out.println(aux.getDescription() + ": " + aux.getQty());
                    }
                }
            }
        }


        return "";
    }

    /**
     * Gets array.
     *
     * @return the array
     */
    public ArrayList<Register> getArray() {
        return array;
    }

    /**
     * Sets array.
     *
     * @param array the array
     */
    public void setArray(ArrayList<Register> array) {
        this.array = array;
    }

    /**
     * Gets f.
     *
     * @return the f
     */
    public File getF() {
        return f;
    }
}
