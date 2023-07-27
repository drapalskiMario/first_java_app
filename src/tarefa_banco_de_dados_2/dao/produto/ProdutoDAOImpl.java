package tarefa_banco_de_dados_2.dao.produto;

import tarefa_banco_de_dados_2.dao.cliente.IClienteDAO;
import tarefa_banco_de_dados_2.dao.jbdc.FabricaConexao;
import tarefa_banco_de_dados_2.domain.Cliente;
import tarefa_banco_de_dados_2.domain.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProdutoDAOImpl implements IProdutoDAO {
    @Override
    public Long cadastrar(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = FabricaConexao.obterConexao();
            String sql = "INSERT INTO PRODUTO (NOME, PRECO, QUANTIDADE) VALUES (?, ?, ?)";
            stm = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            stm.setString(1, produto.getNome());
            stm.setBigDecimal(2, produto.getPreco());
            stm.setLong(3, produto.getQuantidade());
            stm.executeUpdate();

            var resultSet = stm.getGeneratedKeys();
            if (resultSet.next()) {
                return resultSet.getLong(1);
            }

            return null;
        } catch(Exception e) {
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
    public Produto obter(Long id) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Produto produto = null;
        try {
            connection = FabricaConexao.obterConexao();
            String sql = "SELECT ID, NOME, PRECO, QUANTIDADE FROM PRODUTO WHERE ID = ?";
            stm = connection.prepareStatement(sql);
            stm.setLong(1, id);
            rs = stm.executeQuery();
            if (rs.next()) {
                produto = new Produto();
                produto.setId(rs.getLong("id"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getBigDecimal("preco"));
                produto.setQuantidade(rs.getLong("quantidade"));
            }
            return produto;
        } catch(Exception e) {
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
    public Produto atualizar(Long id, Produto novoProduto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = FabricaConexao.obterConexao();
            String sql = "UPDATE PRODUTO SET NOME = ?, PRECO = ?, QUANTIDADE = ?  WHERE ID = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, novoProduto.getNome());
            stm.setBigDecimal(2, novoProduto.getPreco());
            stm.setLong(3, novoProduto.getQuantidade());
            stm.setLong(4, id);
            stm.executeUpdate();

            return this.obter(id);
        } catch(Exception e) {
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
            String sql = "DELETE FROM PRODUTO WHERE ID = ?";
            stm = connection.prepareStatement(sql);
            stm.setLong(1, id);
            return stm.executeUpdate();
        } catch(Exception e) {
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
