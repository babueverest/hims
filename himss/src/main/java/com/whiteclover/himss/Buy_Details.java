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
public class Buy_Details {
    int Buy_Id;
    Date Date_of_Purchase;
    String Product_Name;
    int Quantity;
    int Rate;
    String Supplier_Name;

    public String getProduct_Name() {
        return Product_Name;
    }

    public void setProduct_Name(String Product_Name) {
        this.Product_Name = Product_Name;
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

    public String getSupplier_Name() {
        return Supplier_Name;
    }

    public void setSupplier_Name(String Supplier_Name) {
        this.Supplier_Name = Supplier_Name;
    }

    public Date getDate_of_Purchase() {
        return Date_of_Purchase;
    }

    public void setDate_of_Purchase(Date Date_of_Purhcase) {
        this.Date_of_Purchase= Date_of_Purchase;
    }


}
