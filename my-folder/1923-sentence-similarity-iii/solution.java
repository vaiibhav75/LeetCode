class Solution {
    
    public boolean areSentencesSimilar(String sentence1, String sentence2) {

        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();

        StringBuilder word = new StringBuilder();

        for (int i = 0; i < sentence1.length(); i++) {
            char a = sentence1.charAt(i);
            if (a == ' ') {
                arr1.add(word.toString());
                word.setLength(0);
            } else {
                word.append(a);
            }
        }
        arr1.add(word.toString());
        word.setLength(0);

        for (int i = 0; i < sentence2.length(); i++) {
            char a = sentence2.charAt(i);
            if (a == ' ') {
                arr2.add(word.toString());
                word.setLength(0);
            } else {
                word.append(a);
            }
        }
        arr2.add(word.toString());
        word.setLength(0);


        int j = 0;
        int i = 0;



        int minLength = Math.min(arr1.size(), arr2.size());

        while (i < minLength && arr1.get(i).equals(arr2.get(i))) {
            i++;
        }

        int k1 = arr1.size() - j -1;
        int k2 = arr2.size() - j -1;

        while (k1 >= 0 && k2>= 0 && arr1.get(k1).equals(arr2.get(k2))) {
            j++;
            k1 = arr1.size() - j -1;
            k2 = arr2.size() - j -1;
        }

        return (i+j >= arr1.size() || i + j >= arr2.size());

    }
}

