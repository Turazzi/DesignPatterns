# Implementações de Design Patterns

Este repositório contém implementações de diversos design patterns em Java. O objetivo é estudar e aplicar esses padrões em projetos práticos.

## Design Patterns Implementados

- **State**: Implementação do padrão State, que permite que um objeto altere seu comportamento quando seu estado interno muda.

## Próximos Design Patterns

As próximas implementações serão:

1. **Singleton**: Garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global a ela.
2. **Observer**: Define uma dependência um-para-muitos entre objetos, de forma que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente.
3. **Iterator**: Fornece um meio de acessar sequencialmente os elementos de um objeto agregado sem expor sua representação subjacente.
4. **Chain of Responsibility**: Permite que um pedido seja enviado por uma cadeia de manipuladores, onde cada manipulador pode processar o pedido ou passar adiante.

 ## 🐳 Rodando com Docker

1. **Build da imagem**:

```bash
docker build -t designpatterns-app .

