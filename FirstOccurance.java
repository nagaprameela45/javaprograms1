 class FirstOccurance {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        char targetChar = 'o';

        int firstOccurrenceIndex = findFirstOccurrence(inputString, targetChar);

        if (firstOccurrenceIndex != -1) {
            System.out.println("First occurrence of '" + targetChar + "' at index: " + firstOccurrenceIndex);
        } else {
            System.out.println("Character '" + targetChar + "' not found in the string.");
        }
    }

    public static int findFirstOccurrence(String str, char targetChar) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                return i;
            }
        }
        return -1;
    }
}
