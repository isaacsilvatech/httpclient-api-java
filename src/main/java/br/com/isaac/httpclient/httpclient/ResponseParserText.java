package br.com.isaac.httpclient.httpclient;

public class ResponseParserText implements ResponseParser {

	@SuppressWarnings("unchecked")
	@Override
	public <T> T parse(String str, Class<T> clazz) {
		return (T) str;
	}
}
