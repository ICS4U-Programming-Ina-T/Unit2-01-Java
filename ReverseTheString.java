import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * The ReverseTheString program implements an application that
 * reads a text file into the program, and uses recursion to reverse
 * the strings, and place them in an output file.
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-3-28
 */
 
 class ReverseTheString {
     public static String reverse(String[] stringsList) {
         
     }
     
     /**
      * Main entry into the program
      *
      * @param args nothing passed in
     public static void main(String[] args) {
         // displays opening message
         System.out.println("Strings in the input file will be reversed!")
         
         // declaring variables
         List<String> listOftrings = new ArrayList<String>();
         
        // reads contents of file into list
        try {
            listOftrings = Files.readAllLines(Paths.get("input.txt"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        
        // converts contents of list to an array
        stringsArrayFile = listOftrings.toArray(new String[0]);

        try {
            // function call
            markArrayUser =
            generateMarks(studentArrayFile, assignmentsArrayFile);

            // Add the 2D array to a csv file.
            builder = new StringBuilder();
            for (int rows = 0; rows < markArrayUser[0].length; ++rows) {
                for (int columns = 0; columns
                    < markArrayUser.length; ++columns) {
                    builder.append(markArrayUser[columns][rows]);
                    builder.append("       ");
                }
                builder.append("\n");
            }

            writer =
                new BufferedWriter(new FileWriter(
                    "/home/ubuntu/environment"
                    + "/Unit1/Unit1-07/Unit1-07"
                    + "-Java/marks.csv"));
            writer.write(builder.toString());
            writer.close();

            // displays alert saying marks have been assigned
            System.out.println("Marks have been assigned.");

        } catch (IOException exception) {
            exception.printStackTrace();
        }
     }
 }