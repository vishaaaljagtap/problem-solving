class Solution {
    public int threeSumMulti(int[] arr, int target) {
        Arrays.sort(arr);
        long resultCount = 0L;
        int size = arr.length;

        for (int i = 0; i < size - 2; i++) {
            int l = i + 1;
            int r = size - 1;

            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];
                if (sum == target) {
                    if (arr[l] == arr[r]) {
                        long n = r - l + 1;
                        resultCount += (n * (n - 1)) / 2;
                        break;
                    }
                    int l_count = 1;
                    int r_count = 1;
                    while (l + 1 < r && arr[l] == arr[l + 1]) {
                        l++;
                        l_count++;
                    }
                    while (r - 1 > l && arr[r] == arr[r - 1]) {
                        r--;
                        r_count++;
                    }
                    resultCount += (long) l_count * r_count;
                    l++;
                    r--;
                } else if (sum < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return (int) (resultCount % ((long) Math.pow(10, 9) + 7));
    }
}