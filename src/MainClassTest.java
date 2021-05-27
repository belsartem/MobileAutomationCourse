import org.junit.Test;

public class MainClassTest extends MainClass {

    MainClass mainClass = new MainClass();

    @Test
    public void testGetClassString() {

        String helloWorld = mainClass.getClassString("Hello, world!");
        String substrUpper = "Hello";
        String substrLower = "hello";

        if (helloWorld.contains(substrUpper)) {
            System.out.println("Строка содержит " + substrUpper);
        }
        else if (helloWorld.contains(substrLower)) {
            System.out.println("Строка содержит " + substrLower);
        }
        else {
            System.out.println(mainClass.testErrorMessage("ОШИБКА! Строка не содержит нужного значения"));
        }
    }
}
