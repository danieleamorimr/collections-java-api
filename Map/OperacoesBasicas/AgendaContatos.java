package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);

    }

    public void removerContato(String nome) {
        if (!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisaPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()) {
            numeroPorNome = agendaContatosMap.get(nome);
        }

        return numeroPorNome;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Daniele", 11111);
        agendaContatos.adicionarContato("Junior", 22222);
        agendaContatos.adicionarContato("Enzo", 33333);
        agendaContatos.adicionarContato("Laura", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Laura");

        agendaContatos.exibirContatos();

        System.out.println("O número é " + agendaContatos.pesquisaPorNome("Enzo"));

    }
}

