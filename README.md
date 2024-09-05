
# CRUD Lista Telefônica

Este é um projeto simples de uma Lista Telefônica, desenvolvido em Java utilizando o framework Swing para a interface gráfica. O projeto adota a arquitetura MVC (Model-View-Controller) e implementa o padrão de design Observer para a comunicação entre os componentes.

## Funcionalidades
- Adicionar novos contatos com nome, email e número de telefone.
- Editar ou excluir contatos existentes.
- Visualizar cada contato em uma interface gráfica.

## Arquitetura MVC (Model-View-Controller)
- **Model**: A classe User representa o modelo de dados, gerenciando a lista de contatos de cada usuário e as operações associadas (adicionar, editar, excluir).
- **View**: A classe UserView define a interface gráfica, permitindo a interação do usuário com a lista telefônica de maneira fácil e visual.
- **Controller**: A classe UserController faz a ponte entre o User (modelo) e o UserView (interface), processando a entrada do usuário e atualizando o modelo de dados conforme necessário.

## Padrão Observer
O padrão Observer é utilizado para garantir que a UserView seja atualizada automaticamente sempre que houver uma mudança no User, como a adição ou remoção de contatos.
