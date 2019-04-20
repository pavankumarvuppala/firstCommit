package com.pavan.ds;

public class RainWatterTrap {

	public static void main(String[] args) {
	
		int[] arr = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
	
		int highest = 0;
		int indexOfh = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			

			if (highest < arr[i]) {

				highest = arr[i];
				indexOfh = i;

				

			}
		}

		int [] leftArr = new int [indexOfh + 1 ];
		int [] rightArr = new int [arr.length  - indexOfh];
		
		for (int i = indexOfh, j = 0; i < arr.length; i++, j++) {

			rightArr[j] = arr[i];
			
		}
		
		
		for (int i = 0; i <= indexOfh ; i++) {

			leftArr[i] = arr[i];
			
		}
		

		int leftSum = calculateLeftSum(leftArr);

		int rightSum = calculateRightSum(rightArr);

		System.out.println("Total water trapped Units is :" + leftSum + rightSum);

	}

	private static int calculateLeftSum(int[] leftarr) {
		// TODO Auto-generated method stub
		
		/*
		 * int pivot = leftarr.length - 1; int nextPivot = leftarr[leftarr.length -2];
		 * for (int i = leftarr.length - 2; i >= 0 ; i --) {
		 * 
		 * if ((leftarr[i] <= pivot && leftarr[i] >= nextPivot)) {
		 * 
		 * nextPivot = leftarr[i];
		 * 
		 * 
		 * } }
		 */
		return 0;
	}

	private static int calculateRightSum(int[] leftarr) {
		// TODO Auto-generated method stub
		return 0;
	}

}
