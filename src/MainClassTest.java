import org.junit.Test;

public class MainClassTest extends MainClass {

    MainClass mainClass = new MainClass();

    @Test
    public void testGetClassNumber() {

        int a = mainClass.getClassNumber(20);

        if (a < 45) {
            System.out.println("Число меньше 45");
        }
        else {
            System.out.println(mainClass.testErrorMessage("ОШИБКА! Возвращенное число больше 45 "));
        }
    }
}
