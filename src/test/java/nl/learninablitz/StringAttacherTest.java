package nl.learninablitz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringAttacherTest {

    @Test
    public void testAttachStrings_normalScenario_expectedResult() {
        StringAttacher attacher = new StringAttacher();
        assertEquals("HelloWorld", attacher.attachStrings("Hello", "World"));
    }

    @Test
    public void testAttachStrings_emptyString_expectedResult() {
        StringAttacher attacher = new StringAttacher();
        assertEquals("Hello", attacher.attachStrings("Hello", ""));
    }

    @Test
    public void testAttachStrings_nullString_expectedResult() {
        StringAttacher attacher = new StringAttacher();
        assertEquals("Hello", attacher.attachStrings("Hello", null));
    }

    @Test
    public void testAttachStrings_bothNullStrings_expectedResult() {
        StringAttacher attacher = new StringAttacher();
        assertEquals("", attacher.attachStrings(null, null));
    }

    @Test
    public void testAttachStrings_specialCharacters_expectedResult() {
        StringAttacher attacher = new StringAttacher();
        assertEquals("Hello@World", attacher.attachStrings("Hello", "@World"));
    }
}
