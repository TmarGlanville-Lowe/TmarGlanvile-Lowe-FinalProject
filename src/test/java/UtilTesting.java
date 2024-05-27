import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilTesting {
    @Test
    public void testTitleCase1(){
        String[] name = {"computer science"};
        String[] expectedResult = {"Computer Science"};
        String[] result = {"Computer Science"};

        Assertions.assertArrayEquals(expectedResult,result);
    }
    @Test
    public void testTitleCase2(){
        String[] name = {"programming"};
        String[] expectedResult = {"Programming"};
        String[] result = {"Programming"};

        Assertions.assertArrayEquals(expectedResult,result);
    }
    @Test
    public void testTitleCase3(){
        String[] name = {"tmar lowe"};
        String[] expectedResult = {"Tmar Lowe"};
        String[] result = {"Tmar Lowe"};

        Assertions.assertArrayEquals(expectedResult,result);
    }


}
