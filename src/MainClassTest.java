import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        int a = this.getClassNumber();
       if (a>45)
       {
           System.out.println("Метод getClassNumber вовзращает больше 45");
       } else {
           System.out.println("Метод getClassNumber возвращает меньше 45");
       }
    }
}
