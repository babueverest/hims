package com.whiteclover.himss;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
        Connection c;
        try{
            String url = "jdbc:derby:himsa";
            c = DriverManager.getConnection(url);
            System.out.println(c);
            return c;
        }catch(SQLException ex){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Creating database");
            String url = "jdbc:derby:himsa;create=true";
            c = DriverManager.getConnection(url);
            create_table(c);
            return c;
        }
        
      }

      public static void create_table(Connection cn) throws SQLException {
          Statement st=cn.createStatement();
          st.executeUpdate("create table buy_details (date_of_purchase date, product_name varchar(100),quantity int,rate int,supplier_name varchar(150))");
          st.executeUpdate("create table product_details (product_id integer not null generated always as identity (start with 1, increment by 1), product_name varchar(100), quantity int,CONSTRAINT primary_key PRIMARY KEY (product_id))");
          st.executeUpdate("create table sales_details (date_of_sales date, customer_name varchar(100), productID int ,quantity int,rate int)");
          st.close();
      }

      public static int insert_buy_details(Connection cn,Buy_Details[] buy_details) throws SQLException{
          Statement st=cn.createStatement();
          int auto_num=0;
          for(int i=0;i<=buy_details.length;i++){
          st.executeUpdate("insert into buy_details (date_of_purchase,product_name,quantity,rate,supplier_name) values ("+buy_details[i].getDate_of_Purchase()+","+buy_details[i].getProduct_Name()+","+buy_details[i].getQuantity()+","+buy_details[i].getRate()+","+buy_details[i].getSupplier_Name()+")",Statement.RETURN_GENERATED_KEYS);
          }
          return auto_num;
      }
      
      public static void add_product_details(Connection cn,Product_Details product_details) throws SQLException{
          Statement st=cn.createStatement();
          ResultSet result_set=st.executeQuery("select * from product_details where name="+product_details.getProduct_Name());
          if(result_set.next()){ //exists update
              st.executeUpdate("update product_details set quantity=(quantity+"+product_details.getQuantity()+") where name="+"'"+product_details.getProduct_Name()+"'");
          }
          else{
          st.executeUpdate("insert into product_details (product_name, quantity) values()");
          }
      }
      
      public static void deduct_product_quantity(Connection cn, Product_Details product_details) throws SQLException{
          
      }

      public static void insert_sales_details(Connection cn,SalesDetail[] salesdetail) throws SQLException{
          Statement st=cn.createStatement();
          for(int i=0;i<=salesdetail.length;i++){
          st.executeUpdate("insert into sales_details (date_of_sales, customer_name, productID, quantity, rate) values ("+
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
            cn.close();

        } catch (    SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
