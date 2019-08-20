import com.company.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyMathTest {
    MyMath myMath = new MyMath();

    @Test
    void sum_withThreeNumber() {
        int sum = myMath.sum(new int[] { 1, 2, 3 });
        assertEquals(6, sum);
    }

    @Test
    void sum_withOneNumber() {
        int sum = myMath.sum(new int[] { 1 });
        assertEquals(1, sum);
    }

}
