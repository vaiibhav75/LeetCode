class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1 = 0, sum2 = 0;
        int[] ans = new int[2];

        for (int element : aliceSizes) {
            sum1 += element;
        }

        for (int element : bobSizes) {
            sum2 += element;
        }
        
        int diff = (sum2 -sum1)/2;

        Arrays.sort(bobSizes);

        for (int num: aliceSizes) {
            sum1 = 0;
            sum2 = bobSizes.length-1;
            int mid = sum1 + (sum2-sum1)/2 ;
            
            while (sum1 <= sum2 ) {
                if (bobSizes[mid] < num + diff) {
                    sum1 = mid + 1;
                } else if (bobSizes[mid] > num + diff) {
                    sum2 = mid - 1;
                } else {
                    ans[0] = num;
                    ans[1] = bobSizes[mid];
                    return ans;
                }
                mid = sum1 + (sum2-sum1)/2 ;
            }
        }
        return ans;
    }
}


