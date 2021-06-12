import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {

    private Main main;

    @BeforeEach
    void init() {
        main = new Main();
    }

    @Test
    public void testCheckNumber() {
        Assertions.assertEquals("1", main.checkNumber("1"));
        Assertions.assertEquals("Buzz", main.checkNumber("5"));
        Assertions.assertEquals("Fizz", main.checkNumber("9"));
        Assertions.assertEquals("17", main.checkNumber("17"));
        Assertions.assertEquals("FizzBuzz", main.checkNumber("60"));
    }

    @Test
    public void testReadFile() {
        try {
            main.readFile("C:\\Users\\hp\\IdeaProjects\\JB2_Maven\\Test.txt");
        } catch (Exception ex) {
            Assertions.assertEquals("File exception", ex.getMessage());
            System.exit(1);
        }
        Exception exception = Assertions.assertThrows(NumberFormatException.class, () ->
                main.checkNumber("3cd*"));
        Assertions.assertEquals("Check numbers in the file.", exception.getMessage());
        System.exit(1);
    }
}
