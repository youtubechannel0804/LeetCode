class Solution {
	public int[] createTargetArray(int[] nums, int[] index) {
		int[] target = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			target[i] = -1;
		}
		for (int i = 0; i < nums.length; i++) {
			if (target[index[i]] != -1) {
				for (int j = target.length - 2; j >= index[i]; j--) {
					target[j + 1] = target[j];
				}
			}
			target[index[i]] = nums[i];
		}
		return target;
	}
}
