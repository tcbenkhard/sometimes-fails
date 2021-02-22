import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FailsMostOfTheTime {

    @Test
    public void shouldAlwaysFail() {
        assertTrue(false);
    }

    @Test
    public void shouldFailMostOfTheTime() {
        int number = (int) (Math.random() * 4) + 1;
        assertTrue(number == 4);
    }
}
