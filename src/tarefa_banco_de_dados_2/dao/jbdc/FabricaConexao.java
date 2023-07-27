package tarefa_banco_de_dados_2.dao.jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
    private static Connection conexao;

    private FabricaConexao(Connection conexao) {

    }

    public static Connection obterConexao() throws SQLException {
        if (conexao == null) {
            conexao = initConnection();
            return conexao;
        } else if (conexao.isClosed()) {
            conexao = initConnection();
            return conexao;
        } else {
            return conexao;
        }
    }

    private static Connection initConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/vendas", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
