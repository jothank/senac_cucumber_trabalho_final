#language:pt
Funcionalidade: Cadastrar Sala

  Contexto:
    Dado que o usuário está logado no sistema

  Cenário: Validar campo obrigatório
  - O campo Sala é obrigatório.
  - Asterisco (*)
    Dado que o usuário está logado no sistema
    Quando o usuário acessar a modal Cadastrar Sala
    Então no campo Sala deve conter um esterisco

  Cenário: Validar campo descrição
    Dado que o usuário acessar a modal Cadastrar Sala
    E que o usuário irá preencher o campo descrição
    Quando o usuário preencher com mais de 500 caracteres
    Então o campo descrição irá informar erro

  Cenário: Validar cadastro duplo
    Dado que o usuário acessar a modal Cadastrar Sala
    Quando o usuário cadastrar a segunda sala com nome existente
    Então irá retornar a mensagem de feedback Erro

  Cenário: Validar cadastro com sucesso
    Dado que o usuário acessar a modal Cadastrar Sala
    E que o usuário preencheu os campos obrigatórios
    Quando clicar no botão salvar
    Então irá retornar a mensagem de feedback Sucesso


  Cenário: Validar cancelamento de cadastro
    Dado que o usuário acessar a modal Cadastrar Sala
    Quando o usuário clicar no botão cancelar
    Então irá cancelar o cadastro da sala

  Cenário: Validar limpeza de campos
    Dado que o usuário acessar a modal Cadastrar Sala
    E o usuário preencher os campos Sala e Descrição
    Quando clicar no botão cancelar
    Então os campos Sala e Descrição serão limpos

  Cenário: Validar salvamento sala
    Dado que o usuário preencheu o cadastro na modal
    Quando o usuário clicar no botão salvar
    Então deverá ser exibida as informações na Grid de pesquisar salas.

