/**
 * @auther Rakesh
 * @time Sep 3, 2016
 */

package com.rkumbhare.app.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] list = new int[]{4, 3, 6, 8, 2, 5, 7, 0, 9, 1};
		System.out.println(Arrays.toString(list));
		bubbleSort(list);
		System.out.println(Arrays.toString(list));
	}

	private static void bubbleSort(int[] list) {
		boolean swap = true;
		int iteration = 0;

		while (swap) {
			swap = false;
			iteration++;
			for (int i = 0; i < list.length - iteration; i++) {
				if (list[i] > list[i + 1]) {
					swap(i, i + 1, list);
					swap = true;
				}
			}
		}
	}

	private static void swap(int i, int j, int[] list) {
		int tmp = list[i];
		list[i] = list[j];
		list[j] = tmp;
	}

}
