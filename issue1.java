import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class issue1 {
    @Test
    public void testCalculateAverage() {
        int[] numbers = {10, 20, 30, 40, 50};
        double result = Main.calculateAverage(numbers);
        assertEquals(30.0, result);
    }
}
