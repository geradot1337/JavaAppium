import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
@Test
    public void testGetClassString()
    {

       Assert.assertTrue("Ошибка! Строка не содержит 'hello' или 'Hello'",this.getClassString().toLowerCase().contains("hello"));

    }
}
