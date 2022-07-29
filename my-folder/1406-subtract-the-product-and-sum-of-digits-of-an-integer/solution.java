 class Solution {
            public int subtractProductAndSum(int n) {
                int dig, sum = 0;
                int prod = 1;
                int i = n;
                while (i != 0) {
                    dig = i % 10;
                    sum = sum + dig;
                    prod = prod * dig;
                    i = i / 10 ;
                }
                int res = prod - sum;
                return res;
                
            }
        }
