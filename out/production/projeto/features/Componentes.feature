#language:pt
Funcionalidade: Acessar componentes

  Contexto:
    Dado que o usuario acessou o arquivo Campo de Treinamento

  Cenário: validar campo textField
    Quando o usuario digitar Batatinha
    Então o resultado no campo textField deve ser Batatinha

  Cenário: validar campo textArea
    Quando o usuario digitar um texto grande no campo textArea
    Então o resultado no campo textArea deve ser um texto grande no campo textArea