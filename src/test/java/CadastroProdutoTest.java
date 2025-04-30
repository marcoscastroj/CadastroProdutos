import org.example.CadastroProduto;
import org.example.Produto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CadastroProdutoTest {

    @Test
    public void testAdicionarProduto() {
        CadastroProduto cadastro = new CadastroProduto();
        Produto produto = new Produto("Feijão", 7.99, 10);
        cadastro.adicionarProduto(produto);

        assertFalse(cadastro.estaVazio());
        assertEquals(1, cadastro.totalProdutos());
        assertEquals("Feijão", cadastro.listarProdutos().get(0).getNome());
    }

    @Test
    public void testAdicionarProdutoNulo() {
        CadastroProduto cadastro = new CadastroProduto();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cadastro.adicionarProduto(null);
        });
        assertEquals("Produto não pode ser nulo.", exception.getMessage());
    }

    @Test
    public void testListarProdutosRetornaCopia() {
        CadastroProduto cadastro = new CadastroProduto();
        Produto produto = new Produto("Café", 15.0, 3);
        cadastro.adicionarProduto(produto);

        var lista = cadastro.listarProdutos();
        lista.clear(); // tentando alterar a cópia

        assertEquals(1, cadastro.totalProdutos()); // a lista original continua intacta
    }
}