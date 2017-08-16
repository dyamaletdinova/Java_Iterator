package functor;

/**
 * Functor class is used in MyVector class for the external Computations of the doAll() method
 *
 * @author Diana Yamaletdinova
 *
 * @param <T> the type of the function
 * Jan 21, 2017
 */


public interface Functor<T, R> {
	public R compute(T element);
	public R getValue();
	
	/*	public R compute(T element);
	public R getValue();*/
}
