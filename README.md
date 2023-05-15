
# TASKAPP

## Descrição

O TASKAPP é um aplicativo de gerenciamento de tarefas que permite que os usuários criem, atualizem, excluam e listem tarefas e projetos em um banco de dados SQL.

## Instalação

Para utilizar o TASKAPP, siga as instruções abaixo:

1. Faça o download do código fonte do projeto em: (inserir link do repositório)
2. Abra o projeto em sua IDE de preferência.
3. Crie um banco de dados SQL e configure as informações de conexão no arquivo `connectionFactory.java`.
4. Execute o aplicativo `app.java` para criar projetos e tarefas e usá-lo.

## Classes

O projeto TASKAPP possui as seguintes classes:

- `task`: esta classe representa uma tarefa e contém as informações sobre a tarefa, como nome, descrição e prazo.
- `taskController`: esta classe gerencia as operações de CRUD (create, read, update e delete) em tarefas, permitindo que os usuários criem, atualizem e excluam tarefas.
- `project`: esta classe representa um projeto e contém as informações sobre o projeto, como nome e descrição.
- `projectController`: esta classe gerencia as operações de CRUD (create, read, update e delete) em projetos, permitindo que os usuários criem, atualizem e excluam projetos.
- `connectionFactory`: esta classe estabelece a conexão com o banco de dados SQL.
- `app.java`: esta classe é responsável por captar dados do usuário e criar projetos e tarefas, bem como executar as operações CRUD em projetos e tarefas.
está também, vai tratar os dados para que não ocorra erros.

## Como usar

Para usar o TASKAPP, siga as etapas abaixo:

1. Execute o arquivo `app.java`.
2. Siga as instruções apresentadas na tela para criar projetos e tarefas.
3. Use as operações CRUD disponíveis em `taskController` e `projectController` para gerenciar tarefas e projetos.

## Contribuição

Se você quiser contribuir com o TASKAPP, sinta-se à vontade para enviar pull requests e issues no repositório do GitHub. Será um prazer trabalhar com você para tornar este projeto ainda melhor.

## Observações:

Este projeto não possui interface, pois tem o intuito de estudos o Java backend, mas a classe `app.java` está preparada para realizar todas as operações. Sinta se a vontade para dar um clone neste projeto.
