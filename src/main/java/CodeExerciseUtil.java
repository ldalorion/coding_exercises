import java.util.List;

public class CodeExerciseUtil {

    public static void printArray(String description, int[] arrayToPrint, boolean printIndx) {
        System.out.print(description + ": ");
        for (int i = 0; i < arrayToPrint.length; i++) {
            if (printIndx) {
                System.out.print("[" + i + "]: " + arrayToPrint[i] + ", ");
            } else {
                System.out.print(arrayToPrint[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void printArray(String description, List<Integer> listToPrint, boolean printIndx) {
        System.out.print(description + ": ");
        for (int i = 0; i < listToPrint.size(); i++) {
            if (printIndx) {
                System.out.print("[" + i + "]: " + listToPrint.get(i) + ", ");
            } else {
                System.out.print(listToPrint.get(i) + ", ");
            }
        }
        System.out.println();
    }
}
