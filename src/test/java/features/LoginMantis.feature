#language=en
Feature: Realizando testes de login no Mantis

  Scenario: CT01 Realizando login com os dados corretos na plataforma Mantis
    Given acesso a URL da plataforma
    When preencho as informacoes de usuario e senha
    Then validarei que os dados foram preenchidos corretamente


  Scenario: CT02 Realizando login com os dados incorretos na plataforma Mantis
    Given acesso a URL da plataforma
    When preencho com as informacoes de usuario e senha incorretos
    Then validarei a mensagem de erro "Sua conta pode estar desativada ou bloqueada ou o nome de usuário e a senha que você digitou não estão corretos."