import org.junit.Test;
public class MainTest extends CoreTestCase
{
    @Override
    public void typeStartMesage() {
        
        System.out.println("Current class is MainTest");
    }

    @Test
    public void myFirstTest()
{
    this.typeStartMesage();
}

    @Test
    public void mySecondTest()
    {
        this.typeStartMesage();
    }

}
