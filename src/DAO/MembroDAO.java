package src.DAO;

import src.connection.DatabaseConnection;
import src.entity.Membro; 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MembroDAO {

    public void cadastrarMembro(Membro membro) {
        String sql = "INSERT INTO MEMBRO (NOME, MATRICULA, EMAIL, SENHA, ATIVIDADES) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement ps = null;
        Connection conn = null;
        try {
            conn = DatabaseConnection.getConexao();
            if (conn != null) {
                ps = conn.prepareStatement(sql);
                ps.setString(1, membro.getNome());
                ps.setString(2, membro.getMatricula());
                ps.setString(3, membro.getEmail());
                ps.setString(4, membro.getSenha());
                ps.setString(5, membro.getAtividades());

                ps.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
