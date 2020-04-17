class Solution {
	public int[] replaceElements(int[] arr) {
		if (arr == null) {
			return arr;
		}
		int max = arr[arr.length - 1];
		int temp;
		for (int i = arr.length - 2; i >= 0; i--) {
			temp = arr[i];
			arr[i] = max;
			if (max < temp) {
				max = temp;
			}
		}
		arr[arr.length - 1] = -1;
		return arr;
	}
}
