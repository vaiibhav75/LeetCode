class Solution {
    public int[] plusOne(int[] digits) {
        boolean a = true;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] !=9) {
                a = false;
                break;
            }
        }
        if (a) {
            int[] arr = new int[digits.length+1];
            arr[0] = 1;
            for (int i = 1; i < arr.length ; i++) {
                arr[i] = 0;
            }
            return arr;
        } else {
            int[] arr = new int[digits.length];
            for (int i = arr.length-1; i >=0 ; i--) {
                if (digits[i] == 9) {
                    arr[i] = 0;
                }else {
                    arr[i] = digits[i] + 1;
                    for (int j = i-1; j >=0 ; j--) {
                        arr[j] = digits[j];
                    }
                    break;
                }

            }
            return arr;
        }

    }
}
