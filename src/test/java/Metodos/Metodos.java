package Metodos;

import org.junit.runner.Request;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class Metodos {
	
	
	private Response response;
	private Request request;
	public void servicoBusca (String cpf) {
		String get = "http://localhost:8888/api/v1/restricoes/" + cpf;
		response = RestAssured.request(Method.GET, get);
		System.out.println("Esse é o status code: " + response.statusCode());
		System.out.println(response.asString());
		System.out.println(response.statusCode() == 200);
		
	}

}
