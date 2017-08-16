package iter;
/**
 * 
 */

import java.util.Iterator;

import collection.MyVector;
import functor.Functor;

/**
 *
 * @author Diana Yamaletdinova
 * @param <R>
 *
 * Jan 21, 2017
 */
public class CompleteIterator<T, R> implements Iterator<T> {

	MyVector<T> myVector;
	private int currentIndex = 0;
	Functor<T,R> functor;

	public CompleteIterator(MyVector<T> myVector, Functor<T,R> functor) {
		this.myVector = myVector;
		this.functor = functor;
	}

	@Override
	public boolean hasNext() {

		int lookahead = currentIndex;
		int functVal = 0; 
		while (lookahead < myVector.size()) {
			if (functor != null){
				functVal = (int) myVector.get(lookahead);
				if (functVal > 2){
					currentIndex = lookahead;
					return true;
				}
			}
			
			lookahead++;
		}
		currentIndex = lookahead;
		return false;
	}

	@Override
	public T next() {
		return (T) myVector.elementAt(currentIndex++);
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Operation is not supported");
	}

}
