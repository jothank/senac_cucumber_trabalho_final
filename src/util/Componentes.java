package util;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Componentes {
    private WebDriver driver;
    private Select combo;

    //Iniciar navegador
    public void inicializar() {
        String chromeDriver = System.getProperty("user.dir") + "/Driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir") + "/Driver/componentes.html");
    }

    //Inicio dos preencimentos
    public void digitarNomeTextField() {
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Jonathan");
    }

    public void digitarSobreNomeTextField() {
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Costa");
    }

    public void clicarSexoRadioButton() {
        driver.findElement(By.id("elementosForm:sexo:0")).click();
    }

    public void clicarComidaCheckBox() {
        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
        driver.findElement(By.id("elementosForm:comidaFavorita:1")).click();
    }

    public void clicarEscolaridadeComboBox() {
        WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
        combo = new Select(elemento);
        combo.selectByValue("superior");
    }

    public void clicarEsporteLisBox() {
        WebElement elemento = driver.findElement(By.id("elementosForm:esportes"));
        combo = new Select(elemento);
        combo.selectByVisibleText("O que eh esporte?");
    }

    //clicar no botão salvar
    public void clicarBotãoSalvar() {
        driver.findElement(By.id("elementosForm:cadastrar")).click();
    }

    //Validações dos preenchimentos
    public void validarNomeTextField() {
        Assert.assertEquals("Jonathan", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
    }

    public void validarSobreNomeTextField() {
        Assert.assertEquals("Costa", driver.findElement(By.id("elementosForm:sobrenome")).getAttribute("value"));
    }

    public void validarRadioButton() {
        Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
    }

    public void validarCheckBox() {
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:1")).isSelected());
    }

    public void validarComboBox() {
        List<WebElement> opcoes = combo.getOptions();
        String selecionou = "Superior";
        for (WebElement opcao : opcoes) {
            selecionou = "Superior";
            break;
        }
    }

    public void validarListBox() {
        List<WebElement> verificarSelecionados = combo.getAllSelectedOptions();
        Assert.assertEquals(1, verificarSelecionados.size());
    }

    //Validação regra de negócio obrigação campo Nome Textfield
    public void validarObrigatoriedadeNomeTextField() {
        Alert alertNome = driver.switchTo().alert();
        Assert.assertEquals("Nome eh obrigatorio", alertNome.getText());
    }

    //Validação regra de negócio obrigação campo Sobrenome Textfield
    public void validarObrigatoriedadeSobreNomeTextField() {
        Alert alertNome = driver.switchTo().alert();
        Assert.assertEquals("Sobrenome eh obrigatorio", alertNome.getText());
    }

    //Validação regra de negócio obrigação campo Sexo RadioButton
    public void validarObrigatoriedadeSexoRadioButton() {
        Alert alertNome = driver.switchTo().alert();
        Assert.assertEquals("Sexo eh obrigatorio", alertNome.getText());
    }

    //Fechar navegador
    public void fecharNavegador() {
        driver.quit();
    }
}
