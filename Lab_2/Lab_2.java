import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import Gamepieces.*;

public class Lab_2 {
    public static String[] extractMaze(String filename) {
        ArrayList<String> mazeLines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                mazeLines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return new String[0];
        }

        // Convert ArrayList to array
        return mazeLines.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String filename = "maze.txt";

        // Extract the maze from the file
        String[] maze = extractMaze(filename);

        // Print maze dimensions
        System.out.println("Maze loaded successfully!");
        System.out.println("Number of rows: " + maze.length);

        // Also print as 2D char array visualization
        System.out.println("\nAs 2D character array:");
        System.out.println("=========================");
        for (String row : maze) {
            for (int j = 0; j < row.length(); j++) {
                System.out.print(row.charAt(j));
            }
            System.out.println();
        }
        System.out.println("=========================");
    }

    private static int getMaxLength(String[] array) {
        int max = 0;
        for (String s : array) {
            if (s.length() > max) {
                max = s.length();
            }
        }
        return max;
    }
}
