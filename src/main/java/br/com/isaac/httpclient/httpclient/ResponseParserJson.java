package br.com.isaac.httpclient.httpclient;

import com.google.gson.Gson;

class ResponseParserJson implements ResponseParser {

	@Override
	public <T> T parse(String json, Class<T> clazz) {
		
		return new Gson().fromJson(json, clazz);
	}

}
