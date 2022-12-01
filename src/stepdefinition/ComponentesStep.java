package stepdefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.Componentes;

public class ComponentesStep {
    Componentes componentes = new Componentes();

    @Dado("que o usuário acessou o arquivo Componente.html e irá realizar o preenchimento dos dados")
    public void que_o_usuário_acessou_o_arquivo_Componente_html_e_irá_realizar_o_preenchimento_dos_dados() {
        componentes.inicializar();
    }

    //Preenchimento do formulario
    @Quando("o usuário digitar Nome no textfield")
    public void o_usuário_digitar_Nome_no_textfield() {
        componentes.digitarNomeTextField();
    }

    @E("o usuário digitar o Sobrenome no textfield")
    public void o_usuário_digitar_o_Sobrenome_no_textfield() {
        componentes.digitarSobreNomeTextField();
    }

    @E("o usuário selecionar o Sexo no radiobutton")
    public void o_usuário_selecionar_o_Sexo_no_radiobutton() {
        componentes.clicarSexoRadioButton();
    }

    @E("o usuário selecionar uma ou mais Comida no checkbox")
    public void o_usuário_selecionar_uma_ou_mais_Comida_no_checkbox() {
        componentes.clicarComidaCheckBox();
    }

    @E("o usuário selecionar a Escolaridade no combobox")
    public void o_usuário_selecionar_a_Escolaridade_no_combobox() {
        componentes.clicarEscolaridadeComboBox();
    }

    @E("o usuário selecionar um ou mais Esportes no listbox")
    public void o_usuário_selecionar_um_ou_mais_Esportes_no_listbox() {
        componentes.clicarEsporteLisBox();
    }

    //Clicar botão cadastra
    @Então("o usuário deve clicar no botão Cadastrar")
    public void o_usuário_deve_clicar_no_botão_Cadastrar() {
        componentes.clicarBotãoSalvar();
    }

    //validação do preenchimento após cadastro.
    @E("deve ser validado o nome digitado no textfield")
    public void deve_ser_validado_o_nome_digitado_no_textfield() {
        componentes.validarNomeTextField();
    }

    @E("deve ser validado o sobrenome digitado no textfield")
    public void deve_ser_validado_o_sobrenome_digitado_no_textfield() {
        componentes.validarSobreNomeTextField();
    }

    @E("deve ser validado o sexo selecionado no radiobutton")
    public void deve_ser_validado_o_sexo_selecionado_no_radiobutton() {
        componentes.validarRadioButton();
    }

    @E("deve ser validado uma ou mais comidas selecionadas no checkbox")
    public void deve_ser_validado_uma_ou_mais_comidas_selecionadas_no_checkbox() {
        componentes.validarCheckBox();
    }

    @E("deve ser validado a escolaridade selecionada no combobox")
    public void deve_ser_validado_a_escolaridade_selecionada_no_combobox() {
        componentes.validarComboBox();
    }

    @E("deve ser validado um ou mais esportes selecionados no listbox")
    public void deve_ser_validado_um_ou_mais_esportes_selecionados_no_listbox() {
        componentes.validarListBox();
        componentes.fecharNavegador();
    }

    //Validação regra de negócio obrigação campo Nome Textfield
    @Quando("usuário não preencher o textfield com nome")
    public void usuário_não_preencher_o_textfield_com_nome() {
        componentes.clicarBotãoSalvar();
    }

    @Então("deve apresentar alerta informando Nome eh obrigatorio")
    public void deve_apresentar_alerta_informando_Nome_eh_obrigatorio() {
        componentes.validarObrigatoriedadeNomeTextField();
        componentes.fecharNavegador();
    }

    //Validação regra de negócio obrigação campo Sobrenome Textfield
    @Quando("usuário não preencher o textfield com sobrenome")
    public void usuário_não_preencher_o_textfield_com_sobrenome() {
        componentes.digitarNomeTextField();
        componentes.clicarBotãoSalvar();
    }

    @Então("deve apresentar alerta informando Sobrenome eh obrigatorio")
    public void deve_apresentar_alerta_informando_Sobrenome_eh_obrigatorio() {
        componentes.validarObrigatoriedadeSobreNomeTextField();
        componentes.fecharNavegador();
    }

    //Validação regra de negócio obrigação campo Sexo RadioButton
    @Quando("usuário não selecionar o radiobutton do sexo")
    public void usuário_não_selecionar_o_radiobutton_do_sexo() {
        componentes.digitarNomeTextField();
        componentes.digitarSobreNomeTextField();
        componentes.clicarBotãoSalvar();
    }

    @Então("deve apresentar alerta informando Sexo eh obrigatorio")
    public void deve_apresentar_alerta_informando_Sexo_eh_obrigatorio() {
        componentes.validarObrigatoriedadeSexoRadioButton();
        componentes.fecharNavegador();
    }

}
