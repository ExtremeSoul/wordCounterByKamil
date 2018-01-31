import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCounterTest {
    private static final int ZERO = 0;

    @Test
    public void shouldReturnZeroWhenOneWordSentenceWithoutHelloGiven() {
        WordCounter wordCounter = new WordCounter("Great World");
        long result = wordCounter.count("Hello");
        assertEquals(ZERO, result);
    }

}
