import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

class firstClass{
    public static void main(String[] args) {
    
        System.out.println("hey");
        String fileName = "Week-1/hello_unicode.txt";
        try (Stream<String> stream = Files.lines(Paths.get(fileName).toAbsolutePath())) {
            stream.forEach(System.out::println);
            stream.close();

        }catch (Exception e) {
            System.out.println(e);
        }

    }
}
