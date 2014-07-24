/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hims;
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
          st.executeUpdate("create table sales_details (data_of_sales date, product_id ,quantity int,rate int, customer_name varchar(100)");
          st.close();
      }

      public static void insert_buy_details(Connection cn,Buy_Details buy_details) throws SQLException{
          Statement st=cn.createStatement();
          st.executeUpdate("");

      }

      public static void insert_sales_details(){
          
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
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
