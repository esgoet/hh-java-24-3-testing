import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculationsTest {

    @Test
    public void addTest_when5and6_thenReturn11() {
        //GIVEN
        int a = 5;
        int b = 6;

        //WHEN
        int actual = SimpleCalculations.add(a, b);

        //THEN
        assertEquals(11, actual);
    }

    @Test
    public void isEvenTest_when4_thenReturnTrue() {
        //GIVEN
        int a = 4;

        //WHEN
        boolean actual = SimpleCalculations.isEven(a);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void isEvenTest_when3_thenReturnFalse() {
        //GIVEN
        int a = 3;

        //WHEN
        boolean actual = SimpleCalculations.isEven(a);

        //THEN
        assertFalse(actual);
    }


}