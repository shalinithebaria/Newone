package com.rakuten.prj.util;

import java.util.Arrays;

/**
 * 
 * @author shalini
 *
 */
public class ArrayUtil {
	/**
	 * 
	 * @param data
	 * @return
	 */
	public static int getSum(int[] data) {
		int x = 0;
		for (int i : data) {
			x += i;

		}
		return x;
	}

	/**
	 * 
	 * @param data
	 * @param no
	 * @return
	 */
	public static int getOccurence(int[] data, int no) {
		int ct = 0;
		for (int i : data) {
			if (i == no) {
				ct++;
				/**
				 * 
				 */
			}
		}
		return ct;
	}

	/**
	 * 
	 * @param data
	 */
	public static void sort(int[] data) {
		Arrays.sort(data);
	}

	/**
	 * 
	 * @param items which are comparable
	 */
	public static void sort(Comparable[] items) {
		for (int i = 0; i < items.length; i++) {
			for (int j = i+1; j < items.length; j++) {
				if (items[i].compareTo(items[j]) > 0) {
					Comparable temp = items[i];
					items[i] = items[j];
					items[j] = temp;
				}

			}

		}
	}
}
