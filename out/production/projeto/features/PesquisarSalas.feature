#language:pt
Funcionalidade: Grid de pesquisar Salas

  Contexto:
    Dado que o usuário está logado no sistema

  Cenário: Pesquisar sala existente
  - é Possível pesquisar apenas pelo nome da sala.
  - Botão pesquisar deve estar no canto superior esquerdo.
  - Abaixo do botão deve existir o campo Sala para digitar.
    Dado que o usuário digitou o nome de uma sala no campo pesquisar
    Quando o usuário selecionou a sala desejada
    Então deverá listar salas que o usuário tem acesso.

  Cenário: Pesquisar sala inexistente
  - é Possível pesquisar apenas pelo nome da sala.
  - Botão pesquisar deve estar no canto superior esquerdo.
  - Abaixo do botão deve existir o campo Sala para digitar.
    Dado que o usuário digitou o nome de uma sala no campo pesquisar
    Quando o usuário selecionou a sala inexistente
    Então deve retornar o feedback “A sala [nomeDaSala] não está cadastrada”

    