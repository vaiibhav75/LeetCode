class Solution {
    public boolean checkIfPangram(String sentence) {
        String[] strArr = sentence.split("");
        char[] arr = new char[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = strArr[i].toLowerCase().charAt(0);
        }
        boolean a = true;
        for (char i = 97; i <= 122 ; i++) {
            
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    a = true ;
                    break;
                }else {
                    a = false;
                }
            }
            if (!a) {
                return false;
            }
        }
        return true;
        
    }
}
