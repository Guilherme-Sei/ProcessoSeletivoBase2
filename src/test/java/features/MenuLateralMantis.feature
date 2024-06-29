#language = en

Feature: Realizando testes nas funcionalidades do Menu Lateral da plataforma Mantis


  Scenario: CT01 Realizando acesso a funcionalidade 'Minha Visao' no menu lateral da plataforma Mantis
    Given acesso a URL da plataforma
    When preencho as informacoes de usuario e senha
    And acesso a funcionalidade Minha visao no menu lateral
    Then validarei que a funcionalidade minha visão foi acessada com sucesso


  Scenario: CT02 Realizando acesso a funcionalidade 'Ver Tarefas' no menu lateral da plataforma Mantis
    Given acesso a URL da plataforma
    When preencho as informacoes de usuario e senha
    And acesso a funcionalidade Ver tarefas no menu lateral
    Then validarei que a funcionalidade ver tarefas foi acessada com sucesso


  Scenario: CT03 Realizando acesso a funcionalidade 'Criar Tarefas' no menu lateral da plataforma Mantis
    Given acesso a URL da plataforma
    When preencho as informacoes de usuario e senha
    And acesso a funcionalidade criar tarefas no menu lateral
    Then validarei que a funcionalidade criar tarefas foi acessada com sucesso


  Scenario: CT04 Realizando acesso a funcionalidade 'Registro de Mudanca' no menu lateral da plataforma Mantis
    Given acesso a URL da plataforma
    When preencho as informacoes de usuario e senha
    And acesso a funcionalidade registro de mudanca no menu lateral
    Then validarei que a funcionalidade registro de mudanca foi acessada com sucesso

  @Test
  Scenario: CT05 Realizando acesso a funcionalidade 'Planejamento' no menu lateral da plataforma Mantis
    Given acesso a URL da plataforma
    When preencho as informacoes de usuario e senha
    And acesso a funcionalidade planejamento no menu lateral
    Then validarei que a funcionalidade planejamento foi acessada com sucesso
