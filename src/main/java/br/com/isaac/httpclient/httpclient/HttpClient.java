package br.com.isaac.httpclient.httpclient;

import java.net.HttpURLConnection;
import java.util.function.Function;

import br.com.isaac.httpclient.httpclient.reactive.Observable;
import br.com.isaac.httpclient.httpclient.reactive.Subject;

public class HttpClient {

	private HttpClientExecutor executor = new HttpClientExecutor();

	public <T> Observable<T> get(String apiUrl, Class<T> clazz) {

		return request(r -> r.get(apiUrl), clazz);
	}

	private <T> Observable<T> request(Function<Resquest, Response> function, Class<T> clazz) {
		
		Subject<T> subject = new Subject<T>();

		executor.toRequest(() -> {
			Resquest request = new Resquest();
			Response response = function.apply(request);
			if (response.getStatus() == HttpURLConnection.HTTP_OK) {
				T t = response.parse(clazz);
				subject.next(t);
			} else {
				subject.nextError(response);
			}
		});

		return subject.asObservable(true);
	}

}
