class LastOccurance
   {
    public static void main(String[] args) {
        String str = "Hello World";
        char target = 'd';

        int lastIndex = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                lastIndex = i;
            }
        }

        if (lastIndex != -1) {
            System.out.println("Last occurrence of '" + target + "' is at index " + lastIndex);
        } else {
            System.out.println("Character '" + target + "' not found in the string.");
        }
    }
}







