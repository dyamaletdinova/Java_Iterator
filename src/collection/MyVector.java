package collection;

import java.util.Iterator;
import java.util.Vector;

import functor.Functor;
import functor.FunctorView;
import iter.CompleteIterator;

public class MyVector<T> extends Vector<T> {
	public MyVector() {
	}
/*
 * THIS IS AN ITERATOR METHOD
 * we create it because we need to have out own iterator method that takes a Functor as an argument
 * but because Vector and MyVector essentialy the same interface, when we will call iterator() it will give the Vector's method
 * Thus we need to create a View class that implements Java's Iterable interface 
 * and overridde the iterator() to return myVector.completeIterator(functor);
 */
	public <R> Iterator <T> completeIterator (Functor<T, R> functor){
		return new CompleteIterator<>(this, functor);	
	}
	
	/*take a single argument which is the functor that encapsulated the processing for each 
	 * element in the loop.
	 * */
	public <R> void doAll(Functor<T, R> functor) {
		FunctorView<T, R> view = new FunctorView<>(this, functor);
		Iterator it = view.iterator();
		while (it.hasNext()){
			T t = (T) it.next();
			functor.compute(t);
		}
	}
	
	public <R> void doAllAver(Functor<T, R> functor) {
		FunctorView<T, R> view = new FunctorView<>(this, functor);
		Iterator it = view.iterator();
		while (it.hasNext()){
			T t = (T) it.next();
			functor.compute(t);
		}
	}
}
