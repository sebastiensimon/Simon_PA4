// DuplicateRemove class

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


class DuplicateRemover {

    private String[] uniqueWords;

    void remove(String dataFile) {

        try {
            File file = new File(dataFile);
            try (Scanner scanner = new Scanner(file)) {

                scanner.useDelimiter("\\Z");

                Set<String> stringSet = new LinkedHashSet<String>(Arrays.asList(scanner.next().split("\\s+")));
                for (String s : uniqueWords = stringSet.toArray(new String[0])) {

                }

                scanner.close();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found found exception occurred");
        }


    }

    void write(String outputFile) {

        try {
            // Open the file outputFile in which we want to write the unique words
            FileWriter fw = new FileWriter(outputFile);

            // convert the array uniqueWords to string of word separated by a space
            String wordString = String.join(" ", uniqueWords);

            // now write wordString into file
            fw.write(wordString);

            // close the file writer fw
            fw.close();
        } catch (Exception e) {
            System.out.println("Could not open file" + outputFile + "for writing");
        }
    }
}
// Application class


class Application {

    public static void main(String[] args) {

        // Create an object of class DuplicateRemove
        DuplicateRemover duplicateRemove = new DuplicateRemover();

        // get the path of text file
        String path = "C:\\Users\\asti3\\IdeaProjects\\programming_assignment_4_problem_1\\probelm1.txt";
        // call method remove by passing parameter path
        duplicateRemove.remove(path);

        // call method write to write into outputFile "unique_words.txt
        String outputFilepath = "C:\\Users\\asti3\\IdeaProjects\\\\src\\unique_words.txt";
        duplicateRemove.write(outputFilepath);

    }

}
