class LastOccurance {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        char targetChar = 'o';

        int lastOccurrenceIndex = findLastOccurrence(inputString, targetChar);

        if (lastOccurrenceIndex != -1) {
            System.out.println("Last occurrence of '" + targetChar + "' at index: " + lastOccurrenceIndex);
        } else {
            System.out.println("Character '" + targetChar + "' not found in the string.");
        }
    }

    public static int findLastOccurrence(String str, char targetChar) {
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == targetChar) {
                return i;
            }
        }
        return -1;
    }
}
