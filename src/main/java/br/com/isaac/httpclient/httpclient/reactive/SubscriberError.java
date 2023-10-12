package br.com.isaac.httpclient.httpclient.reactive;

public interface SubscriberError<E> {
	
	void next(E t);
}
