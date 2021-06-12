import java.lang.reflect.Method;

public class MainApp {
    public static void main(String[] args) {
        Main main = new Main();
        String dir = main.getFile();
        main.readFile(dir);
            }
}
