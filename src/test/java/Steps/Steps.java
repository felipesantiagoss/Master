package Steps;

import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends Metodos {
	
	
	@Given("que realize uma consulta no servico")
	public void que_realize_uma_consulta_no_servico() {
	   
	}

	@When("passar um CPF valido {string}")
	public void passar_um_cpf_valido(String cpf) {
	servicoBusca(cpf);   
	}

	@Then("valido o retorno da consulta")
	public void valido_o_retorno_da_consulta() {
	   
	}

}
