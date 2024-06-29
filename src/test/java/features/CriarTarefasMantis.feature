#language = en

Feature: Realizando testes na criação de tarefas na plataforma Mantis

  @Test
  Scenario: CT01 Realizando a criação de uma Tarefa na plataforma Mantis
    Given acesso a URL da plataforma
    When preencho as informacoes de usuario e senha
    And acesso a funcionalidade criar tarefas no menu lateral
    And seleciono a categoria teste no campo categoria
    And seleciono a frequencia sempre no campo frequencia
    And seleciono a gravidade pequeno no campo gravidade
    And seleciono a prioridade alta no campo prioridade
    And seleciono mais preenchendo as informacoes de plataforma
    And escrevo o resumo da tarefa
    And escrevo a descricao da tarefa
    And escrevo o passo a passo da tarefa
    And escrevo as informacoes adicionais
    And seleciono o marcador atividade
    And clico criar nova tarefa
    Then validarei que a tarefa foi criada com sucesso
