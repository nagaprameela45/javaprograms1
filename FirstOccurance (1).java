class FirstOccurance {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char target = 'h';

        int index = -1; 

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                index = i;
                break; 
            }
        }

        if (index != -1) {
            System.out.println("The first occurrence of '" + target + "' is at index: " + index);
        } else {
            System.out.println("The character '" + target + "' is not found in the string.");
        }
    }
}