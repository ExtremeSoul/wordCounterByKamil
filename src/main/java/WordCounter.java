public class WordCounter {


    private final String sentence;

    public WordCounter(String sentence) {
        this.sentence = sentence;
    }

    public int count(String word) {
        int counter = 0;
        if (word.equals(sentence)) {

            counter++;
        }
        return counter;
    }
}
