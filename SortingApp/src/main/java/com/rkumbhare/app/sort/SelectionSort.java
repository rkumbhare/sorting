/**
 * @auther Rakesh
 * @time Sep 3, 2016
 */

package com.rkumbhare.app.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] list = new int[]{4, 3, 6, 8, 2, 5, 7, 0, 9, 1};
		System.out.println(Arrays.toString(list));
		selectionSort(list);
		System.out.println(Arrays.toString(list));
	}

	private static void selectionSort(int[] list) {
		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] > list[j]) {
					swap(i, j, list);
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
