/**
 * 
 */
package functor;

/**
 *
 * @author Diana Yamaletdinova
 *
 * Jan 21, 2017
 */
public class SumFunctor implements Functor<Integer, Integer>{

	Integer sum = 0;

	@Override
	public Integer compute(Integer element) {
		sum = sum + element;		
		return sum;
	}


	@Override
	public Integer getValue() {
		return sum;
	}

	

}
