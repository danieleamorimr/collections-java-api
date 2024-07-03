package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c: convidadoSet) {
            if (c.getCodigoConvite() ==  codigoConvite) {
                convidadoParaRemover = c;
                break;
            }

        }
        convidadoSet.remove(convidadoParaRemover);

    }
    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados.");

        conjuntoConvidados.adicionarConvidado("Carla", 123);
        conjuntoConvidados.adicionarConvidado("Marlon", 321);
        conjuntoConvidados.adicionarConvidado("Cintia", 321);
        conjuntoConvidados.adicionarConvidado("Otávio", 654);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados.");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(654);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados.");

        conjuntoConvidados.exibirConvidados();

    }

}


