package br.com.isaac.httpclient.httpclient;

import java.net.HttpURLConnection;

import br.com.isaac.httpclient.httpclient.reactive.Observable;
import br.com.isaac.httpclient.httpclient.reactive.Subject;

public class HttpClient {
	
	private HttpClientExecutor executor = new HttpClientExecutor();

	public <T> Observable<T> get(String apiUrl, Class<T> clazz) {
		
		Subject<T> subject = new Subject<T>();
		
		executor.toRequest(() -> {
			Resquest request = new Resquest();
			Response response = request.get(apiUrl);
			if(response.getStatus() == HttpURLConnection.HTTP_OK) {
				T t = response.parse(clazz);
				subject.next(t);
			} else {
				subject.nextError(response);
			}
		});

		return subject.asObservable(true);
	}

}
