#language:pt
Funcionalidade: Exportação de Documentos em Formato PDF

  Contexto:
    Dado que o usuário está logado no sistema operacional
    E após exportação os arquivos estarão no formato PDF

  Cenário: Validar garantia do destino
  - Destino deve permitir gravações de arquivos
    Dado que o usuário está logado no sistema operacional
    Quando o usuário gravar o arquivo
    Então o sistema deverá permitir a gravação do arquivo

  Cenário: Arquivo corrompido
    Dado que o usuário acesso um local com arquivos indisponíveis
    Quando o usuário tentar realizar a execução do arquivo
    Então será exibida um alerta que os documentos não serão baixados

  Cenário: Exportar arquivo corrompido
    Dado que o usuário acesso um local com arquivos indisponíveis
    E o usuário tentar realizar a execução do arquivo corrompido
    Quando este cenário ocorrer, o conteúdo não estará disponível no download
    E estará com críticas acrescida no início do arquivo
    Então caso o usuário não aceite, a exportação não será realizada

  Cenário: Unificação de documentos
    Dado que o usuário apresenta na visualização mais de um arquivo na exportação
    Quando o usuário realizar a exportação dos arquivos
    Então será unificado todos em um único documento

  Cenário: Inicio do download
    Dado que o usuário iniciou o processo de download
    E então será exibida mensagem de que não poderá cancelar o processo iniciado
    Quando finalizar o processo
    Então caberá ao usuário a verificação da conclusão do procedimento
    E se houver interrupções/erros o usuário deverá refazer o procedimento