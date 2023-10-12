package br.com.isaac.httpclient.httpclient.reactive;

import java.util.List;
import java.util.Vector;

public class Subject<T> {

	private List<Observable<T>> observables = new Vector<Observable<T>>();

	public void next(T t) {
		for (int i = 0; i < observables.size(); i++) {
			Observable<T> obs = observables.get(i);
			obs.next(t);
		}
	}

	public Observable<T> asObservable(boolean autoUnsubscribe) {
		Observable<T> obs = new Observable<T>(this, autoUnsubscribe);
		observables.add(obs);
		return obs;
	}

	public <E> void nextError(E error) {
		for (int i = 0; i < observables.size(); i++) {
			Observable<T> obs = observables.get(i);
			obs.nextError(error);
		}
	}

	public void unsubscribe(Observable<T> observable) {
		observables.remove(observable);
	}

}
