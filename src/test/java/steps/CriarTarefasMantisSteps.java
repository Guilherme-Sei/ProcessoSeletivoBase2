package steps;

import io.cucumber.java.en.*;
import pages.CriarTarefasMantisPage;

public class CriarTarefasMantisSteps {

    CriarTarefasMantisPage criarTarefasMantisPage = new CriarTarefasMantisPage();

    @When("seleciono a categoria teste no campo categoria")
    public void selecionoACategoriaTesteNoCampoCategoria() {
        criarTarefasMantisPage.selecionoACategoriaTesteNoCampoCategoria();
    }

    @When("seleciono a frequencia sempre no campo frequencia")
    public void selecionoAFrequenciaSempreNoCampoFrequencia() {
        criarTarefasMantisPage.selecionoAFrequenciaSempreNoCampoFrequencia();
    }

    @When("seleciono a gravidade pequeno no campo gravidade")
    public void selecionoAGravidadePequenoNoCampoGravidade() {
        criarTarefasMantisPage.selecionoAGravidadePequenoNoCampoGravidade();
    }

    @When("seleciono a prioridade alta no campo prioridade")
    public void selecionoAPrioridadeAltaNoCampoPrioridade() {
        criarTarefasMantisPage.selecionoAPrioridadeAltaNoCampoPrioridade();
    }

    @When("seleciono mais preenchendo as informacoes de plataforma")
    public void selecionoMaisPreenchendoAsInformacoesDePlataforma() {
        criarTarefasMantisPage.selecionoMaisPreenchendoAsInformacoesDePlataforma();
    }

    @When("escrevo o resumo da tarefa")
    public void escrevoOResumoDaTarefa() {
        criarTarefasMantisPage.escrevoOResumoDaTarefa();
    }

    @When("escrevo a descricao da tarefa")
    public void escrevoADescricaoDaTarefa() {
        criarTarefasMantisPage.escrevoADescricaoDaTarefa();
    }

    @When("escrevo o passo a passo da tarefa")
    public void escrevoOPassoAPassoDaTarefa() {
        criarTarefasMantisPage.escrevoOPassoAPassoDaTarefa();
    }

    @When("escrevo as informacoes adicionais")
    public void escrevoAsInformacoesAdicionais() {
        criarTarefasMantisPage.escrevoAsInformacoesAdicionais();
    }

    @When("seleciono o marcador atividade")
    public void selecionoOMarcadorAtividade() {
        criarTarefasMantisPage.selecionoOMarcadorAtividade();
    }

    @When("clico criar nova tarefa")
    public void clicoCriarNovaTarefa() {
        criarTarefasMantisPage.clicoCriarNovaTarefa();
    }

    @Then("validarei que a tarefa foi criada com sucesso")
    public void validareiQueATarefaFoiCriadaComSucesso() {
        criarTarefasMantisPage.validareiQueATarefaFoiCriadaComSucesso();
    }


}
