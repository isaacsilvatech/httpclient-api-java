package br.com.isaac.httpclient.httpclient;

public class Response {

	protected int status;
	protected String message;
	protected ResponseScanner rs;

	public Response(ResponseScanner rs, int status) {
		this.rs = rs;
		this.status = status;
	}

	public Response(String message, int status) {
		this.message = message;
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public <T> T parse(Class<T> clazz) {
		return rs.getData(clazz);
	}
	
}
