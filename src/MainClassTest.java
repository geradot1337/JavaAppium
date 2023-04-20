import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
@Test
    public void testGetClassString()
    {
        Assert.assertTrue("Ошибка! Строка не содержит 'Hello'",this.getClassString().contains("Hello"));
        Assert.assertTrue("Ошибка! Строка не содержит 'hello'",this.getClassString().contains("hello"));

    }
}
