package Set.Ordenacao;

import Set.Pesquisa.Contato;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo,nome,preco,quantidade));
    }

    public Set<Produto>exibirProdutosPorNome(){
    Set<Produto> exibirProdutosPorNome = new TreeSet<>(produtoSet);
        if (!produtoSet.isEmpty()) {
            return exibirProdutosPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

  public Set<Produto>exibirProdutosPorPreco(){
        Set<Produto>exibirProdutosPorPreco = new TreeSet<>(new comparatorPorPreco());
      if (!produtoSet.isEmpty()) {
          exibirProdutosPorPreco.addAll(produtoSet);
          return exibirProdutosPorPreco;
      } else {
          throw new RuntimeException("O conjunto está vazio!");
      }
  }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1, "Nome 1", 25d, 2);
        cadastroProdutos.adicionarProduto(2, "Nome 4", 3d, 1);
        cadastroProdutos.adicionarProduto(3, "Nome 2", 40d, 3);
        cadastroProdutos.adicionarProduto(4, "Nome 3", 20d, 2);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

    }
}
