public class CodeExerciseUtil {

    public static void printArray(String description, int[] arrayToPrint, boolean printIndx) {
        System.out.print(description + ": ");
        for (int i = 0; i < arrayToPrint.length; i++) {
            if (printIndx) {
                System.out.print("[" + i + "]: " + arrayToPrint[i]);
            } else {
                System.out.print(arrayToPrint[i]);
            }
            if (i < arrayToPrint.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
