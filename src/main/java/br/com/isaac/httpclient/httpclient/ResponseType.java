package br.com.isaac.httpclient.httpclient;

public enum ResponseType {

	JSON {
		@Override
		protected  ResponseParser getParser() {
			return new ResponseParserJson();
		}
	},
	TEXT {
		@Override
		protected  ResponseParser getParser() {
			return new ResponseParserText();
		}
	};

	protected abstract ResponseParser getParser();
}
