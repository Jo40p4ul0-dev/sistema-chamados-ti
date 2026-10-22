package chamados;
public class Chamado {
    private int id;
    private String titulo;
    private String descricao;
    private String prioridade;
    private String status;

    public Chamado(int id, String titulo, String descricao, String prioridade) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = "ABERTO";
    }

    public int getId() { return id; }
    public String getStatus() { return status; }
    public void fechar() { this.status = "FECHADO"; }

    @Override
    public String toString() {
        return "#" + id + " | " + titulo + " [" + prioridade + "] - " + status + "\n> " + descricao;
    }
}