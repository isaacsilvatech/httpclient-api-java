package br.com.isaac.httpclient.httpclient;

public enum ResponseType {

	APPLICATION_JSON {
		@Override
		protected  ResponseParser getParser() {
			return new ResponseParserJson();
		}
	},
	APPLICATION_TEXT {
		@Override
		protected  ResponseParser getParser() {
			return new ResponseParserText();
		}
	};

	protected abstract ResponseParser getParser();
}
