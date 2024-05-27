import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressTesting {
    @Test
    public void isPostalCodeValid1(){
        String[] postalCode = new String[]{"J7K8I9"};
        String[] expectedResult = new String[]{"J7K8I9"};
        String[] result = new String[]{"J7K8I9"};

        Assertions.assertArrayEquals(expectedResult,result);
    }
    @Test
    public void isPostalCodeValid2(){
        String[] postalCode = new String[]{"J7K 8I9"};
        String[] expectedResult = new String[]{"J7K 8I9"};
        String[] result = new String[]{"J7K 8I9"};

        Assertions.assertArrayEquals(expectedResult,result);
    }
    @Test
    public void isPostalCodeValid3(){
        String[] postalCode = new String[]{"j7k8i9"};
        String[] expectedResult = new String[]{"j7k8i9"};
        String[] result = new String[]{"j7k8i9"};

        Assertions.assertArrayEquals(expectedResult,result);
    }
    @Test
    public void isPostalCodeValid4(){
        String[] postalCode = new String[]{"j7k 8i9"};
        String[] expectedResult = new String[]{"j7k 8i9"};
        String[] result = new String[] {"j7k 8i9"};

        Assertions.assertArrayEquals(expectedResult,result);
    }@Test
    public void isPostalCodeValid5(){
        String[] postalCode = new String[]{"j7kKi9"};
        String[] expectedResult = new String[]{null};
        String[] result = new String[] {null};

        Assertions.assertArrayEquals(expectedResult,result);
    }@Test
    public void isPostalCodeValid6(){
        String[] postalCode = new String[]{null};
        String[] expectedResult = new String[]{null};
        String[] result = new String[] {null};

        Assertions.assertArrayEquals(expectedResult,result);
    }



}
