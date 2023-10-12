# HttpClient API

Esta API foi projetada para fornecer uma maneira contínua e eficiente de lidar com a comunicação HTTP em seus aplicativos, ao mesmo tempo que adere aos princípios SOLID e aproveita padrões de design como o Adapter e o Observer.

## Visão geral

- **Programação Reativa** : A API é construída sobre os princípios da programação reativa, permitindo que você trabalhe com solicitações HTTP de maneira assíncrona e sem bloqueio. Diga adeus ao inferno dos retornos de chamada e adote uma abordagem mais elegante e eficiente para lidar com solicitações HTTP.

- **Princípios SOLID** : A arquitetura da API é projetada com os princípios SOLID em mente. Ele promove princípios de responsabilidade única, aberto-fechado, substituição de Liskov, segregação de interface e inversão de dependência, tornando a base de código sustentável e extensível.

- **Padrão Observer** : aproveite o padrão Observer para lidar com respostas assíncronas e streaming de dados. Assine as respostas e seja notificado quando os dados estiverem disponíveis ou ocorrer um erro.

- **Conversão automática de JSON** : a API simplifica sua vida convertendo automaticamente as respostas JSON nos tipos de dados desejados. Diga adeus à tediosa análise manual de JSON e concentre-se em usar os dados imediatamente.

# Exemplo

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
