package terminal;

import java.util.*;
import java.lang.*;
import java.io.PrintWriter;
import java.io.File;

public class Terminal {

    public static void main(String[] args) {
        Scanner od = new Scanner(System.in);
        try {
            int b = od.nextInt();
            double c = Math.sqrt(b);
            System.out.println(c);
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal argument exception: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }
        PrintWriter output = null;
        try {
            output = new PrintWriter("testFile.txt");
        } catch (Exception e) {
            String err = e.toString();
            output.println("Error: " + err);
            output.close();
        }
        output.println("Shabat shalom comrade");
        output.close();
    }
}
