package es.ulpgc.dis.kataDisarium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class disariumParametrizedTest {
    private boolean expected;
    private int number;

    @Parameters(name = "{index}, expected: {0}, number: {1}")
    public static Iterable data(){
       return Arrays.asList(new Object[][] {
               {true,89},{false,200},{true,135}
       }) ;
    }

    public disariumParametrizedTest(boolean expected, int number) {
        this.expected = expected;
        this.number = number;
    }

    @Test
    public void test_isDisarium(){
        Disarium disarium = new Disarium();

        assertEquals(this.expected,disarium.isDisarium(this.number));
    }
}
