package org.example;
import java.util.ArrayList;
import java.util.List;

public class CadastroProduto {
    private List<Produto> produtos;

    public CadastroProduto(){
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        if(produto == null){
            throw new IllegalArgumentException("Produto não pode ser nulo.");
        }
        produtos.add(produto);
    }

    public List<Produto> listarProdutos(){
        return new ArrayList<>(produtos); // retorna uma copia para proteger a lista original
    }

    public boolean estaVazio(){
        return produtos.isEmpty();
    }

    public int totalProdutos(){
        return produtos.size();
    }
}
