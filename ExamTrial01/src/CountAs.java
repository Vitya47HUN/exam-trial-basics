import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountAs {
  public static void main(String[] args) throws IOException {

    reader();
  }

  public static void reader() throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader("C:/Greenfox/Vitya47HUN/exam-trial-basics/ExamTrial01/src/afile.txt"));
    int ch;
    char charToSearch = 'a';
    int counter = 0;
    while ((ch = reader.read()) != -1) {
      if (charToSearch == (char) ch) {
        counter++;
      }
    }
    reader.close();
    System.out.println(counter);
  }
}