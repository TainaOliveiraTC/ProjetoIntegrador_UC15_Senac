
package Connection;

//@Author:Tainá Oliveira

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Conexao{
private static final String DRIVER="com.mysql.cj.jdbc.Driver";
private static final String URL = "jdbc:mysql://localhost:3306/";
private static final String USER = "root";
private static final String PASS = "adm";
  
  
    public static Connection connectDB(){
        try {
            Connection conn;
            Statement st;
             Class.forName(DRIVER);
           return DriverManager.getConnection(URL, USER,PASS);
        } catch (ClassNotFoundException | SQLException ex) {
               throw new RuntimeException ("Erro ConectaDAO", ex);
      }
        }

  public static void closeConnection(Connection con){
          try {
               if(con != null){
              con.close();
               }
          } catch (SQLException ex) {
            throw new RuntimeException ("Erro ao fechar a conexão", ex);          }
      
  }
  public static void closeConnection(Connection con,PreparedStatement stmt){
      closeConnection(con);
          try {
               if(stmt != null){
              stmt.close();
               }
          } catch (SQLException ex) {
            throw new RuntimeException ("Erro ao fechar a conexão", ex);          }
          
      
  }
  public static void closeConnection(Connection con,PreparedStatement stmt, ResultSet rs){
      closeConnection(con,stmt);
          try {
               if(rs != null){
              rs.close();
               }
          } catch (SQLException ex) {
            throw new RuntimeException ("Erro ao fechar a conexão", ex);          }
          
      
  }
  
  

}
