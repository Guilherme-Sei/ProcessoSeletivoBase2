#language = en

Feature: Realizando testes na funcionalidade Ver Tarefas


  Scenario: CT01 Realizando testes na visualização de Tarefas criadas no Mantis
    Given acesso a URL da plataforma
    When preencho as informacoes de usuario e senha
    And acesso a funcionalidade Ver tarefas no menu lateral
    And acesso uma das tarefas criadas
    Then validarei que a funcionalidade esta levando para a pagina correta


  Scenario: CT02 Realizando testes na funcionalidade Adicionar Anotação em Tarefas criadas no Mantis
    Given acesso a URL da plataforma
    When preencho as informacoes de usuario e senha
    And acesso a funcionalidade Ver tarefas no menu lateral
    And acesso uma das tarefas criadas
    Then adiciono uma anotacao a tarefa criada
    And validarei que a anotacao foi criada com sucesso



