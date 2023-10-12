package br.com.isaac.httpclient.httpclient;

import java.io.InputStream;
import java.util.Scanner;

class ResponseScanner {

	private Scanner sc;
	private ResponseParser parser;
	
	public ResponseScanner(InputStream in) {
		this.sc = new Scanner(in);
	}

	public ResponseScanner(InputStream in, ResponseParser parser) {
		this.parser = parser;
		this.sc = new Scanner(in);
	}

	public <T> T getData(Class<T> clazz) {

		StringBuilder data = new StringBuilder();

		while (sc.hasNext()) {
			data.append(sc.nextLine());
		}

		return parser.parse(data.toString(), clazz);

	}

}
