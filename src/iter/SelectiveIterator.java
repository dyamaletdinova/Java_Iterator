package iter;
/**
 * 
 */

import java.util.Iterator;

import collection.MyVector;

/**
 *
 * @author Diana Yamaletdinova
 *
 * Jan 21, 2017
 */
public class SelectiveIterator<T> implements Iterator<T> {

	MyVector<T> myVector = new MyVector<T>();
	private int currentIndex = 0;

	@Override
	public boolean hasNext() {

		int lookahead = currentIndex;

		while (lookahead < myVector.size()) {

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
		throw new UnsupportedOperationException();
	}

}
