package tarefa_banco_de_dados_3.dao.generic;

import tarefa_banco_de_dados_3.dao.Persistente;
import tarefa_banco_de_dados_3.exceptions.DAOException;
import tarefa_banco_de_dados_3.exceptions.MaisDeUmRegistroException;
import tarefa_banco_de_dados_3.exceptions.TableException;
import tarefa_banco_de_dados_3.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericDAO <T extends Persistente, E extends Serializable> {


    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException, TipoChaveNaoEncontradaException;

    public void excluir(E valor) throws DAOException, DAOException;

    public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException, TableException, MaisDeUmRegistroException;

    public Collection<T> buscarTodos() throws DAOException;
}
