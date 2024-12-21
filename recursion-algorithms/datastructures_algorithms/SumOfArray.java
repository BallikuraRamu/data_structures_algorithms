package datastructures_algorithms;

public class SumOfArray {

	public static void main(String[] args) {
		int num = 5;
		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println(sum(array, num));
	}

	public static int sum(int[] arr, int n) {
		if (n <= 0) {
			return 0;
		}
		return arr[n - 1] + sum(arr, n-1);
	}

}
