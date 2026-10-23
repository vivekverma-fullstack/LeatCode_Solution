
class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        int h1 = 0;
        int h2 = 0;

        int r = red;
        int b = blue;

        // Start with red
        for (int i = 1; ; i++) {
            if (i % 2 == 1) {
                if (r < i) break;
                r -= i;
            } else {
                if (b < i) break;
                b -= i;
            }
            h1++;
        }

        r = red;
        b = blue;

        // Start with blue
        for (int i = 1; ; i++) {
            if (i % 2 == 1) {
                if (b < i) break;
                b -= i;
            } else {
                if (r < i) break;
                r -= i;
            }
            h2++;
        }

        return Math.max(h1, h2);
    }
}
