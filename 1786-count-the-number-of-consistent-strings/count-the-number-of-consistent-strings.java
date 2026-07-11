//import java.util.HashSet;

class Solution {

    public int countConsistentStrings(String allowed, String[] words) {

        HashSet<Character> set = new HashSet<>();

        // Store allowed characters
        for (char ch : allowed.toCharArray()) {
            set.add(ch);
        }

        int count = 0;

        // Check every word
        for (String word : words) {

            boolean isConsistent = true;

            for (char ch : word.toCharArray()) {

                if (!set.contains(ch)) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) {
                count++;
            }
        }

        return count;
    }
}