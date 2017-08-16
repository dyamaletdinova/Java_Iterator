/**
 * 
 */
package predicate;

/**
 * Predicate Interface used in MyVector class for external selection iteration
 * @author Diana Yamaletdinova
 *
 * @param <T> the type of the function
 * Jan 21, 2017
 */
public interface Predicate <T>{
	public boolean isValid(T element);
}
