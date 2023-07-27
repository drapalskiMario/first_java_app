package tarefa_banco_de_dados_2.dao.cliente;

import tarefa_banco_de_dados_2.dao.jbdc.FabricaConexao;
import tarefa_banco_de_dados_2.domain.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClienteDAOImpl implements IClienteDAO {
    @Override
    public Long cadastrar(Cliente cliente) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = FabricaConexao.obterConexao();
            String sql = "INSERT INTO CLIENTE (NOME) VALUES (?)";
            stm = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            stm.setString(1, cliente.getNome());
            stm.executeUpdate();

            var resultSet = stm.getGeneratedKeys();
            if (resultSet.next()) {
                return resultSet.getLong(1);
            }

            return null;

        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Cliente obter(Long id) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Cliente cliente = null;
        try {
            connection = FabricaConexao.obterConexao();
            String sql = "SELECT ID, NOME FROM CLIENTE WHERE ID = ?";
            stm = connection.prepareStatement(sql);
            stm.setLong(1, id);
            rs = stm.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setId(rs.getLong("id"));
                cliente.setNome(rs.getString("nome"));
            }
            return cliente;
        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Cliente atualizar(Long id, Cliente novoCliente) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = FabricaConexao.obterConexao();
            String sql = "UPDATE CLIENTE SET NOME = ? WHERE ID = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, novoCliente.getNome());
            stm.setLong(2, id);
            stm.executeUpdate();

            return this.obter(id);
        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Integer excluir(Long id) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = FabricaConexao.obterConexao();
            String sql = "DELETE FROM CLIENTE WHERE ID = ?";
            stm = connection.prepareStatement(sql);
            stm.setLong(1, id);
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
}
