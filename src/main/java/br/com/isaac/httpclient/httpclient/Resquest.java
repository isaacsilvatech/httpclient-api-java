package br.com.isaac.httpclient.httpclient;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

class Resquest {
	
	public Response get(String apiUrl) {

		try {
			URL url = new URL(apiUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(15000);
			connection.setRequestProperty("Content-Type", "application/json");
			connection.connect();

			if(connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
				ResponseParser parser = ResponseType.APPLICATION_JSON.getParser();
				ResponseScanner scanner = new ResponseScanner(connection.getInputStream(), parser);
				return new Response(scanner, connection.getResponseCode());
			}
			
			return new ResponseError(connection.getResponseMessage(), connection.getResponseCode());
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
