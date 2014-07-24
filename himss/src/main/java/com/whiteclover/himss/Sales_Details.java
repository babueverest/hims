/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.whiteclover.himss;

import java.util.Date;

/**
 *
 * @author everest
 */
public class Sales_Details {
    int Sales_Id;
    Date Date_of_Sales;
    String Product_Id;
    int Quantity;
    int Rate;
    String Customer_Name;

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String Customer_Name) {
        this.Customer_Name = Customer_Name;
    }

    public Date getDate_of_Sales() {
        return Date_of_Sales;
    }

    public void setDate_of_Sales(Date Date_of_Sales) {
        this.Date_of_Sales = Date_of_Sales;
    }

    public String getProduct_Id() {
        return Product_Id;
    }

    public void setProduct_Id(String Product_Id) {
        this.Product_Id = Product_Id;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getRate() {
        return Rate;
    }

    public void setRate(int Rate) {
        this.Rate = Rate;
    }

    
}
