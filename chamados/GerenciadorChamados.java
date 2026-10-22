package chamados;
import java.util.ArrayList;

public class GerenciadorChamados {
    private ArrayList<Chamado> chamados = new ArrayList<>();
    private int proximoId = 1;

    public void abrirChamado(String titulo, String descricao, String prioridade) {
        Chamado novo = new Chamado(proximoId++, titulo, descricao, prioridade);
        chamados.add(novo);
        System.out.println("Chamado aberto com sucesso!");
    }

    public void listarChamados() {
        if (chamados.isEmpty()) {
            System.out.println("Nenhum chamado cadastrado.");
            return;
        }
        for (Chamado c : chamados) {
            System.out.println(c);
            System.out.println("--------------------");
        }
    }

    public void fecharChamado(int id) {
        for (Chamado c : chamados) {
            if (c.getId() == id) {
                c.fechar();
                System.out.println("Chamado #" + id + " fechado.");
                return;
            }
        }
        System.out.println("Chamado não encontrado.");
    }
}