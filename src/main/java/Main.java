import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {

    public void readFile(String dir) {
        try {
            List<String> lines = Files.readAllLines(Path.of(dir));
            lines.stream().map(s -> checkNumber(s)).forEach(System.out::println);
        } catch (IOException ex) {
            System.out.println("File exception");
        }
    }

    public String checkNumber(String s) {
        int n = 0;
        try {
            n = Integer.parseInt(s);
        } catch (NumberFormatException ex) {
            System.out.println("Check numbers in the file.");
            System.exit(1);
        }
        if (n % 5 == 0 && n % 3 == 0) {
            return "FizzBuzz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        }
        return n+"";
    }

    public String getFile() {
        Scanner in = new Scanner(System.in);
        System.out.println("Directory of file: ");
        return in.next();
    }

}
