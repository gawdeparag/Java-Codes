import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class WordCounterInFile {
    public static void main(String[] args) throws IOException {
        String contents = null;
        String filePath = "sample-text-1.txt";
        try {
            contents = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Before Splitting...");
        contents = contents.toLowerCase();
        contents = contents.trim();
        System.out.println(contents);
        String[] words = contents.split(" ");
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        for (String s : words) {
            if (m.containsKey(s)) {
                m.put(s, (Integer) m.get(s) + 1);
            } else {
                m.put(s, 1);
            }
        }
        for (String s : m.keySet()) {
            System.out.println(s + ": " + m.get(s));
        }

    }
}