# Cadastro de Produtos 📦

Projeto simples desenvolvido em Java com foco em aprendizado de conceitos fundamentais e testes automatizados com JUnit 5.

## 📚 Tecnologias utilizadas

- Java 17+
- JUnit 5
- IntelliJ IDEA
- Maven

## 🚀 Funcionalidades

- Cadastro de produtos com:
  - Nome
  - Preço
  - Quantidade
- Validações de entrada (nome vazio, preço/quantidade negativos)
- Listagem dos produtos cadastrados
- Testes automatizados usando JUnit

## 🔍 Estrutura

```
src/
├── main/
│   └── java/
│       ├── Produto.java
│       └── CadastroProduto.java
└── test/
    └── java/
        ├── ProdutoTest.java
        └── CadastroProdutoTest.java
```

## 🧪 Como executar os testes

1. Clone o repositório:
```bash
git clone https://github.com/marcoscastroj/CadastroProdutos.git
```

2. Navegue até o projeto e abra no IntelliJ IDEA (ou outro IDE compatível)

3. Execute os testes:
   - Via IDE: Clique com o botão direito nas classes `ProdutoTest` ou `CadastroProdutoTest` e selecione "Run"
   - Ou via terminal:
```bash
mvn test
```

## 📌 Objetivo

Esse projeto foi criado com o objetivo de praticar:
- Orientação a objetos (encapsulamento, validação, construtores)
- Escrita de testes unitários com JUnit 5
- Uso básico do Maven e organização de pacotes

## 📎 Autor

Desenvolvido por [Marcos Castro](https://github.com/marcoscastroj) — em processo de aprendizado focado em automação de testes.
