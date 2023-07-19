package projeto_02.dao.impl;


import projeto_02.dao.IClienteDAO;
import projeto_02.domain.Cliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteDAOImpl implements IClienteDAO {

    private Map<Long, Cliente> clientes;

    public ClienteDAOImpl() {
        this.clientes = new HashMap<>();
    }

    @Override
    public Cliente salvar(Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
        return cliente;
    }

    @Override
    public Cliente atualizar(Cliente cliente) {
        if (clientes.containsKey(cliente.getId())) {
            clientes.put(cliente.getId(), cliente);
            return cliente;
        }
        return null;
    }

    @Override
    public void deletar(Long id) {
        clientes.remove(id);
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return clientes.get(id);
    }

    @Override
    public List<Cliente> buscarTodos() {
        return new ArrayList<>(clientes.values());
    }
}
