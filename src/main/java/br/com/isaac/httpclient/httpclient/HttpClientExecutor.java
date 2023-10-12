package br.com.isaac.httpclient.httpclient;

public class HttpClientExecutor {
	
	public void toRequest(Runnable run) {
		new Thread(run).start();
	}
}
