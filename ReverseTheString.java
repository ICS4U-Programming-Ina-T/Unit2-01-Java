import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * The ReverseTheString program implements an application that
 * reads a text file into the program, and uses recursion to
 * reverse the strings, and place them in an output file.
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-3-28
 */

class ReverseTheString {
    /**
     * This function uses recursion to reverse a string.
     *
     * @param stringValue passed in
     * @return returnValue back to main
     */
    public static String reverse(String stringValue) {
        String newString = "";

        if ("".equals(stringValue)) {
            newString = stringValue;
        } else {
            newString = reverse(stringValue.substring(0 + 1))
                + stringValue.substring(0, 1);
        }
        return newString;
    }

    /**
     * Main entry into the program.
     *
     * @param args nothing passed in
     */
    public static void main(String[] args) {
        System.out.println("The strings in the input file will be reversed.");
        System.out.println();

        // declaring variables
        List<String> listOftrings = new ArrayList<String>();
        final String[] stringsArrayFile;
        final String[] reversedStringsArray;
        final BufferedWriter writer;
        final StringBuilder builder;
        final List<String> reversedStringsList = new ArrayList<String>();
        String newStringUser;

        // reads contents of file into list
        try {
            listOftrings = Files.readAllLines(Paths.get("input.txt"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        // converts contents of list to an array
        stringsArrayFile = listOftrings.toArray(new String[0]);
        try {
            // calls function and passes each individual element in the array
            for (int loopCounter = 0; loopCounter
                < stringsArrayFile.length; loopCounter++) {
                newStringUser = reverse(stringsArrayFile[loopCounter]);
                reversedStringsList.add(newStringUser);
            }

            // converts list of reversed strings to an array
            reversedStringsArray = reversedStringsList.toArray(new String[0]);

            // adds the new reversed strings to the output file
            builder = new StringBuilder();
            for (int formatCounter = 0; formatCounter
                < reversedStringsArray.length; ++formatCounter) {
                builder.append(reversedStringsArray[formatCounter]);
                if (formatCounter != reversedStringsArray.length - 1) {
                    builder.append("\n");
                }
            }

            writer =
                new BufferedWriter(new FileWriter(
                    "/home/ubuntu/environment"
                    + "/Unit2/Unit2-01/Unit2-01"
                    + "-Java/output.txt"));
            writer.write(builder.toString());
            writer.close();

            // displays alert saying the strings have been reversed
            System.out.println("Done reversing. Check the output file.");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
