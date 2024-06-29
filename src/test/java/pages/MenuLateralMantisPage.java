package pages;

import elementmap.LoginMantisElementMap;
import elementmap.MenuLateralMantisElementMap;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import properties.Properties;
import properties.TestRule;

import static properties.TestRule.driver;
public class MenuLateralMantisPage extends MenuLateralMantisElementMap {

    public MenuLateralMantisPage(){
        PageFactory.initElements(TestRule.getDriver(),this);
    }

    public void acessoAFuncionalidadeMinhaVisaoNoMenuLateral(){
        btnMinhaVisao.click();
    }

    public void validareiQueAFuncionalidadeMinhaVisãoFoiAcessadaComSucesso(){
        Assert.assertTrue(btnRelatadosPorMim.isDisplayed());
    }

    public void acessoAFuncionalidadeVerTarefasNoMenuLateral(){
        btnVerTarefas.click();
    }

    public void validareiQueAFuncionalidadeVerTarefasFoiAcessadaComSucesso() {
        Assert.assertTrue(lblVisualizandoTarefas.isDisplayed());
    }

    public void acessoAFuncionalidadeCriarTarefasNoMenuLateral() {
        btnCriarTarefa.click();
    }

    public void validareiQueAFuncionalidadeCriarTarefasFoiAcessadaComSucesso() {
        Assert.assertTrue(lblDigiteOsDetalhesDoRelatório.isDisplayed()); // alterar o elemento
    }

    public void acessoAFuncionalidadeRegistroDeMudancaNoMenuLateral() {
        btnRegistroDeMudanca.click();
    }

    public void validareiQueAFuncionalidadeRegistroDeMudancaFoiAcessadaComSucesso() {
        Assert.assertTrue(lblNaoHaInformacoes.isDisplayed());
    }

    public void acessoAFuncionalidadePlanejamentoNoMenuLateral() {
        btnPlanejamento.click();
    }

    public void validareiQueAFuncionalidadePlanejamentoFoiAcessadaComSucesso() {
        Assert.assertTrue(lblNenhumaInformaçãoDisponível.isDisplayed());
    }








}
