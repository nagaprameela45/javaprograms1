// Complete and execute java Program for Narrow/Explicit Type-casting
 class Sample1 {
    public static void main(String[] args) {
        // Widening or implicit type-casting
        int intNumber = 100;
        double doubleNumber = intNumber; // int to double (no explicit casting needed)
        System.out.println("Widening Type Casting:");
        System.out.println("intNumber: " + intNumber);
        System.out.println("doubleNumber: " + doubleNumber);

        // Narrowing or explicit type-casting
        double doubleValue = 123.456;
        int intValue = (int) doubleValue; // double to int (explicit casting required)
        System.out.println("\nNarrowing Type Casting:");
        System.out.println("doubleValue: " + doubleValue);
        System.out.println("intValue: " + intValue);
    }
}