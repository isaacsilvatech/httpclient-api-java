package br.com.isaac.httpclient.httpclient;

interface ResponseParser {

	public <T> T parse(String str, Class<T> clazz);
}
