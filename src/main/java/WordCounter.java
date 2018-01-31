import static java.util.Arrays.stream;

public class WordCounter {


    private static final String REGEX = " ";
    private final String sentence;

    public WordCounter(String sentence) {
        this.sentence = sentence;
    }

    public long count(String word) {
       return stream(sentence.split(REGEX)).filter(word::equals).count();
    }
}
