package test.java.br.com.maxjdev.dao.dao;

import br.com.maxjdev.Domain.Produto;
import br.com.maxjdev.dao.IProdutoDAO;
import br.com.maxjdev.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

/**
 * @author maxjdev
 */
public class ProdutoDaoMock implements IProdutoDAO {

    @Override
    public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public void excluir(String valor) {
        // TODO Auto-generated method stub

    }

    @Override
    public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {
        // TODO Auto-generated method stub

    }

    @Override
    public Produto consultar(String valor) {
        Produto produto = new Produto();
        produto.setCodigo(valor);
        return produto;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

}
