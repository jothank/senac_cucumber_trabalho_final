#language:pt
Funcionalidade: Acessar componentes

  Contexto:
    Dado que o usuário acessou o arquivo Componente.html e irá realizar o preenchimento dos dados

  Cenário: Preencher nome, sobrenome, sexo, comida, escolaridade, esporte, clicar no botão Cadastrar e validar o cadastro
    Quando o usuário digitar Nome no textfield
    E o usuário digitar o Sobrenome no textfield
    E o usuário selecionar o Sexo no radiobutton
    E o usuário selecionar uma ou mais Comida no checkbox
    E o usuário selecionar a Escolaridade no combobox
    E o usuário selecionar um ou mais Esportes no listbox
    Então o usuário deve clicar no botão Cadastrar
    E deve ser validado o nome digitado no textfield
    E deve ser validado o sobrenome digitado no textfield
    E deve ser validado o sexo selecionado no radiobutton
    E deve ser validado uma ou mais comidas selecionadas no checkbox
    E deve ser validado a escolaridade selecionada no combobox
    E deve ser validado um ou mais esportes selecionados no listbox

  Cenário: Validação de regra de negócio obrigatoriedade Nome
    Quando usuário não preencher o textfield com nome
    Então deve apresentar alerta informando Nome eh obrigatorio

  Cenário: Validação de regra de negócio obrigatoriedade Sobrenome
    Quando usuário não preencher o textfield com sobrenome
    Então deve apresentar alerta informando Sobrenome eh obrigatorio

  Cenário: Validação de regra de negócio obrigatoriedade Sexo
    Quando usuário não selecionar o radiobutton do sexo
    Então deve apresentar alerta informando Sexo eh obrigatorio