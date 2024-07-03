package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;


public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();

    }
    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public String verificarPalavras(String palavra){
        if (palavrasUnicasSet.contains(palavra))
            return "Sim";
        return "Não";
    }

    public  void exibirPalavrasUnicas(){
        if(!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        conjuntoLinguagens.adicionarPalavra("boneca");
        conjuntoLinguagens.adicionarPalavra("crochê");
        conjuntoLinguagens.adicionarPalavra("vagalume");
        conjuntoLinguagens.adicionarPalavra("artesanato");

        conjuntoLinguagens.exibirPalavrasUnicas();
        conjuntoLinguagens.removerPalavra("boneca");
        conjuntoLinguagens.exibirPalavrasUnicas();
        conjuntoLinguagens.removerPalavra("vagalume");
        conjuntoLinguagens.exibirPalavrasUnicas();

        System.out.println("A plavra 'croche' está no conjunto? " + conjuntoLinguagens.verificarPalavras("croche"));
        System.out.println("A palavra 'boneca' está no conjunto? " + conjuntoLinguagens.verificarPalavras("artesanato"));

        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}
