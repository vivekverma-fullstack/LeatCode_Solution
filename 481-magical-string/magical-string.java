
class Solution {
    public int magicalString(int n) {

        if (n == 0) return 0;
        if (n <= 3) return 1;

        int[] arr = new int[n];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 2;

        int count = 1;
        int read = 2;
        int write = 3;
        int num = 1;

        while (write < n) {

            int freq = arr[read];

            for (int j = 0; j < freq && write < n; j++) {

                arr[write] = num;

                if (num == 1) {
                    count++;
                }

                write++;
            }

            num = 3 - num;
            read++;
        }

        return count;
    }
}
