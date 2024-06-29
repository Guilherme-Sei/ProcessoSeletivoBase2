package pages;

import elementmap.LoginMantisElementMap;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import properties.Properties;
import properties.TestRule;

import static properties.TestRule.driver;
public class LoginMantisPage extends LoginMantisElementMap {
    public LoginMantisPage(){
        PageFactory.initElements(TestRule.getDriver(),this);
    }
    public void acessoAURLDaPlataforma() {
        driver.get(Properties.getProp().get("prop.url").toString());
    }
    public void preenchoAsInformacoesDeUsuarioESenha(){
        campo_nome_do_usuario.click();
        campo_nome_do_usuario.sendKeys(Properties.getProp().get("prop.user").toString());
        btn_entrar.click();
        campo_senha.click();
        campo_senha.sendKeys(Properties.getProp().get("prop.psw").toString());
        btn_entrar.click();
    }
    public void preenchoComAsInformacoesDeUsuarioESenhaIncorretos(){
        campo_nome_do_usuario.click();
        campo_nome_do_usuario.sendKeys(Properties.getProp().get("prop.user").toString());
        btn_entrar.click();
        campo_senha.click();
        campo_senha.sendKeys(Properties.getProp().get("prop.wpsw").toString());
        btn_entrar.click();
    }
    public void validareiQueOsDadosForamPreenchidosCorretamente() {
        Assert.assertTrue(lbl_relatados_por_mim.isDisplayed());
    }

    public void validareiAMensagemDeErro(String mensagem){
        Assert.assertEquals(mensagem, msg_erro.getText());
    }



    public void validarHome(String mensagem) {
        assert mensagem.equals(msg_erro.getText());
    }
}
