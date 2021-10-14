import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotationTest {

    @Test
    void checkRotation() {
        //assign
        Boolean expected = true;
        //act
        Boolean actual = Rotation.checkRotation("dabc", "abcd");

        //assert
        assertEquals(expected, actual);
    }
}