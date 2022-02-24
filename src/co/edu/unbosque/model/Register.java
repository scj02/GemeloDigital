package co.edu.unbosque.model;

/**
 * The type Register.
 */
public class Register {
    private String invoiceNo;
    private String stockCode;
    private String description;
    private String qty;
    private String date;
    private String unitPrice;
    private String customerID;
    private String country;

    /**
     * Instantiates a new Register.
     *
     * @param invoiceNo   the invoice no
     * @param stockCode   the stock code
     * @param description the description
     * @param qty         the qty
     * @param date        the date
     * @param unitPrice   the unit price
     * @param customerID  the customer id
     * @param country     the country
     */
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

    /**
     * Gets invoice no.
     *
     * @return the invoice no
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Sets invoice no.
     *
     * @param invoiceNo the invoice no
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    /**
     * Gets stock code.
     *
     * @return the stock code
     */
    public String getStockCode() {
        return stockCode;
    }

    /**
     * Sets stock code.
     *
     * @param stockCode the stock code
     */
    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets qty.
     *
     * @return the qty
     */
    public String getQty() {
        return qty;
    }

    /**
     * Sets qty.
     *
     * @param qty the qty
     */
    public void setQty(String qty) {
        this.qty = qty;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Gets customer id.
     *
     * @return the customer id
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets customer id.
     *
     * @param customerID the customer id
     */
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    /**
     * Gets country.
     *
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets country.
     *
     * @param country the country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets unit price.
     *
     * @return the unit price
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets unit price.
     *
     * @param unitPrice the unit price
     */
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
