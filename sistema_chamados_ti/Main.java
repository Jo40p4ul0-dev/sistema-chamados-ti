package sistema_chamados_ti;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorChamados gerenciador = new GerenciadorChamados();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n=== SISTEMA DE CHAMADOS - TI ===");
            System.out.println("1 - Abrir chamado");
            System.out.println("2 - Listar chamados");
            System.out.println("3 - Fechar chamado");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = sc.nextLine();
                    System.out.print("Prioridade (ALTA/MEDIA/BAIXA): ");
                    String prioridade = sc.nextLine();
                    gerenciador.abrirChamado(titulo, descricao, prioridade);
                    break;
                case 2:
                    gerenciador.listarChamados();
                    break;
                case 3:
                    System.out.print("ID do chamado para fechar: ");
                    int id = sc.nextInt();
                    gerenciador.fecharChamado(id);
                    break;
            }
        }
        sc.close();
    }
}