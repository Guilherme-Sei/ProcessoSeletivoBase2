package pages;

import elementmap.CriarTarefasMantisElementMap;
import elementmap.LoginMantisElementMap;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import properties.Properties;
import properties.TestRule;
public class CriarTarefasMantisPage extends CriarTarefasMantisElementMap {
    public CriarTarefasMantisPage(){
        PageFactory.initElements(TestRule.getDriver(),this);
    }

    public void selecionoACategoriaTesteNoCampoCategoria() {
        Select select = new Select(selectCategoria);
        select.selectByVisibleText("[Todos os Projetos] categoria teste");
    }

    public void selecionoAFrequenciaSempreNoCampoFrequencia() {
        Select select = new Select(selectFrequencia);
        select.selectByVisibleText("sempre");
    }

    public void selecionoAGravidadePequenoNoCampoGravidade() {
        Select select = new Select(selectGravidade);
        select.selectByVisibleText("pequeno");
    }

    public void selecionoAPrioridadeAltaNoCampoPrioridade() {
        Select select = new Select(selectPrioridade);
        select.selectByVisibleText("alta");
    }

    public void selecionoMaisPreenchendoAsInformacoesDePlataforma() {
        //btnMais.click();
        txtPlataforma.click();
        txtPlataforma.sendKeys("Plataforma");
        txtSO.click();
        txtSO.sendKeys("SO");
        txtVersaoSO.click();
        txtVersaoSO.sendKeys("Versão SO");
    }

    public void escrevoOResumoDaTarefa() {
        txtResumo.click();
        txtResumo.sendKeys("Digitar um Resumo");
    }

    public void escrevoADescricaoDaTarefa() {
        txtDescricao.click();
        txtDescricao.sendKeys("Digitar uma Descrição");
    }

    public void escrevoOPassoAPassoDaTarefa() {
        txtPassoAPasso.click();
        txtPassoAPasso.sendKeys("Digitar o Passo a Passo");
    }

    public void escrevoAsInformacoesAdicionais() {
        txtInformacoesAdicionais.click();
        txtInformacoesAdicionais.sendKeys("Digitar Informações Adicionais");
    }

    public void selecionoOMarcadorAtividade() {
        Select select = new Select(selectMarcador);
        select.selectByVisibleText("Atividade");
    }

    public void clicoCriarNovaTarefa() {
        btnCriarNovaTarefa.click();
    }

    public void validareiQueATarefaFoiCriadaComSucesso() {
        Assert.assertTrue(btnMonitorar.isDisplayed());
    }


}
