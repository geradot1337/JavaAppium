public class MainClassTest extends MainClass
{
    public void testGetLocalNumber()
    {
        int b = this.getLocalNumber();
       if (b == 14) {
           System.out.println("Успешно");
       } else
       {
           System.out.println("Не успешно");
       }
    }
}
