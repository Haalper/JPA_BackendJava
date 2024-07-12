package test;

import static org.junit.Assert.assertNotNull;

import main.dao.ProdutoDao;
import main.dao.IProdutoDao;
import main.domain.Produto;
import org.testng.annotations.Test;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setNome("Televisão");
        produto.setDescricao("TV 50 Polegadas");
        produto.setPreco(100.0);
        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}
