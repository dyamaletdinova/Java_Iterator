package client;
/**
 * 
 */


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import collection.MyVector;
import functor.AverageFunctor;
import functor.Functor;
import functor.SumFunctor;

/**
 *
 * @author Diana Yamaletdinova
 *
 * Jan 21, 2017
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Client main = new Client();

		MyVector<Integer> myVector = new MyVector<>();
		for (int i = 1; i <= 10; i++) {
			myVector.add(i);
		}
		System.out.println(myVector);

		main.internalSumFunctor(myVector);
		main.internalAverageFunctor(myVector);
	}

	public void internalSumFunctor(MyVector<Integer> myVector) {
		Functor<Integer, Integer> sumFunctor = new SumFunctor();
		myVector.doAll(sumFunctor);
		System.out.println("Internal Sum Functor:" + sumFunctor.getValue());
	}
	
	public void internalAverageFunctor(MyVector<Integer> myVector) {
		Functor<Integer, Float> averFunctor = new AverageFunctor();
		myVector.doAllAver(averFunctor);
		System.out.println("Internal Average Functor:" + averFunctor.getValue());
	}

}
