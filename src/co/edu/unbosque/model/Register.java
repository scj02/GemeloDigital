package co.edu.unbosque.model;

public class Register {
    private String invoiceNo;
    private String stockCode;
    private String description;
    private String qty;
    private String date;
    private String unitPrice;
    private String customerID;
    private String country;

    public Register(String invoiceNo, String stockCode, String description, String qty, String date, String unitPrice, String customerID, String country) {
        this.invoiceNo = invoiceNo;
        this.stockCode = stockCode;
        this.description = description;
        this.qty = qty;
        this.date = date;
        this.unitPrice = unitPrice;
        this.customerID = customerID;
        this.country = country;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "invoiceNo='" + invoiceNo + '\'' +
                ", stockCode='" + stockCode + '\'' +
                ", description='" + description + '\'' +
                ", qty='" + qty + '\'' +
                ", date='" + date + '\'' +
                ", unitPrice='" + unitPrice + '\'' +
                ", customerID='" + customerID + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
