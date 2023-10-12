package br.com.isaac.httpclient.httpclient;

public class ResponseError extends Response {

	public ResponseError(String message, int status) {
		super(message, status);
	}

	public String getMessage() {
		return  super.status +" - " +  super.message;
	}
	
	@Override
	public String toString() {
		return getMessage();
	}
}
