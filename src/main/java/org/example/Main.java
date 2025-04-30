package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroProduto cadastro = new CadastroProduto();

        int opcao;
        do{
            System.out.println("\n===== MENU =====");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    try {
                        System.out.print("Nome do produto: ");
                        String nome = scanner.nextLine();

                        System.out.print("Preço: ");
                        double preco = scanner.nextDouble();

                        System.out.print("Quantidade: ");
                        int quantidade = scanner.nextInt();
                        scanner.nextLine();

                        Produto produto = new Produto(nome, preco, quantidade);
                        cadastro.adicionarProduto(produto);
                        System.out.println("Produto cadastrado com sucesso!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro ao cadastrar produto: " + e.getMessage());
                    } break;

                case 2:
                    if (cadastro.estaVazio()){
                        System.out.println("nenhum produto cadastrado");
                    } else{
                        System.out.println("\nLista de Produtos:");
                        for (Produto p : cadastro.listarProdutos()) {
                            System.out.println(p);
                        }
                    } break;

                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
        }
    } while (opcao!=3);
        scanner.close();
    }
}
