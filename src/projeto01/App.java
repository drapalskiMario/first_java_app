package projeto01;

import projeto01.service.ClienteService;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        ClienteService clienteService = new ClienteService();

        String opcao = "";

        while(isOpcaoValida(opcao) == false) {
            opcao = JOptionPane.showInputDialog(null,
                    "Opção inválida ! Digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alteração, 5 para consultar todos ou 6 para sair",
                    "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
        }

        while(isOpcaoValida(opcao)) {
            if(opcao.equals("6")) {
                clienteService.sair();
            } else if (opcao.equals("1")) {
                clienteService.cadastrar();
                opcao = "";
            } else if (opcao.equals("2")) {
                clienteService.consultar();
                opcao = "";
            } else if (opcao.equals("3")) {
                clienteService.excluir();
                opcao = "";
            } else if (opcao.equals("4"))  {
                clienteService.alterar();
                opcao = "";
            } else if (opcao.equals("5")) {
                clienteService.consultarTodos();
                opcao = "";
            } else {
                opcao = JOptionPane.showInputDialog(null,
                        "Digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para consultar todos ou 6 para sair",
                        "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private static boolean isOpcaoValida(String opcao) {
        String[] opcoesValidas = {"1", "2", "3", "4", "5", ""};
        for(String opcaoValida : opcoesValidas) {
            if(opcao.equals(opcaoValida));
            return true;
        }
        return false;
    }
}
