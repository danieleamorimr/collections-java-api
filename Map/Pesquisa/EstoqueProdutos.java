package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long codigo, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(codigo, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }
    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;

    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }

        return produtoMaisCaro;

    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Urso", 1, 60.0);
        estoque.adicionarProduto(2L, "Boneca Barbie", 5, 120.0);
        estoque.adicionarProduto(3L, "Bola", 10, 20.0);
        estoque.adicionarProduto(4L, "Carrinho", 2, 40.0);
        estoque.adicionarProduto(5L, "Piscina de bolinhas", 2, 80.0);

        estoque.exibirProdutos();

        System.out.println("O produto mais caro é: " + estoque.obterProdutoMaisCaro());
        System.out.println("O valor total do estoque é de R$ " + estoque.calcularValorTotalEstoque());

    }

}


