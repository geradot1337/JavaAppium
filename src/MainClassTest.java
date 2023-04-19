import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        int b = this.getLocalNumber();
       if (b == 14) {
           System.out.println("Метод getLoacalNumber выводит число 14");
       } else
       {
           System.out.println("Метод getLocalNumber не выводит число 14");
       }
    }
}
