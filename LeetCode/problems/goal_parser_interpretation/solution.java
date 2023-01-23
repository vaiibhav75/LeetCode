class Solution {
    public String interpret(String command) {
        StringBuilder myString = new StringBuilder();
        int i = 0;
        while ( i < command.length() ) {
            if (command.charAt(i) == 'G') {
                myString.append("G");
                i++;
            } else if (command.charAt(i) == '(') {
                if (command.charAt(i+1) == ')') {
                    myString.append('o');
                    i += 2;
                } else {
                    myString.append("al");
                    i+= 4;
                }
            }
        }
        return myString.toString();
    }
}