package test.java.br.com.maxjdev.dao.test;

import br.com.maxjdev.Domain.Produto;
import br.com.maxjdev.dao.IProdutoDAO;
import br.com.maxjdev.exceptions.DAOException;
import br.com.maxjdev.exceptions.MaisDeUmRegistroException;
import br.com.maxjdev.exceptions.TableException;
import br.com.maxjdev.exceptions.TipoChaveNaoEncontradaException;
import br.com.maxjdev.services.IProdutoService;
import br.com.maxjdev.services.ProdutoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.br.com.maxjdev.dao.dao.ProdutoDaoMock;

import java.math.BigDecimal;

/**
 * @author maxjdev
 */
public class ProdutoServiceTest {

    private IProdutoService produtoService;

    private Produto produto;

    public ProdutoServiceTest() {
        IProdutoDAO dao = new ProdutoDaoMock();
        produtoService = new ProdutoService(dao);
    }

    @Before
    public void init() {
        produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("Produto 1");
        produto.setNome("Produto 1");
        produto.setValor(BigDecimal.TEN);
    }

    @Test
    public void pesquisar() throws DAOException, MaisDeUmRegistroException, TableException {
        Produto produtor = this.produtoService.consultar(produto.getCodigo());
        Assert.assertNotNull(produtor);
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException, DAOException {
        Boolean retorno = produtoService.cadastrar(produto);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluir() throws DAOException {
        produtoService.excluir(produto.getCodigo());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        produto.setNome("Rodrigo Pires");
        produtoService.alterar(produto);

        Assert.assertEquals("Rodrigo Pires", produto.getNome());
    }
}
