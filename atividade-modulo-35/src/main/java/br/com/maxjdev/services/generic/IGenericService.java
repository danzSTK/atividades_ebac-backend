package main.java.br.com.maxjdev.services.generic;

import br.com.maxjdev.dao.IPersistente;
import br.com.maxjdev.exceptions.DAOException;
import br.com.maxjdev.exceptions.MaisDeUmRegistroException;
import br.com.maxjdev.exceptions.TableException;
import br.com.maxjdev.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author maxjdev
 */
public interface IGenericService <T extends IPersistente, E extends Serializable> {
    /**
     * Método para cadastrar novos registro no banco de dados
     *
     * @param entity a ser cadastrado
     * @return retorna verdadeiro para cadastrado e falso para não cadastrado
     * @throws DAOException
     */
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    /**
     * Método para excluir um registro do banco de dados
     *
     * @param valor chave única do dado a ser excluído
     * @throws DAOException
     */
    public void excluir(E valor) throws DAOException;

    /**
     *Método para alterar um registro no bando de dados.
     *
     * @param entity a ser atualizado
     * @throws DAOException
     */
    public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    /**
     * Método para consultar um registro no banco de dados
     *
     * @param valor chave única do dado a ser consultado
     * @return
     * @throws DAOException
     */
    public T consultar(E valor) throws DAOException, MaisDeUmRegistroException, TableException;

    /**
     * Método que irá retornar todos os registros do banco de dados de uma determinado dado ou tabela
     *
     * @return Registros encontrados
     * @throws DAOException
     */
    public Collection<T> buscarTodos() throws DAOException;

}
