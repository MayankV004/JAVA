import java.util.HashSet;

class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "aaccbbnmmooaaaabbxmnrwnnmx";
        RemoveDuplicate(s, 0, "", new HashSet<>());
    }

    public static void RemoveDuplicate(String s, int i, String newString, HashSet<Character> seen) {
        if (i == s.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = s.charAt(i);
        if (!seen.contains(currentChar)) {
            newString += currentChar;
            seen.add(currentChar);
        }
        RemoveDuplicate(s, i + 1, newString, seen);
    }
}
