package projeto01.service;

import projeto01.dao.ClienteMapDAO;
import projeto01.dao.IClienteDAO;
import projeto01.domain.Cliente;

import javax.swing.*;

public class ClienteService {
    IClienteDAO clienteDAO = new ClienteMapDAO();

    public void sair() {
        JOptionPane.showMessageDialog(null,
                "Até logo",
                "Sair",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
    public void cadastrar() {
        String dados = JOptionPane.showInputDialog(null,
                "Digite os dados do cliente separados por vírgula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade, Estado",
                "Cadastro",
                JOptionPane.INFORMATION_MESSAGE);
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(
                dadosSeparados[0],
                dadosSeparados[1],
                dadosSeparados[2],
                dadosSeparados[3],
                dadosSeparados[4],
                dadosSeparados[5],
                dadosSeparados[6]
        );
        if (clienteDAO.cadastrar(cliente)) {
            JOptionPane.showMessageDialog(null,
                    "Cliente cadastrado com sucesso",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void consultar() {
        String cpf = JOptionPane.showInputDialog(null,
                "Informe o CPF do cliente para consulta",
                "Erro",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,
                clienteDAO.consultar(Long.valueOf(cpf)),
                "Consulta",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void excluir() {
        String cpf = JOptionPane.showInputDialog(null,
                "Informe o CPF do cliente para exclusão",
                "Erro",
                JOptionPane.INFORMATION_MESSAGE);
        clienteDAO.excluir(Long.valueOf(cpf));

        JOptionPane.showMessageDialog(null,
                "Cliente excluído com sucesso",
                "Exclusão",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void alterar() {
        String dados = JOptionPane.showInputDialog(null,
                "Digite os novos dados do cliente separados por vírgula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade, Estado",
                "Cadastro",
                JOptionPane.INFORMATION_MESSAGE);
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(
                dadosSeparados[0],
                dadosSeparados[1],
                dadosSeparados[2],
                dadosSeparados[3],
                dadosSeparados[4],
                dadosSeparados[5],
                dadosSeparados[6]
        );
        clienteDAO.alterar(cliente);
        JOptionPane.showMessageDialog(null,
                "Cliente alterado com sucesso",
                "Alteração",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void consultarTodos() {
        JOptionPane.showMessageDialog(null,
                clienteDAO.buscarTodos(),
                "Consulta",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
