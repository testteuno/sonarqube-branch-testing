package nl.quintor.sonarqubebranchtest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {

    @Test
    public void testMain() {
        assertDoesNotThrow(() -> Application.main(new String[0]));
    }

    @Test
    public void givenEmptyArray_whenApplicationRun_thenShouldExitNormally() {
        Application application = new Application();

        assertDoesNotThrow(() -> application.run(new String[0]));
    }

    @Test
    public void givenFilledArray_whenApplicationRun_thenShouldExitNormally() {
        Application application = new Application();

        assertDoesNotThrow(() -> application.run(new String[]{"item"}));
    }

    @Test
    public void givenEmptyArray_whenIsArrayEmpty_thenReturnsTrue() {
        Application application = new Application();

        assertTrue(application.isArrayEmpty(new String[0]));
    }

    @Test
    public void givenFilledArray_whenIsArrayEmpty_thenReturnsFalse() {
        Application application = new Application();

        assertFalse(application.isArrayEmpty(new String[]{"item"}));
    }
}