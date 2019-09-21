package by.iba;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

public class ReverseStringTest {

    private Reverser reverser;

    @Before
    public void init() {
        reverser = new Reverser();
    }

    @Test
    public void reverseEmptyString() {
        try {
            reverser.reverse("");
        }
        catch (Exception e) {
            assertThat(e, not(instanceOf(RuntimeException.class)));
        }
    }
    
    @Test
    public void reverseOneWord() {
        try {
            String string = "DestiNation";
            String expected = "noitaNitseD";
            String actual = reverser.reverse(string);
            assertEquals(expected, actual);
        }
        catch (Exception e) {
            fail("Method failed with exception");
        }
    }
    
    @Test
    public void reverseSentence() {
        try {
            String string = "Write once - Run anywhere";
            String expected = "erehwyna nuR - ecno etirW";
            String actual = reverser.reverse(string);
            assertEquals(expected, actual);
        }
        catch (Exception e) {
            fail("Method failed with exception");
        }
    }
    
    @Test
    public void reverseNull() {
        try {
            reverser.reverse(null);
        }
        catch (Exception e) {
            assertThat(e, not(instanceOf(RuntimeException.class)));
        }
    }
}
