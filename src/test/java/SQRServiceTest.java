import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,200,300",
            "6,200,400"
    })
    public void shouldNumberSQR(int expected, int sqrmin, int sqrmax) {
        SQRService service = new SQRService();
        //int expected = 3;
        int actual = service.calcSQR(sqrmin, sqrmax);
        Assertions.assertEquals(expected, actual);


    }
}
