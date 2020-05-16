package utils;

public class CodeExerciseUtil {

    public static void printArray(String description, int[] arrayToPrint, boolean printIndx) {
        print(description + ": ");
        for (int i = 0; i < arrayToPrint.length; i++) {
            if (printIndx) {
                print("[" + i + "]: " + arrayToPrint[i]);
            } else {
                System.out.print(arrayToPrint[i]);
            }
            if (i < arrayToPrint.length - 1) {
                print(", ");
            }
        }
        println("");
    }

    public static void println(String output) {
        System.out.println(output);
    }

    public static void print(String output) {
        System.out.print(output);
    }
}
