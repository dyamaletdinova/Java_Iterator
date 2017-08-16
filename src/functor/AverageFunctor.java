/**
 * 
 */
package functor;

/**
 *
 * @author Diana Yamaletdinova
 *
 * Jan 21, 2017
 * @param <R>
 */
public class AverageFunctor implements Functor<Integer, Float>{

	Float sum = 0f;
	Integer numOfElements = 0;

	@Override
	public Float compute(Integer elem) {
		sum = sum + elem;
		numOfElements = numOfElements +1;
		return sum;
	}

	@Override
	public Float getValue() {
		return sum / numOfElements;
	}

}
