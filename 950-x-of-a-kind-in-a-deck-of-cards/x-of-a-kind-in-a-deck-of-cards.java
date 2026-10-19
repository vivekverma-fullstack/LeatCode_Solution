
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];

        for (int num : deck) {
            count[num]++;
        }

        int gcd = 0;

        for (int c : count) {
            if (c > 0) {
                gcd = findGCD(gcd, c);
            }
        }

        return gcd >= 2;
    }

    int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
