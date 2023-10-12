# HttpClient API

## Visão geral

- **Programação Reativa** : A API é construída sobre os princípios da programação reativa, permitindo que você trabalhe com solicitações HTTP de maneira assíncrona e sem bloqueio. Diga adeus ao inferno dos retornos de chamada e adote uma abordagem mais elegante e eficiente para lidar com solicitações HTTP.

# Uso

```
public class HttpClientTest {

	public static final String API_URL = "https://viacep.com.br/ws/72110025/json/";

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
```
