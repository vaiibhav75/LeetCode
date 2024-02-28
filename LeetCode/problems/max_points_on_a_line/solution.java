class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        // String[][] point = new String[n][n];
        HashMap<String,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                String ans = slope(points[i],points[j]) + " " + c(points[i],points[j]);
                if (points[j][0] == points[i][0]) {
                    ans = "x " + points[j][0];
                }

                if (points[j][1] == points[i][1]) {
                    ans = "y " + points[j][1];
                }

                if (ans.equals("1/2 1/1")) {
                    System.out.println("-->  "+i + "  " + j);

                }

                map.put(ans,map.getOrDefault(ans,0) +1);
            }
        }
        int ans = 1;
        for (String x: map.keySet()) {
            int y = map.get(x);
            // y*= 2;
            int l = (int) Math.sqrt(y);
            while ((l)*(l-1) < y) {
                l++;
            }
            System.out.println(x + " --> " + l);
           ans = Math.max(ans,l);
        }

        return ans;
    }

    static String slope (int[] a, int[] b) {
        int y = b[1] - a[1];
        int x = b[0] - a[0];
        return parse(x,y);

    }

    static String parse (int x, int y) {
        if (x == 0) {
            return "#";
        }

        if (y == 0) {
            return "0";
        }

        int gcd = gcd(Math.abs(y),Math.abs(x));
        y/= gcd;
        x/= gcd;

        if (y*x > 0) {
            return Math.abs(y) + "/" + Math.abs(x);
        } else {
            return "-" + Math.abs(y) + "/" + Math.abs(x);
        }
    }

    static String c (int[] a, int [] b) {
        int y = b[0]*a[1] - b[1]*a[0];
        int x = b[0] - a[0];

        return parse(x,y);
    }

    static int gcd (int a, int b) {

        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
}
