/**
 * @auther Rakesh
 * @time Sep 3, 2016
 */

package com.rkumbhare.app.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] list = new int[]{4, 3, 6, 8, 2, 5, 7, 0, 9, 1};
		System.out.println(Arrays.toString(list));
		mergeSort(list);
		System.out.println(Arrays.toString(list));
	}

	private static void mergeSort(int[] list) {
		int low = 0;
		int high = list.length - 1;
		int[] helper = new int[list.length];
		mergeSort(low, high, list, helper);
	}

	private static void mergeSort(int low, int high, int[] list, int[] helper) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			mergeSort(low, mid, list, helper);
			mergeSort(mid + 1, high, list, helper);
			merge(low, mid, high, list, helper);
		}
	}

	private static void merge(int low, int mid, int high, int[] list, int[] helper) {
		for (int i = low; i <= high; i++) {
			helper[i] = list[i];
		}

		int leftI = low;
		int rightI = mid + 1;
		int resultI = low;

		while (leftI <= mid && rightI <= high) {
			if (helper[leftI] < helper[rightI]) {
				list[resultI++] = helper[leftI++];
			} else {
				list[resultI++] = helper[rightI++];
			}
		}

		while (leftI <= mid) {
			list[resultI++] = helper[leftI++];
		}

	}

}
