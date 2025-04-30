import org.example.Produto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    public void testCriarProdutoValido(){
        Produto produto = new Produto("Arroz", 10.5, 5);
        assertEquals("Arroz", produto.getNome());
        assertEquals(10.5, produto.getPreco());
        assertEquals(5, produto.getQuantidade());
    }

    @Test
    public void testNomeInvalido(){
        Exception exception = assertThrows(IllegalArgumentException.class,() ->{
            new Produto("", 10.0,1);
        });
        assertEquals("Nome não pode ser vazio.", exception.getMessage());
    }

    @Test
    public void testPrecoNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Produto("Arroz", -1.0, 1);
        });
        assertEquals("Preço não pode ser negativo.", exception.getMessage());
    }

    @Test
    public void testQuantidadeNegativa() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Produto("Arroz", 10.0, -1);
        });
        assertEquals("Quantidade não pode ser negativa.", exception.getMessage());
    }
}

