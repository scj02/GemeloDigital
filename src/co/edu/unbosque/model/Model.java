package co.edu.unbosque.model;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

import com.opencsv.*;
import com.opencsv.exceptions.CsvValidationException;

public class Model {
    private ArrayList<String[]> array = new ArrayList<>();
    private final File f = new File("src/data.csv");


    public Model(){
    }

    public void uploadData() {

        String[] line;

        try {

            CSVReader reader = new CSVReader(new FileReader(f));

            line = reader.readNext();

            while (line!=null){
                array.add(line);
                line = reader.readNext();
            }
            reader.close();
        }
        catch (CsvValidationException ex) {

        }
        catch (FileNotFoundException ex) {

        }
        catch (IOException ex) {

        }

    }

    public float sumTotalSales(){
        float total = 0;

        for(int i=1;i<array.size();i++){
            String[] aux = array.get(i).clone();
            float x = Float.parseFloat(aux[3]);
            float y = Float.parseFloat(aux[5]);

            float mul = x*y;

            total+=mul;
        }

        return total;
    }

    public String findByInvoiceNo(String invoiceNo){
        String items="";
        for(int i=1;i<array.size();i++){
            String[] aux = array.get(i).clone();
            if (aux[0].equals(invoiceNo)){

                items += Arrays.toString(aux) +"\n";
            }
        }

        return items;
    }

    public int countByStockCode(String stockCode){

        int counter=0;

        for(int i=1;i<array.size();i++){
            String[] aux = array.get(i).clone();
            if (aux[1].equals(stockCode)){
                counter+=1;
            }
        }

        return counter;
    }

    public String avgMonthlySales(boolean groupByCountry){

        ArrayList<String> country = new ArrayList(10);
        country.add("");
        ArrayList<Float> totalByCountry = new ArrayList<Float>();
        totalByCountry.add((float) 0);
        int j=1;
        int in=0;

       if(groupByCountry==false){

           float total = sumTotalSales();
           float promedio = total/12;
           String out = "Promedio mensual: "+String.valueOf(promedio);
           return out;

       }else if(groupByCountry){
           for(int i=1;i<array.size();i++){
               String[] aux = array.get(i).clone();
               int index = country.indexOf(aux[7]);
               if(index==-1){
                  country.add(index+j, aux[7]);
                  j++;
               }
           }
           for(int i=1;i<array.size();i++){
               String[] aux = array.get(i).clone();
               int index = country.indexOf(aux[7]);

               float x = Float.parseFloat(aux[3]);
               float y = Float.parseFloat(aux[5]);

               float mul = x*y;
               if(index<=in){
                   float total = totalByCountry.get(index)+mul;
                   totalByCountry.remove(index);
                   totalByCountry.add(index, total);
               }else{
                   in++;
                   float total =mul;
                   totalByCountry.add(index, total);
               }

           }

           float total = sumTotalSales();
           float promedio = total/12;
           String out = "Promedio mensual: "+String.valueOf(promedio)+"\n";

           for(int i=0;i<totalByCountry.size();i++){
               float avg = totalByCountry.get(i)/12;
               totalByCountry.remove(i);
               totalByCountry.add(i, avg);

               out += country.get(i)+": "+totalByCountry.get(i)+"\n";
           }


           return out;
       }

       return "";
    }

    public ArrayList<String[]> getArray() {
        return array;
    }

    public void setArray(ArrayList<String[]> array) {
        this.array = array;
    }
}
