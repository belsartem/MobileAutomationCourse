import org.junit.Test;

public class MainClassTest extends MainClass {

        MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber() {

        int a = this.getLocalNumber(14);

        if (a == 14) {
            System.out.println("Число равно 14");
        }
        else {
            System.out.println(mainClass.testErrorMessage("ОШИБКА! Возвращенное число не равно " + mainClass.getLocalNumber(mainClass.getLocalNumber(14))));
        }
    }
}
