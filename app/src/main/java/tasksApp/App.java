
package tasksApp;

import java.util.List;
import controller.ProjectController;
import model.Project;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ProjectController projectController = new ProjectController();

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Criar um projeto");
            System.out.println("2 - Atualizar um projeto");
            System.out.println("3 - Remover um projeto");
            System.out.println("4 - Listar todos os projetos");
            System.out.println("5 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do projeto:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a descrição do projeto:");
                    String descricao = scanner.nextLine();

                    Project novoProjeto = new Project();
                    novoProjeto.setName(nome);
                    novoProjeto.setDescription(descricao);

                    projectController.save(novoProjeto);
                    System.out.println("Projeto criado com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite o ID do projeto que deseja atualizar:");
                    int idProjeto = scanner.nextInt();
                    scanner.nextLine();

                    Project projetoAtualizar = projectController.getById(idProjeto);

                    if (projetoAtualizar == null) {
                        System.out.println("Projeto não encontrado!");
                        break;
                    }

                    System.out.println("Digite o novo nome do projeto:");
                    nome = scanner.nextLine();
                    System.out.println("Digite a nova descrição do projeto:");
                    descricao = scanner.nextLine();

                    projetoAtualizar.setName(nome);
                    projetoAtualizar.setDescription(descricao);

                    projectController.update(projetoAtualizar);
                    System.out.println("Projeto atualizado com sucesso!");
                    break;

                case 3:
                    System.out.println("Digite o ID do projeto que deseja remover:");
                    idProjeto = scanner.nextInt();
                    scanner.nextLine();

                    projectController.removeById(idProjeto);
                    System.out.println("Projeto removido com sucesso!");
                    break;

                case 4:
                    List<Project> projetos = projectController.getAll();

                    System.out.println("Total de projetos: " + projetos.size());
                    for (Project projeto : projetos) {
                        System.out.println("ID: " + projeto.getId() + " | Nome: " + projeto.getName() + " | Descrição: "
                                + projeto.getDescription());
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println();
        } while (opcao != 5);
    }
}
