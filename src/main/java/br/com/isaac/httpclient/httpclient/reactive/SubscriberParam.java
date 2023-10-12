package br.com.isaac.httpclient.httpclient.reactive;

public interface SubscriberParam<T> {
	
	void next(T t);
}
