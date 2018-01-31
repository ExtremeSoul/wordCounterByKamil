import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCounterTest {
    //private static final String SOME_SENTENCE = "Hello Hello everyone";
    //private static final String SOME_WORD = "some";
    private static final String EVERYONE_WORD = "everyone";
    private static final String HELLO_WORD = "Hello";
    //private static final String SMALL_HELLO_WORD = "hello";
    private static final int ZERO = 0;
    private static final int ONE = 1;
    //private static final int TWO = 2;

    @Test
    public void shouldReturnZeroWhenOneWordSentenceWithoutHelloGiven() {
        WordCounter wordCounter = new WordCounter(EVERYONE_WORD);
        long result = wordCounter.count(HELLO_WORD);
        assertEquals(ZERO, result);
    }

    @Test
    public void shouldReturnOneWhenSentenceWithOneHelloGiven() {
        WordCounter wordCounter = new WordCounter(HELLO_WORD);
        long result = wordCounter.count(HELLO_WORD);
        assertEquals(ONE, result);
    }

}
