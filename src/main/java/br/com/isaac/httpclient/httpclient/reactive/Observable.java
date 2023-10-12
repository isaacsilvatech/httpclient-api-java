package br.com.isaac.httpclient.httpclient.reactive;

import java.util.List;
import java.util.Vector;

public class Observable<T> {

	private Subject<T> parent;
	private boolean autoUnsubscribe;

	private List<SubscriberParam<T>> subscribersParam = new Vector<>();
	private List<SubscriberError<?>> subscribersError = new Vector<>();

	public Observable(Subject<T> parent, boolean autoUnsubscribe) {
		this.parent = parent;
		this.autoUnsubscribe = autoUnsubscribe;
	}

	public void subscribe(SubscriberParam<T> subParam) {
		subscribersParam.add(subParam);
	}

	public <E> void subscribe(SubscriberParam<T> subParam, SubscriberError<E> subError) {
		subscribersParam.add(subParam);
		subscribersError.add(subError);
	}

	public void next(T t) {
		for (int i = 0; i < subscribersParam.size(); i++) {
			SubscriberParam<T> sub = subscribersParam.get(i);
			sub.next(t);
		}
		if (autoUnsubscribe) {
			parent.unsubscribe(this);
		}
	}

	@SuppressWarnings("unchecked")
	public <E> void nextError(E e) {
		for (int i = 0; i < subscribersError.size(); i++) {
			SubscriberError<E> sub = (SubscriberError<E>) subscribersError.get(i);
			sub.next(e);
		}
		if (autoUnsubscribe) {
			parent.unsubscribe(this);
		}
	}

}
