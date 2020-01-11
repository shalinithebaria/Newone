package com.rakuten.prj.client;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LamdaExample {

	public static void main(String[] args) {
		Function<Integer, Double> f1 = new Function<Integer, Double>() {

			@Override
			public Double apply(Integer t) {
				return t / 2.0;
			}

		};
		System.out.println(f1.apply(5));

		// lambdafunction:
		Function<Integer, Double> f2 = (Integer t) -> {
			return t / 2.0;
		};
		System.out.println(f2.apply(10));
		Function<Integer, Double> f3 = t -> t / 2.0;
		System.out.println(f3.apply(6));

		// BiFunction:
		BiFunction<Integer, Double, Integer> b1 = new BiFunction<Integer, Double, Integer>() {

			@Override
			public Integer apply(Integer t, Double u) {
				return (int) (t + u);
			}

		};
		System.out.println(b1.apply(10, 2.0));

		BiFunction<Integer, Double, Integer> b2 = (t, u) -> (int) (t + u);
		System.out.println(b2.apply(12, 2.0));

	}
}
