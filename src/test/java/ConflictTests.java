import org.testng.Assert;
import org.testng.annotations.Test;

public class ConflictTests {
    @Test
    public void test1(){
        int a=5;
        int b=10;
        int sum= (a+b);
        System.out.println("sum: "+(a+b));

    }
    @Test
    public void test2(){
        String message="Welcome to Usa, new oportunities";
        Assert.assertTrue(message.contains("Usa"));
        //src/test/java/ConflictTests.java
    }
}
