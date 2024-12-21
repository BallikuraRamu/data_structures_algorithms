package datastructures_algorithms;

public class BinarySearch {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int target = 9;
		int low = 0;
		int high = array.length - 1;
		System.out.println(binary(array, low, high, target));
	}

	public static int binary(int[] array, int low, int high, int target) {
		if (low > high) {
			return -1;
		}
		int mid = low + (high - low) / 2;
		if (array[mid] == target) {
			return mid;
		} else if (array[mid] > target) {
			return binary(array, low, target, mid - 1);
		} else {
			return binary(array, mid + 1, high, target);
		}
	}
}
