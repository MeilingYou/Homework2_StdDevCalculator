import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        // Ask for file paths
        System.out.print("Enter input file path: ");
        String inputFile = input.nextLine();

        System.out.print("Enter output file path: ");
        String outputFile = input.nextLine();

        // Ask for number of values
        System.out.print("Enter number of values to read: "); 
        int size = input.nextInt();

        double[] first = new double[size];
        double[] second;

        // Read data from input file
        readData(size, first, inputFile);

        // Create PrintWriter for output file
        PrintWriter out = new PrintWriter(outputFile);

        out.println("Here is the original array:");
        printArray(size, first, out);

        double avg1 = findAverage(size, first); 
        out.printf("\nAverage of original array: %.2f\n\n", avg1);

        second = howFarAway(size, avg1, first);

        out.println("Here is the new array (difference from average):");
        printArray(size, second, out);

        double avg2 = findAverage(size, second);
        out.printf("\nAverage of new array: %.2f\n\n", avg2);

        Arrays.sort(first);
        Arrays.sort(second);

        out.println("Sorted original array:");
        printArray(size, first, out);

        out.println("\nSorted difference array:");
        printArray(size, second, out);

        out.close();
        System.out.println("Done. Results written to: " + outputFile);
    }

    // Read data into array from input file
    public static void readData(int n, double[] numbers, String inputFile) throws IOException {
        Scanner file = new Scanner(new File(inputFile));
        for (int i = 0; i < n && file.hasNextDouble(); i++) {
            numbers[i] = file.nextDouble();
        }
        file.close();
    }

    // Print array values 5 per line
    public static void printArray(int q, double[] numb, PrintWriter out) {
        for (int i = 0; i < q; i++) {
            out.printf("%10.2f", numb[i]);
            if ((i + 1) % 5 == 0) out.println();
        }
        if (q % 5 != 0) out.println();
    }

    // Find average
    public static double findAverage(int k, double[] p) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += p[i];
        }
        return sum / k;
    }

    // Create new array showing how far each value is from the average
    public static double[] howFarAway(int m, double avg, double[] r) {
        double[] s = new double[m];
        for (int i = 0; i < m; i++) {
            s[i] = r[i] - avg;
        }
        return s;
    }
}
