
package Models.dao;

import Connection.Conexao;
import Model.bean.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class conexaoDao {
    
/*public void create(Funcionario f){
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO filmes(nome, datalancamento, categoria)VALUES(?,?,?)");
            stmt.setString(1,f.getNome());
            stmt.setDate(2, new java.sql.Date(f.getDatalancamento().getTime()));
            stmt.setString(3,f.getCategoria());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar:(" + ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    }*/
}
