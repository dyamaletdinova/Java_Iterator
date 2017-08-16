/**
 * 
 */
package functor;

import java.util.Iterator;

import collection.MyVector;

/**
 * The View class implements Iterable interface and overriddes the iterator() method
 * to return the completeIterator (Functor f) that accepts Functor. 
 * If we do not overridde the iterator() than when we call the iterator method from the MyVector class,
 * it will make a call to the Vector's default iterator () method that does not accepts any args
 * 
 * @author Diana Yamaletdinova
 * @param <T> type of the Functor
 * @param <R> return type of the Functor
 * Jan 21, 2017
 */
public class FunctorView<T, R>  implements Iterable<T>{
	
	private MyVector<T> myVector = new MyVector<>();
	private Functor<T, R> functor;
	
	public FunctorView(MyVector<T> myVector, Functor<T, R> functor) {
		this.myVector = myVector;
		this.functor = functor;
	}

	@Override
	public Iterator<T> iterator() {
		return myVector.completeIterator(functor);
	}

}
