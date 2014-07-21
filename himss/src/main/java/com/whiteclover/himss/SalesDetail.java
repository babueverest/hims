package com.whiteclover.himss;

import java.util.Date;

/**
 * Sales Detail data structure
 * @author Akash
 */
public class SalesDetail {
    private Date date;
    private String name;
    private String productID;
    private int quantity;
    private int rate;

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getProductID() {
        return productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getRate() {
        return rate;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public SalesDetail(Date date, String name, String productID, int quantity, int rate) {
        this.date = date;
        this.name = name;
        this.productID = productID;
        this.quantity = quantity;
        this.rate = rate;
    }
    
}
