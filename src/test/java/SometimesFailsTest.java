import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class SometimesFailsTest {

    @Test
    public void shouldFailHalfOfTheTime() {
        int number = (int) (Math.random() * 10) + 1;
        assertTrue(number <= 5);
    }

    @Test
    public void shouldFail1OutOf4Times() {
        int number = (int) (Math.random() * 4) + 1;
        assertTrue(number < 4);
    }
}
