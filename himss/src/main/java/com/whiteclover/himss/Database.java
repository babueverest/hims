package com.whiteclover.himss;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author everest
 */
public class Database {
        public static Connection createDatabaseConnection() throws SQLException, ClassNotFoundException {
	String driver = "org.apache.derby.jdbc.EmbeddedDriver";
	Class.forName(driver);
	String url = "jdbc:derby:hims";
    	Connection c = DriverManager.getConnection(url);
	return c;
      }

      public static void create_table(Connection cn) throws SQLException {
          Statement st=cn.createStatement();
          st.executeUpdate("create table buy_details (date_of_purchase date, product_name varchar(100),quantity int,rate int,supplier_name varchar(150))");
          st.executeUpdate("cteate table product_details (product_id int, product_name varchar(100), quantity int)");
          st.executeUpdate("create table sales_details (date_of_sales date, customer_name varchar(100), productID int ,quantity int,rate int");
          st.close();
      }

      public static void insert_buy_details(Connection cn,Buy_Details buy_details) throws SQLException{
          Statement st=cn.createStatement();
          st.executeUpdate("insert into buy_details (product_id,..) values ()");

      }

      public static void insert_sales_details(Connection cn,SalesDetail[] salesdetail) throws SQLException{
          Statement st=cn.createStatement();
          for(int i=0;i<=salesdetail.length;i++){
          st.executeUpdate("insert into sales_details (date_of_sales date, customer_name, productID, quantity, rate) values ("+
                           salesdetail[i].getDate()+","+salesdetail[i].getCustomer_name()+","+salesdetail[i].getProductID()+","
                           +salesdetail[i].getQuantity()+","+salesdetail[i].getRate()+")");
          st.close();
          }
          
      }

      public static void select_buy_details(String Supplier_Name){

      }

      public static void select_sales_details(String Customer_Name){
          
      }

      public static void select_product_details(String Product_Name){

      }

       public static void main(String[] args) {
        try {
            // TODO code application logic here
            Connection cn = createDatabaseConnection();
            create_table(cn);

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
