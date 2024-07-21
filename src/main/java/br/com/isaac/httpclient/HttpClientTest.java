package br.com.isaac.httpclient;

import br.com.isaac.httpclient.domain.CEP;
import br.com.isaac.httpclient.httpclient.HttpClient;
import br.com.isaac.httpclient.httpclient.ResponseError;

public class HttpClientTest {

	public static final String API_URL = "https://viacep.com.br/ws/72236800/json";

	public static void main(String[] args) {

		HttpClient http = new HttpClient();

		http.get(API_URL, CEP.class).subscribe(cep -> {

			System.out.println(cep);
		});

		http.get(API_URL, CEP.class).subscribe(cep -> {

			System.out.println(cep);

		}, (ResponseError e) -> {

			System.out.println(e);
		});

	}

}
