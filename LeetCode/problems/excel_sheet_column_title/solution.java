class Solution {

    public static void main(String[] args) {
        convertToTitle(52);
    }
    static String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        int val = 0;

        while (columnNumber> 26){

            val = (columnNumber-1)%26 + 'A';
            ans.append((char) val);
            columnNumber = columnNumber/26;
            if (val == 'Z') {columnNumber--;} 
        }
        if (columnNumber != 0) {
            val = columnNumber -1 + 'A';
            ans.append((char) val);
        }

        return (ans.reverse().toString());
    }
}