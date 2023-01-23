class Solution {
    public String defangIPaddr(String address) {
        StringBuilder myString = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                myString.append("[.]");
            } else {
                myString.append(address.charAt(i));
            }
        }
        return myString.toString();
        
    }
}

