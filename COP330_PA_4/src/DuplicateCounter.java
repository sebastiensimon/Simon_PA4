import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;

 class DuplicateCounter {
    private int wordCounter;
    private Map<String, Integer> countWords;
    DuplicateCounter() {
        this.countWords = new HashMap<String, Integer>();
    }

    void count(String dataFile) throws FileNotFoundException {
        Scanner input = new Scanner(new File(dataFile));

        while (input.hasNext()) {
            String word = input.next();
            Integer count = countWords.get(word);
            wordCounter++;
            if (count != null) {
                count = count + 1;
            } else {
                count = 1;
            }
            countWords.put(word, count);
        }

    }

    void write(String outputFile) throws IOException
    {
        FileWriter fw=new FileWriter(new File(outputFile));
        for (Map.Entry<String, Integer> entry : countWords.entrySet())
            fw.write(entry.getKey() + " " + entry.getValue()+"\n");

        fw.write("NO of words in the file :"+wordCounter+"\n");
        fw.close();

    }
}


 class Application {

    public static void main(String[] args) throws IOException {
        DuplicateCounter duplicateCount =new DuplicateCounter();
        String path = "C:\\Users\\asti3\\IdeaProjects\\COP330_PA_4\\src\\problem2.txt";
        // call method remove by passing parameter path
        duplicateCount.count(path);

        // call method write to write into outputFile "unique_words.txt
        String outputFilepath = "C:\\Users\\asti3\\IdeaProjects\\COP330_PA_4\\src\\unique_word.txt";
        duplicateCount.write(outputFilepath);

    }

 }
