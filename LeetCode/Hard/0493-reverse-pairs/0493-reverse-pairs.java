class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public int mergeSort(int[] arr, int low, int high) {

        if (low >= high) {
            return 0;
        }

        int mid = low + (high - low) / 2;

        int count = 0;

        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);

        count += countPairs(arr, low, mid, high);

        merge(arr, low, mid, high);

        return count;
    }

    public int countPairs(int[] arr, int low, int mid, int high) {

        int right = mid + 1;
        int count = 0;

        for (int i = low; i <= mid; i++) {

            while (right <= high &&
                   (long) arr[i] > 2L * arr[right]) {
                right++;
            }

            count += right - (mid + 1);
        }

        return count;
    }

    public void merge(int[] arr, int low, int mid, int high) {

        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }

        while (left <= mid) {
            temp.add(arr[left++]);
        }

        while (right <= high) {
            temp.add(arr[right++]);
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}