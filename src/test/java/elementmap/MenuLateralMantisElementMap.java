package elementmap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuLateralMantisElementMap {
    @FindBy(css = ".fa-dashboard")
    protected WebElement btnMinhaVisao;
    @FindBy(css = "#reported .white")
    protected WebElement btnRelatadosPorMim;
    @FindBy(css = ".fa-list-alt.menu-icon")
    protected WebElement btnVerTarefas;

    @FindBy(css = "#bug_action .widget-title")
    protected WebElement lblVisualizandoTarefas;

    @FindBy(css = ".fa-edit.menu-icon")
    protected WebElement btnCriarTarefa;
    @FindBy(css = ".widget-title")
    protected WebElement lblDigiteOsDetalhesDoRelatório;

    @FindBy(css = ".fa-retweet")
    protected WebElement btnRegistroDeMudanca;

    @FindBy(css = ".lead")
    protected WebElement lblNaoHaInformacoes;

    @FindBy(css = ".fa-road")
    protected WebElement btnPlanejamento;

    @FindBy(css = ".lead")
    protected WebElement lblNenhumaInformaçãoDisponível;

}
